package com.springboot.myapp.service;

import com.springboot.myapp.model.Comment;
import com.springboot.myapp.model.User;
import com.springboot.myapp.repository.CommentRepository;
import com.springboot.myapp.repository.UserRepository;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
@Service
public class CommentServiceImplementation implements CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public String addComment(Comment comment) {
        // Implement your validation and database logic for adding comments
        // Ensure validation, date-time, and other logic are correctly implemented

        // Example validation
        if (comment.getMessage() == null || comment.getMessage().isEmpty()) {
            return "Invalid Request: Message is required.";
        }

        // Set the comment date-time
        comment.setCommentDateTime(LocalDateTime.now());

        // Find the user to whom the comment is directed
        User commentToUser = userRepository.findByCommentTo(comment.getPostedByUser().getCommentTo());

        if (commentToUser == null) {
            // User not found, create the user and add the comment
            userRepository.save(comment.getPostedByUser());
        }

        // Save the comment
        commentRepository.save(comment);

        return "Comment added successfully";
    }

    @Override
    @Transactional
    public List<Comment> getComments(String commentTo) {
        // Implement your logic to retrieve comments for the specified user
        // Ensure validation, date-time, and other logic are correctly implemented

        // Find the user for whom comments are requested
        User user = userRepository.findByCommentTo(commentTo);

        if (user == null) {
            return Collections.emptyList(); // User not found, return an empty list
        }

        // Retrieve comments for the specified user
        List<Comment> comments = commentRepository.findByPostedByUser(user);

        return comments;
    }

    @Override
    public List<Comment> getAllComments() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllComments'");
    }
}

