package pe.edu.upc.connection2connection.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.connection2connection.entities.Requisito;
import pe.edu.upc.connection2connection.repositories.IRequisitoRepository;
import pe.edu.upc.connection2connection.services.IRequisitoService;

import java.util.List;
@Service
public class RequisitoServiceImplement implements IRequisitoService
{
    @Autowired
    private IRequisitoRepository rR;

    @Override
    public void insert(Requisito requisito) {
        rR.save(requisito);
    }
    @Override
    public List<Requisito> list(){
        return rR.findAll();
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

    @Override
    public Requisito ListId(int idAuthor) {
        return rR.findById(idAuthor).orElse(new Requisito());
    }
}
