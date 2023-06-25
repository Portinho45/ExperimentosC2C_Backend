package pe.edu.upc.connection2connection.services;
import pe.edu.upc.connection2connection.entities.Carreras_Estudiante;

import java.util.List;

public interface ICarreras_EstudianteService {


    public void insertar(Carreras_Estudiante carreras_estudiante);

    List<Carreras_Estudiante> listar();

}
