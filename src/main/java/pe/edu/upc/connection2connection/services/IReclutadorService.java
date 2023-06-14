package pe.edu.upc.connection2connection.services;

import pe.edu.upc.connection2connection.entities.Empresa;
import pe.edu.upc.connection2connection.entities.Reclutador;

import java.util.List;

public interface IReclutadorService {

    public void insert(Reclutador reclutador);

    List<Reclutador> listar();

    public void delete(int id);

    List<Reclutador> buscarEmpresa(Empresa Empresa_id);

}
