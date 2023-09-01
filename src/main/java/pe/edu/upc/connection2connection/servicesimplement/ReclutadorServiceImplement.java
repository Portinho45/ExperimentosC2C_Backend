package pe.edu.upc.connection2connection.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.connection2connection.dtos.EmpresaReclutadorDTO;
import pe.edu.upc.connection2connection.dtos.ReclutadorMatchDTO;
import pe.edu.upc.connection2connection.entities.Empresa;
import pe.edu.upc.connection2connection.entities.Reclutador;
import pe.edu.upc.connection2connection.repositories.IReclutadorRepository;
import pe.edu.upc.connection2connection.services.IReclutadorService;

import java.util.ArrayList;
import java.util.List;
@Service
public class ReclutadorServiceImplement implements IReclutadorService {

    @Autowired
    private IReclutadorRepository rR;

    @Override
    public void insert(Reclutador reclutador) {
        rR.save(reclutador);
    }

    @Override
    public List<Reclutador> listar() {
        return rR.findAll();
    }

    @Override
    public void delete(int id) {
        rR.deleteById(id);
    }

    @Override
    public Reclutador ListId(int id) {
        return rR.findById(id).orElse(new Reclutador());
    }

    @Override
    public List<Reclutador> buscarEmpresa(Empresa Empresa_id) {
        return rR.findBynombreEmpresa(Empresa_id);
    }

    @Override
    public List<ReclutadorMatchDTO> reporte09() {
        List<String[]> MatchReclutador = rR.MatchReclutador();
        List<ReclutadorMatchDTO> ReclutadorMatchDTOs = new ArrayList<>();

        for (String[] data : MatchReclutador) {
            ReclutadorMatchDTO dto = new ReclutadorMatchDTO();
            dto.setReclutadorm(data[1]);
            dto.setCountestudiantesmatch(Integer.parseInt(data[0]));
            ReclutadorMatchDTOs.add(dto);
        }

        return ReclutadorMatchDTOs;
    }

}
