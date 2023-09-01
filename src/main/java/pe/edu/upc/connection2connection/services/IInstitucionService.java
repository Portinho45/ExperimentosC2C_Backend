package pe.edu.upc.connection2connection.services;

import pe.edu.upc.connection2connection.entities.Institucion;

import java.util.List;

public interface IInstitucionService {

    public void insert(Institucion institucion);
    List<Institucion> list();

    public void delete(int id);

    public Institucion ListId(int id);

}
