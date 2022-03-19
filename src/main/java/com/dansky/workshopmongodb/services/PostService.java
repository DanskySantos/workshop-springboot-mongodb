package com.dansky.workshopmongodb.services;

import com.dansky.workshopmongodb.domain.Post;
import com.dansky.workshopmongodb.domain.User;
import com.dansky.workshopmongodb.repository.PostRepository;
import com.dansky.workshopmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post findById(String id) {
        Optional<Post> post = postRepository.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
    }
}
