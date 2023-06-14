package pe.edu.upc.connection2connection.services;

import pe.edu.upc.connection2connection.entities.Puesto_Trabajo;

import java.util.List;

public interface IPuesto_TrabajoService {

    public void insertar(Puesto_Trabajo puesto_trabajo);

    List<Puesto_Trabajo> listar();

    public void delete(int id);

}
