package pe.edu.upc.connection2connection.servicesimplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.connection2connection.entities.Carreras_Estudiante;
import pe.edu.upc.connection2connection.repositories.ICarreras_EstudianteRepository;
import pe.edu.upc.connection2connection.services.ICarreras_EstudianteService;

import java.util.List;
@Service
public class Carreras_EstudianteServiceImplement implements ICarreras_EstudianteService {

    @Autowired
    private ICarreras_EstudianteRepository cR;
    @Override
    public void insertar(Carreras_Estudiante carreras_estudiante) {
        cR.save(carreras_estudiante);
    }
    @Override
    public List<Carreras_Estudiante> listar() {
        return cR.findAll();
    }

}
