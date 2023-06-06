package pe.edu.upc.connection2connection.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.connection2connection.entities.Empresa;
import pe.edu.upc.connection2connection.entities.Estudiante;
import pe.edu.upc.connection2connection.repositories.IEstudianteRepository;
import pe.edu.upc.connection2connection.repositories.IReclutadorRepository;
import pe.edu.upc.connection2connection.services.IEstudianteService;

import java.util.List;
@Service
public class EstudianteServiceImplement implements IEstudianteService {
    @Autowired
    private IEstudianteRepository eR;
    @Override
    public void insertar(Estudiante estudiante) {
        eR.save(estudiante);
    }
    @Override
    public List<Estudiante> listar() {
        return eR.findAll();
    }

    @Override
    public void delete(int id) {
        eR.deleteById(id);
    }

    @Override
    public Estudiante ListId(int id) {
        return eR.findById(id).orElse(new Estudiante());
    }
}
