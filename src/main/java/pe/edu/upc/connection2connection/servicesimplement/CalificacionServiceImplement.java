package pe.edu.upc.connection2connection.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.connection2connection.entities.Calificacion;
import pe.edu.upc.connection2connection.repositories.ICalificacionRepository;
import pe.edu.upc.connection2connection.services.ICalificacionService;

import java.util.List;

@Service
public class CalificacionServiceImplement implements ICalificacionService {

    @Autowired
    private ICalificacionRepository eR;

    @Override
    public void insert(Calificacion calificacion) {
        eR.save(calificacion);
    }
    @Override
    public List<Calificacion> list(){
        return eR.findAll();
    }

    @Override
    public void delete(int id) {
        eR.deleteById(id);
    }

    @Override
    public Calificacion ListId(int idAuthor) {
        return eR.findById(idAuthor).orElse(new Calificacion());
    }
}
