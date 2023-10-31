package com.springboot.myapp.repository;

import com.springboot.myapp.model.Comment;
import com.springboot.myapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPostedByUser(User user);
}
