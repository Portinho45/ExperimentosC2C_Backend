package pe.edu.upc.connection2connection.services;

import pe.edu.upc.connection2connection.entities.Empresa;
import pe.edu.upc.connection2connection.entities.Reclutador;

import java.util.List;

public interface IReclutadorService {

    public void insertar(Reclutador reclutador);

    List<Reclutador> listar();

    List<Reclutador> buscarEmpresa(Empresa Empresa_id);

}
