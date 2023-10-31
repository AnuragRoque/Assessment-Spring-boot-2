package com.springboot.myapp.controller;

import com.springboot.myapp.model.Comment;
import com.springboot.myapp.service.CommentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping("/add")
    public ResponseEntity<String> addComment(@RequestBody Comment comment) {
        String response = commentService.addComment(comment);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/get")
    public ResponseEntity<List<Comment>> getComments(@RequestParam String commentTo) {
        
        List<Comment> comments = commentService.getComments(commentTo);
        return ResponseEntity.ok(comments);
    }
    
}
