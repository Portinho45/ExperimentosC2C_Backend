package pe.edu.upc.connection2connection.services;

import pe.edu.upc.connection2connection.dtos.RepositorioEstudianteDTO;
import pe.edu.upc.connection2connection.entities.Repositorio;

import java.util.List;

public interface IRepositorioService {
    public void insert(Repositorio repositorio);

    List<Repositorio> list();

    public void delete(int id);

    public Repositorio ListId(int id);

    public List<RepositorioEstudianteDTO> reporte02();

}
