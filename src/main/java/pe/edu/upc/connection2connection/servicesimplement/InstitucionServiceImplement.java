package pe.edu.upc.connection2connection.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.connection2connection.entities.Institucion;
import pe.edu.upc.connection2connection.repositories.IInstitucionRepository;
import pe.edu.upc.connection2connection.services.IInstitucionService;

import java.util.List;

@Service
public class InstitucionServiceImplement implements IInstitucionService {

    @Autowired
    private IInstitucionRepository iR;

    @Override
    public void insert(Institucion institucion) {
        iR.save(institucion);
    }
    @Override
    public List<Institucion> list(){
        return iR.findAll();
    }

    @Override
    public void delete(int id) {
        iR.deleteById(id);
    }

    @Override
    public Institucion ListId(int id) {
        return iR.findById(id).orElse(new Institucion());
    }
}
