package pe.edu.upc.connection2connection.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.connection2connection.entities.Empresa;
import pe.edu.upc.connection2connection.entities.Reclutador;
import pe.edu.upc.connection2connection.repositories.IReclutadorRepository;
import pe.edu.upc.connection2connection.services.IReclutadorService;

import java.util.List;
@Service
public class ReclutadorServiceImplement implements IReclutadorService {

    @Autowired
    private IReclutadorRepository rR;

    @Override
    public void insertar(Reclutador reclutador) {
        rR.save(reclutador);
    }

    @Override
    public List<Reclutador> listar() {
        return rR.findAll();
    }

    @Override
    public List<Reclutador> buscarEmpresa(Empresa Empresa_id) {
        return rR.findBynombreEmpresa(Empresa_id);
    }

}