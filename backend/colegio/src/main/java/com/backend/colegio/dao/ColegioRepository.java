package com.backend.colegio.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.backend.colegio.model.Colegio;

public interface ColegioRepository extends JpaRepository<Colegio, Integer>{

}
