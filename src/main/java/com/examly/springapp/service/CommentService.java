package com.examly.springapp.service;

import com.examly.springapp.model.Comment;
import java.util.List;
import java.util.Optional;

public interface CommentService {
    Comment saveComment(Comment comment);
    List<Comment> getAllComments();
    Optional<Comment> getCommentById(Long id);
    Comment updateComment(Long id, Comment comment);
    void deleteComment(Long id);
}
