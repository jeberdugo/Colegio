package com.backend.colegio.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Profesor {
	@Id
	@GeneratedValue
	private int id;
	
	private String nombre;

	@OneToMany(mappedBy = "profesor")
	@JsonBackReference
	private List<Asignatura> asignaturas;

	public Profesor(int id, String nombre, List<Asignatura> asignaturas) {
		this.id = id;
		this.nombre = nombre;
		this.asignaturas = asignaturas;
	}

	public Profesor() {

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

	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}


	public String toString() {
		return "Profesor [id=" + id + ", nombre=" + nombre + ", asignaturas=" + asignaturas + "]";
	}


	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((asignaturas == null) ? 0 : asignaturas.hashCode());
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
		Profesor other = (Profesor) obj;
		if (asignaturas == null) {
			if (other.asignaturas != null)
				return false;
		} else if (!asignaturas.equals(other.asignaturas))
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
