package com.nestor.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="curso")
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_course;
	//@Column(name = "nombre_columna")EXAMPLE: Por si se desea que la columna se llame de otra forma
	private String nombre;
	private String description;
	private boolean status;
	
	
	public Curso() {
		
	}
	
	
	
	public Curso(long id_course, String nombre, String description, boolean status) {
		super();
		this.id_course = id_course;
		this.nombre = nombre;
		this.description = description;
		this.status = status;
	}



	public long getId_course() {
		return id_course;
	}
	public void setId_course(long id_course) {
		this.id_course = id_course;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
