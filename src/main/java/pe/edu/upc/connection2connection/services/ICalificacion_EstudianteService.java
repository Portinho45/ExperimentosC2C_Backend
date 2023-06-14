package pe.edu.upc.connection2connection.services;

import pe.edu.upc.connection2connection.entities.Calificacion_Estudiante;

import java.util.List;

public interface ICalificacion_EstudianteService {

    public void insertar(Calificacion_Estudiante calificacion_estudiante);

    List<Calificacion_Estudiante> listar();

}
