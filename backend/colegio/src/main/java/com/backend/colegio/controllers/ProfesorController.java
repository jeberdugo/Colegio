package com.backend.colegio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.colegio.dao.ProfesorRepository;
import com.backend.colegio.model.Profesor;

@RestController
public class ProfesorController {
	
	@Autowired
	private ProfesorRepository repository;
	
	@GetMapping("/profesores")
	public List<Profesor> getAll(){
		return repository.findAll();
	}
	
	

}
