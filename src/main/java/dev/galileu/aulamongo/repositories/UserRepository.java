package dev.galileu.aulamongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.galileu.aulamongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
