package com.system.Blog.repository;

import com.system.Blog.model.Posteo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IposteoRepository extends JpaRepository <Posteo,Long> {
    void delete(Long id);
    void update(Posteo posteo);
//    List<Posteo> findAll();
//    Posteo findById(Long id);
//    void save(Posteo posteo);
//    void delete(Long id);
//    void update(Posteo posteo);

}
