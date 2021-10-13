package com.nestor.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nestor.demo.model.Alumno;
import com.nestor.demo.repository.AlumnoRepository;

@RestController
@RequestMapping("/api")
public class AlumnoRestController {

	@Autowired
	AlumnoRepository alumnoRepo;
	
	
	// Get All Alumnos
    // URL: http://localhost:8080/api/alumnos
    @GetMapping("/alumnos")
    public List<Alumno> getAllAlumnos() {
        return alumnoRepo.findAll();
    }
    
    // Create a new Alumno
    // URL: http://localhost:8080/api/alumnos 
    @PostMapping("/alumno")
    public Alumno createAlumno(@Valid @RequestBody Alumno alumno) {
        return alumnoRepo.save(alumno);
    }
    
    //Update Alumno
    // URL: http://localhost:8080/api/alumno/1
    @PutMapping("/alumno/{id_alumno}")
    public Alumno updateAlumno(@PathVariable(value = "id_alumno") Long id_alumno, @Valid @RequestBody Alumno alumno) {
		Alumno alumn = alumnoRepo.findById(id_alumno).orElse(null);
    	
		alumn.setEmail(alumno.getEmail());
		alumn.setEstatus(alumno.isEstatus());
		alumn.setNombre(alumno.getNombre());
		
    	Alumno updated = alumnoRepo.save(alumn);
    	return updated;
    	
    }
    
    //Delete Alumno
    //URL: http://localhost:8080/api/alumno/1
    @DeleteMapping("/alumno/{id_alumno}")
    public ResponseEntity<?> deleteAlumno(@PathVariable(value = "id_alumno") Long id_alumno) {
		
    	Alumno note = alumnoRepo.findById(id_alumno).orElse(null);
		
    	alumnoRepo.delete(note);
    	return ResponseEntity.ok().build();
    	
    }
}
