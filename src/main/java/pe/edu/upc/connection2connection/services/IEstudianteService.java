package pe.edu.upc.connection2connection.services;

import pe.edu.upc.connection2connection.entities.Empresa;
import pe.edu.upc.connection2connection.entities.Estudiante;

import java.util.List;

public interface IEstudianteService {
    public void insertar(Estudiante estudiante);

    List<Estudiante> listar();

    public void delete(int id);

    public Estudiante ListId(int id);

}
