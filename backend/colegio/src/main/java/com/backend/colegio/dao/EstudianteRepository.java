package com.backend.colegio.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.backend.colegio.model.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer>{

}
