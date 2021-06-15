package com.backend.colegio.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.backend.colegio.model.Asignatura;
import com.backend.colegio.model.Profesor;

public interface AsignaturaRepository extends JpaRepository<Asignatura, Integer>{

	
	List<Asignatura> findByProfesor_Id(int profesorId);

}
