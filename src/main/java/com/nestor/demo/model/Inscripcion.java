package com.nestor.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="inscripcion")
public class Inscripcion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id_inscripcion;
	//
	private int calificacion;
	private int asistencia;
	
	@ManyToOne
	@JoinColumn(name="id_course")
	private Curso idcurso;
	
	@ManyToOne
	@JoinColumn(name="id_alumno")
	private Alumno idalumno;
	
	public Inscripcion() {
		
	}

	public Inscripcion(long id_inscripcion, int calificacion, int asistencia, Curso idcurso, Alumno idalumno) {
		super();
		this.id_inscripcion = id_inscripcion;
		this.calificacion = calificacion;
		this.asistencia = asistencia;
		this.idcurso = idcurso;
		this.idalumno = idalumno;
	}
	
	


	public Inscripcion(int calificacion, int asistencia, Curso idcurso, Alumno idalumno) {
		
		this.calificacion = calificacion;
		this.asistencia = asistencia;
		this.idcurso = idcurso;
		this.idalumno = idalumno;
	}

	public long getId_inscripcion() {
		return id_inscripcion;
	}
	public void setId_inscripcion(long id_inscripcion) {
		this.id_inscripcion = id_inscripcion;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	public int getAsistencia() {
		return asistencia;
	}
	public void setAsistencia(int asistencia) {
		this.asistencia = asistencia;
	}
	public Curso getIdcurso() {
		return idcurso;
	}
	
	public void setIdcurso(Curso idcurso) {
		this.idcurso = idcurso;
	}
	
	public Alumno getIdalumno() {
		return idalumno;
	}
	
	public void setIdalumno(Alumno idalumno) {
		this.idalumno = idalumno;
	}
}
