package pe.edu.upc.connection2connection.services;

import pe.edu.upc.connection2connection.dtos.EmpresaMatchDTO;
import pe.edu.upc.connection2connection.dtos.EmpresaReclutadorDTO;
import pe.edu.upc.connection2connection.entities.Empresa;

import java.util.List;

public interface IEmpresaService {

    public void insert(Empresa empresa);
    List<Empresa> list();

    public void delete(int id);

    public Empresa ListId(int id);

    public List<EmpresaReclutadorDTO> reporte01();
    public List<EmpresaMatchDTO> reporte10();

}
