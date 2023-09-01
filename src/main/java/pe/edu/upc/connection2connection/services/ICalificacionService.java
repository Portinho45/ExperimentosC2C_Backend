package pe.edu.upc.connection2connection.services;

import pe.edu.upc.connection2connection.entities.Calificacion;

import java.util.List;

public interface ICalificacionService {

    public void insert(Calificacion calificacion);
    List<Calificacion> list();

    public void delete(int id);

    public Calificacion ListId(int id);

}
