package com.backend.colegio.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Colegio {

	@Id
	@GeneratedValue
	private int id;
	
	private String nombre;
	
	@OneToMany(mappedBy = "colegio")
	private List<Curso> cursos;

	public Colegio(int id, String nombre, List<Curso> cursos) {
		this.id = id;
		this.nombre = nombre;
		this.cursos = cursos;
	}

	public Colegio() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}


	public String toString() {
		return "Colegio [id=" + id + ", nombre=" + nombre + ", cursos=" + cursos + "]";
	}

	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cursos == null) ? 0 : cursos.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Colegio other = (Colegio) obj;
		if (cursos == null) {
			if (other.cursos != null)
				return false;
		} else if (!cursos.equals(other.cursos))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
		
	
	
	
	
	
}
