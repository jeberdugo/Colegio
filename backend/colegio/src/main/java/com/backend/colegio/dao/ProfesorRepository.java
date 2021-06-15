package com.backend.colegio.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.colegio.model.Profesor;

public interface ProfesorRepository extends JpaRepository<Profesor, Integer>{

}
