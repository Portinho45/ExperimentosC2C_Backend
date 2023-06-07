package pe.edu.upc.connection2connection.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.connection2connection.entities.Match;
import pe.edu.upc.connection2connection.repositories.IMatchRepository;
import pe.edu.upc.connection2connection.services.IMatchService;

import java.util.List;
@Service
public class MatchServiceImplement implements IMatchService {

    @Autowired
    private IMatchRepository mR;
    @Override
    public void insertar(Match match) {
        mR.save(match);
    }
    @Override
    public List<Match> listar() {
        return mR.findAll();
    }
}
