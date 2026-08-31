package com.matheus.workshopmongo.services;

import com.matheus.workshopmongo.domain.Post;
import com.matheus.workshopmongo.repository.PostRepository;
import com.matheus.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

    public List<Post> findByTitle(String title) {
        return repo.findByTitleContainingIgnoreCase(title);
    }
}
