package pe.edu.upc.connection2connection.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.connection2connection.entities.Calificacion_Estudiante;
import pe.edu.upc.connection2connection.repositories.ICalificacion_EstudianteRepository;
import pe.edu.upc.connection2connection.services.ICalificacion_EstudianteService;

import java.util.List;

@Service
public class Calificacion_EstudianteServiceImplement implements ICalificacion_EstudianteService {

    @Autowired
    private ICalificacion_EstudianteRepository cR;
    @Override
    public void insertar(Calificacion_Estudiante calificacion_estudiante) {
        cR.save(calificacion_estudiante);
    }
    @Override
    public List<Calificacion_Estudiante> listar() {
        return cR.findAll();
    }

}
