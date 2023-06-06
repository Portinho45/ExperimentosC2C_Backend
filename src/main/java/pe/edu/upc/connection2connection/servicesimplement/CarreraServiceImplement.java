
package pe.edu.upc.connection2connection.servicesimplement;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import pe.edu.upc.connection2connection.entities.Carrera;
        import pe.edu.upc.connection2connection.repositories.ICarreraRepository;
        import pe.edu.upc.connection2connection.services.ICarreraService;

        import java.util.List;
@Service
public class CarreraServiceImplement implements ICarreraService {

    @Autowired
    private ICarreraRepository eR;

    @Override
    public void insert(Carrera carrera) {
        eR.save(carrera);
    }
    @Override
    public List<Carrera> list(){
        return eR.findAll();
    }

    @Override
    public void delete(int id) {
        eR.deleteById(id);
    }

    @Override
    public Carrera ListId(int idAuthor) {
        return eR.findById(idAuthor).orElse(new Carrera());
    }
}
