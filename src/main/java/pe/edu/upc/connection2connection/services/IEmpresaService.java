package pe.edu.upc.connection2connection.services;

import pe.edu.upc.connection2connection.entities.Empresa;

import java.util.List;

public interface IEmpresaService {

    public void insert(Empresa empresa);
    List<Empresa> list();

    public void delete(int id);

    public Empresa ListId(int id);

}
