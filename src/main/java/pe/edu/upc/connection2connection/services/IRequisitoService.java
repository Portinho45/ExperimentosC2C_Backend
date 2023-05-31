package pe.edu.upc.connection2connection.services;


import pe.edu.upc.connection2connection.entities.Requisito;

import java.util.List;

public interface IRequisitoService {
    public void insert(Requisito requisito);
    List<Requisito> list();

    public void delete(int id);

    public Requisito ListId(int id);
}
