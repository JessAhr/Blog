package com.system.Blog.service;

import com.system.Blog.model.Comment;
import com.system.Blog.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

    @Service
    public class CommentService {

        private final CommentRepository commentRepository;

        public CommentService(CommentRepository commentRepository) {
            this.commentRepository = commentRepository;
        }

        public List<Comment> findAll() {
            return commentRepository.findAll();
        }

        public Optional<Comment> findById(Long id) {
            return commentRepository.findById(id);
        }

        public Comment save(Comment comment) {
            return commentRepository.save(comment);
        }

        public void delete(Long id) {
            commentRepository.deleteById(id);
        }
    }


