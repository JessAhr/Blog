package com.system.Blog.model;

import jakarta.persistence.*;

@Entity
public class Posteo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;



    public Posteo() {
    }
    public Posteo(Long id, String titulo, Author author) {

        this.id = id;
        this.titulo = titulo;
        this.author = author;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Author getAuthor() {return author;}
    public void setAuthor(String autor) {
        this.author = author;
    }


}
