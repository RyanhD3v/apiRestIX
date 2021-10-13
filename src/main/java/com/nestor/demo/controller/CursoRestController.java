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

import com.nestor.demo.model.Curso;
import com.nestor.demo.repository.CursoRepository;

@RestController
@RequestMapping("/api")
public class CursoRestController {
	
	@Autowired
	CursoRepository cursoRepo;
	
	// Get All Cursos
    // URL: http://localhost:8080/api/cursos
    @GetMapping("/cursos")
    public List<Curso> getAllCursos() {
        return cursoRepo.findAll();
    }
    
    // Create a new Curso
    // URL: http://localhost:8080/api/curso 
    @PostMapping("/curso")
    public Curso createCurso(@Valid @RequestBody Curso curso) {
        return cursoRepo.save(curso);
    }
    
    //Update Curso
    // URL: http://localhost:8080/api/curso/1
    @PutMapping("/curso/{id_curso}")
    public Curso updateCurso(@PathVariable(value = "id_curso") Long id_curso, @Valid @RequestBody Curso curso) {
		Curso course = cursoRepo.findById(id_curso).orElse(null);
    	
		course.setNombre(curso.getNombre());
		course.setDescription(curso.getDescription());
		course.setStatus(curso.isStatus());
		
    	Curso updated = cursoRepo.save(course);
    	return updated;
    	
    }
    
    //Delete Curso
    //URL: http://localhost:8080/api/curso/1
    @DeleteMapping("/curso/{id_curso}")
    public ResponseEntity<?> deleteCurso(@PathVariable(value = "id_curso") Long id_curso) {
		
    	Curso note = cursoRepo.findById(id_curso).orElse(null);
		
    	cursoRepo.delete(note);
    	return ResponseEntity.ok().build();
    	
    }
}
