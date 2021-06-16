package com.backend.colegio.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.backend.colegio.dao.ProfesorRepository;
import com.backend.colegio.model.Profesor;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge=3600)
public class ProfesorController {
	
	@Autowired
	private ProfesorRepository repository;
	
	
	@GetMapping("/profesores")
	public List<Profesor> getAll(){
		return repository.findAll();
	}
	
	@GetMapping("/profesores/{id}")
	public Optional<Profesor> getById(@PathVariable int id){
		return repository.findById(id);
	}
	
	

}
