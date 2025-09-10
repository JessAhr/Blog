package com.system.Blog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posteos")
public class PosteoController {
    private PosteoService posteoService;

    public PosteoController(PosteoService posteoService) {
        this.posteoService = posteoService;
    }

    @GetMapping
    public List<Posteo> listaPosteos() {
        return posteoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Posteo obtenerPorId(@PathVariable Long id) {
        return posteoService.obtenerId(id);
    }

    @PostMapping("/crear")
    public ResponseEntity<String> guardarPersona(@RequestBody Posteo posteo) {
        posteoService.guardarPosteo(posteo);
        return ResponseEntity.ok("Persona agregada con éxito");
    }
}