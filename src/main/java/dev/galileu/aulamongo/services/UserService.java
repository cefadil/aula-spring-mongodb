package dev.galileu.aulamongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.galileu.aulamongo.domain.User;
import dev.galileu.aulamongo.repositories.UserRepository;
import dev.galileu.aulamongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;
    public List<User> findAll() {
        return repo.findAll();

    }

    public User findById(String id) {
        User user = repo.findById(id).orElse(null);
        if (user == null) {
            throw new ObjectNotFoundException("Objeto não encontrado");
        }
        return repo.findById(id).get();

    }

}
