package com.dansky.workshopmongodb.resources;

import com.dansky.workshopmongodb.domain.Post;
import com.dansky.workshopmongodb.domain.User;
import com.dansky.workshopmongodb.dto.AuthorDTO;
import com.dansky.workshopmongodb.dto.UserDTO;
import com.dansky.workshopmongodb.resources.util.URL;
import com.dansky.workshopmongodb.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

    @Autowired
    private PostService postService;

    @GetMapping(value = "{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post post = postService.findById(id);
        return ResponseEntity.ok().body(post);
    }

    @GetMapping(value = "titlesearch")
    public ResponseEntity<List<Post>> findByTitle(@RequestParam(value = "text", defaultValue = "") String text) {
        text = URL.decodeParam(text);
        List<Post> list = postService.findByTitle(text);
        return ResponseEntity.ok().body(list);
    }
}
