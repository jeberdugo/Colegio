package com.backend.colegio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.backend.colegio.dao.AsignaturaRepository;
import com.backend.colegio.model.Asignatura;


public class AsignaturaController {
	
	@Autowired
	private AsignaturaRepository repository;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/asignaturas/{profesor_Id}")
	public List<Asignatura> getAsignaturasByProfesor_Id(@PathVariable int profesor_Id){
		return repository.findByProfesor_Id(profesor_Id);
	}

}
