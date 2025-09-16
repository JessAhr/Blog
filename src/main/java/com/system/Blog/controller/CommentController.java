package com.system.Blog.controller;

import com.system.Blog.model.Comment;
import com.system.Blog.service.CommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/comments")
    public class CommentController {

        private final CommentService commentService;

        public CommentController(CommentService commentService) {
            this.commentService = commentService;
        }

        @GetMapping
        public List<Comment> getAllComments() {
            return commentService.findAll();
        }

        @GetMapping("/{id}")
        public ResponseEntity<Comment> getCommentById(@PathVariable Long id) {
            return commentService.findById(id)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
        }

        @PostMapping
        public Comment createComment(@RequestBody Comment comment) {
            return commentService.save(comment);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteComment(@PathVariable Long id) {
            commentService.delete(id);
            return ResponseEntity.noContent().build();
        }
    }


