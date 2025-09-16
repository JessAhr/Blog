package com.system.Blog.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

    @Entity
    public class Comment {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false, columnDefinition = "TEXT")
        private String text;

        @Column(nullable = false)
        private LocalDateTime createdAt;

        // Relación: muchos comentarios pertenecen a un post
        @ManyToOne
        @JoinColumn(name = "posteo_id", nullable = false)
        private Posteo posteo;


        public Comment() {}

        public Comment(String text, Posteo posteo) {
            this.text = text;
            this.posteo = posteo;
            this.createdAt = LocalDateTime.now();
        }


        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public String getText() { return text; }
        public void setText(String text) { this.text = text; }

        public LocalDateTime getCreatedAt() { return createdAt; }
        public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

        public Posteo getPosteo() { return posteo; }
        public void setPosteo(Posteo posteo) { this.posteo = posteo; }


}
