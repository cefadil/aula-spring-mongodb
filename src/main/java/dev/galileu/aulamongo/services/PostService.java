package dev.galileu.aulamongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.galileu.aulamongo.domain.Post;
import dev.galileu.aulamongo.repositories.PostRepository;
import dev.galileu.aulamongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
    @Autowired
    private PostRepository repo;
    
    public Post findById(String id) { 
        Post post = repo.findById(id).orElse(null);
        if (post == null) {
            throw new ObjectNotFoundException("Objeto não encontrado");
        }
        return repo.findById(id).get();
    }

    public List<Post> findByTitle(String text) {
        return repo.findByTitleContainingIgnoreCase(text);
    }

}
