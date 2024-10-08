package dev.galileu.aulamongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.galileu.aulamongo.domain.User;
import dev.galileu.aulamongo.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;
    public List<User> findAll() {
        return repo.findAll();

    }

}
