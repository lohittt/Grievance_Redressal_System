package com.examly.springapp.service;

import com.examly.springapp.model.Comment;
import com.examly.springapp.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService {
    
    @Autowired
    private CommentRepository commentRepository;
    
    @Override
    public Comment saveComment(Comment comment) {
        return commentRepository.save(comment);
    }
    
    @Override
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }
    
    @Override
    public Optional<Comment> getCommentById(Long id) {
        return commentRepository.findById(id);
    }
    
    @Override
    public Comment updateComment(Long id, Comment comment) {
        if (commentRepository.existsById(id)) {
            comment.setCommentId(id);
            return commentRepository.save(comment);
        }
        return null;
    }
    
    @Override
    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }
}
