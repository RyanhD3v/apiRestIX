# apiRestIX
prueba técnica 

REST Spring Boot + SQLSERVER OR MYSQL

INSTRUCTIONS

EXECUTE THE NEXT QUERY FOR CRATE THE DATABASE IN SQL-SERVER. THE TABLES ARE CREATED BY JPA + HIBERNATE SO YOU JUST NEED TO CREATE THE DATABASE NOTE: IT IS NECESSARY TO MODIFY THE FILE -> application.properties WITH YOUR SQL CREDENTIALS

CREATE DATABASE Institute GO


Routes Alumnos--------------------------------------------------------------

Get http://localhost:8080/api/alumnos

Post http://localhost:8080/api/alumno Example JSON: {
    "email":"carlos@dominio.com",
    "estatus":true,
    "nombre":"Carlos Perez"
}

Put http://localhost:8080/api/alumno/1 Example JSONUpdate: {
    "email":"juanito@dominio.com",
    "estatus":true,
    "nombre":"Juanito Perez"
}

Delete http://localhost:8080/api/alumno/1


Routes Cursos----------------------------------------------------------------

Get http://localhost:8080/api/cursos

Post http://localhost:8080/api/curso Example JSON: {
    "nombre":"NuevoCurso",
    "description":"aqui va la descripcion del curso",
    "status":true
} 

Put http://localhost:8080/api/curso/3 Example JSON: {
    "nombre":"CURSO_NOMBRE_ACTUALIZADO",
    "description":"aqui va la descripcion del curso modificada",
    "estatus":true
}

Delete http://localhost:8080/api/curso/4

Routes Inscripciones-------------------------------------------------------

Get http://localhost:8080/api/inscripciones

Post http://localhost:8080/api/inscripcion Example JSON: {
    "asistencia":0,
    "calificacion":0,
    "id_alumno":10,
    "id_curso":15

}

Put http://localhost:8080/api/inscripcion/{id_inscripcion} Example JSON: 


Delete http://localhost:8080/api/inscripcion/{id_inscripcion}
