package com.backend.colegio.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Curso {

	@Id
	@GeneratedValue
	private int id;
	
	private int grado;
	
	private String salon;
	
	@OneToMany(mappedBy = "curso")
	private List<Asignatura> asignaturas;
	
	@ManyToOne
	private Colegio colegio;

	public Curso(int id, int grado, String salon, List<Asignatura> asignaturas, Colegio colegio) {
		this.id = id;
		this.grado = grado;
		this.salon = salon;
		this.asignaturas = asignaturas;
		this.colegio = colegio;
	}

	public Curso() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGrado() {
		return grado;
	}

	public void setGrado(int grado) {
		this.grado = grado;
	}

	public String getSalon() {
		return salon;
	}

	public void setSalon(String salon) {
		this.salon = salon;
	}

	public List<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(List<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}

	public Colegio getColegio() {
		return colegio;
	}

	public void setColegio(Colegio colegio) {
		this.colegio = colegio;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", grado=" + grado + ", salon=" + salon + ", asignaturas=" + asignaturas
				+ ", colegio=" + colegio + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((asignaturas == null) ? 0 : asignaturas.hashCode());
		result = prime * result + ((colegio == null) ? 0 : colegio.hashCode());
		result = prime * result + grado;
		result = prime * result + id;
		result = prime * result + ((salon == null) ? 0 : salon.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (asignaturas == null) {
			if (other.asignaturas != null)
				return false;
		} else if (!asignaturas.equals(other.asignaturas))
			return false;
		if (colegio == null) {
			if (other.colegio != null)
				return false;
		} else if (!colegio.equals(other.colegio))
			return false;
		if (grado != other.grado)
			return false;
		if (id != other.id)
			return false;
		if (salon == null) {
			if (other.salon != null)
				return false;
		} else if (!salon.equals(other.salon))
			return false;
		return true;
	}
	
	
	
	
	
	
	
}
