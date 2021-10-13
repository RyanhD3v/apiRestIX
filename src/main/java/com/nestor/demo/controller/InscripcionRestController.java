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

import com.nestor.demo.model.Inscripcion;
import com.nestor.demo.repository.InscripcionRepository;

@RestController
@RequestMapping("/api")
public class InscripcionRestController {

	@Autowired
	InscripcionRepository insRepo;
	
	//Get All Inscripciones
	//URL: http://localhost:8080/api/inscripciones
	@GetMapping("/inscripciones")
	public List<Inscripcion> getAllInscripcion(){
		return insRepo.findAll();
	}
	
	
	// Create a new Inscripcion
    // URL: http://localhost:8080/api/inscripcion 
	@PostMapping("/inscripcion")
	public Inscripcion createNewInscripcion(@Valid @RequestBody Inscripcion inscripcion) {
		return insRepo.save(inscripcion);	
	}
	
	//Update Calificacion
    // URL: http://localhost:8080/api/inscripcion/1
    @PutMapping("/inscripcion/{id_inscripcion}")
    public Inscripcion updateIns(@PathVariable(value = "id_inscripcion") Long id_inscripcion, @Valid @RequestBody Inscripcion inscripcion) {
		Inscripcion ins = insRepo.findById(id_inscripcion).orElse(null);
    	
		ins.setAsistencia(inscripcion.getAsistencia());
		ins.setCalificacion(inscripcion.getCalificacion());
		
		
    	Inscripcion updated = insRepo.save(ins);
    	return updated;
    	
    }
    
    //Delete Inscripcion
    //URL: http://localhost:8080/api/inscripcion/1
    @DeleteMapping("/inscripcion/{id_inscripcion}")
    public ResponseEntity<?> deleteIns(@PathVariable(value = "id_inscripcion") Long id_inscripcion) {
		
    	Inscripcion note = insRepo.findById(id_inscripcion).orElse(null);
		
    	insRepo.delete(note);
    	return ResponseEntity.ok().build();
    	
    }
	
	
}
