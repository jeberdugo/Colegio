package com.backend.colegio.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.backend.colegio.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
