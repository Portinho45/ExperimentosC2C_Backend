package pe.edu.upc.connection2connection.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.connection2connection.entities.Puesto_Trabajo;
import pe.edu.upc.connection2connection.repositories.IPuesto_TrabajoRepository;
import pe.edu.upc.connection2connection.services.IPuesto_TrabajoService;

import java.util.List;

@Service
public class Puesto_TrabajoServiceImplement implements IPuesto_TrabajoService {

    @Autowired
    private IPuesto_TrabajoRepository pR;
    @Override
    public void insertar(Puesto_Trabajo puesto_trabajo) {
        pR.save(puesto_trabajo);
    }
    @Override
    public List<Puesto_Trabajo> listar() {
        return pR.findAll();
    }
}
