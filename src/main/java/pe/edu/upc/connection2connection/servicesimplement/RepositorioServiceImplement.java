package pe.edu.upc.connection2connection.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.connection2connection.dtos.EmpresaReclutadorDTO;
import pe.edu.upc.connection2connection.dtos.RepositorioEstudianteDTO;
import pe.edu.upc.connection2connection.entities.Repositorio;
import pe.edu.upc.connection2connection.repositories.IRepositorioRepository;
import pe.edu.upc.connection2connection.services.IRepositorioService;

import java.util.ArrayList;
import java.util.List;
@Service
public class RepositorioServiceImplement implements IRepositorioService {

    @Autowired
    private IRepositorioRepository rR;

    @Override
    public void insert(Repositorio repositorio) {
        rR.save(repositorio);
    }

    @Override
    public List<Repositorio> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

    @Override
    public Repositorio ListId(int id) {
        return rR.findById(id).orElse(new Repositorio());
    }

    @Override
    public List<RepositorioEstudianteDTO> reporte02() {
        List<String[]> obtenerNumRepositorios = rR.obtenerNumRepositorios();
        List<RepositorioEstudianteDTO> RepositorioEstudianteDTOs = new ArrayList<>();

        for (String[] data : obtenerNumRepositorios) {
            RepositorioEstudianteDTO dto = new RepositorioEstudianteDTO();
            dto.setNameEstudiante(data[0]);
            dto.setEdadEstudiante(Integer.parseInt(data[1]));
            dto.setPracticanteEstudiante(Boolean.parseBoolean(data[2]));
            dto.setRepositorioCount(Integer.parseInt(data[3]));
            RepositorioEstudianteDTOs.add(dto);
        }

        return RepositorioEstudianteDTOs;
    }
}
