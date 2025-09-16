package com.system.Blog.service;

import com.system.Blog.model.Posteo;
import java.util.List;
import java.util.Optional;

public interface IservicePosteo {
    List<Posteo> obtenerTodos();
    Optional<Posteo> obtenerPorId(Long id);
    void guardarPosteo(Posteo posteo);
    void eliminarPosteo(Long id);
    void actualizarPosteo(Posteo posteo);

}