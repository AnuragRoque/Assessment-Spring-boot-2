package com.springboot.myapp.service;

import com.springboot.myapp.model.Comment;
// import com.springboot.myapp.model.User;

import java.util.List;

public interface CommentService {
    String addComment(Comment comment);
    List<Comment> getComments(String commentTo);
    List<Comment> getAllComments();
    
}
