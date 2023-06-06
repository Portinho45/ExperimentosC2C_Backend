package pe.edu.upc.connection2connection.services;

import pe.edu.upc.connection2connection.entities.Carrera;

import java.util.List;

public interface ICarreraService {

    public void insert(Carrera carrera);
    List<Carrera> list();

    public void delete(int id);

    public Carrera ListId(int id);

}