package com.nestor.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alumno")
public class Alumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_alumno;
	//@Column(name = "nombre_columna")EXAMPLE: Por si se desea que la columna se llame de otra forma
	private String nombre;
	private String email;
	private boolean estatus;
	
	
	
	public Alumno() {
		
	}
	
	
	
	public Alumno(long id_alumno, String nombre, String email, boolean estatus) {
		super();
		this.id_alumno = id_alumno;
		this.nombre = nombre;
		this.email = email;
		this.estatus = estatus;
	}



	public long getId_alumno() {
		return id_alumno;
	}
	public void setId_alumno(long id_alumno) {
		this.id_alumno = id_alumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isEstatus() {
		return estatus;
	}
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	

}
