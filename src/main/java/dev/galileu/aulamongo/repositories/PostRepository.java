package dev.galileu.aulamongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import dev.galileu.aulamongo.domain.Post;
    
@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
