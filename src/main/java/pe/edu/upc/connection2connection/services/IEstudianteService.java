package pe.edu.upc.connection2connection.services;

import pe.edu.upc.connection2connection.dtos.*;
import pe.edu.upc.connection2connection.entities.Empresa;
import pe.edu.upc.connection2connection.entities.Estudiante;

import java.util.List;

public interface IEstudianteService {
    public void insertar(Estudiante estudiante);

    List<Estudiante> listar();

    public void delete(int id);

    public Estudiante ListId(int id);

    public List<EstudianteEdadDTO> reporte03();
    public List<EstudianteEdadPromedioDTO> reporte04();
    public List<EstudiantePracticasDTO> reporte05();
    public List<EstudianteSemestreDTO> reporte06();
    public List<InstitucionEstudianteDTO> reporte07();

}
