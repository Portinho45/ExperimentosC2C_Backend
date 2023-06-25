package pe.edu.upc.connection2connection.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.connection2connection.dtos.EmpresaMatchDTO;
import pe.edu.upc.connection2connection.dtos.EmpresaReclutadorDTO;
import pe.edu.upc.connection2connection.entities.Empresa;
import pe.edu.upc.connection2connection.repositories.IEmpresaRepository;
import pe.edu.upc.connection2connection.services.IEmpresaService;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmpresaServiceImplement implements IEmpresaService {

    @Autowired
    private IEmpresaRepository eR;

    @Override
    public void insert(Empresa empresa) {
        eR.save(empresa);
    }
    @Override
    public List<Empresa> list(){
        return eR.findAll();
    }

    @Override
    public void delete(int id) {
        eR.deleteById(id);
    }

    @Override
    public Empresa ListId(int idAuthor) {
        return eR.findById(idAuthor).orElse(new Empresa());
    }

    @Override
    public List<EmpresaReclutadorDTO> reporte01() {
        List<String[]> obtenerNumeroReclutadoresEmpresa = eR.obtenerNumeroReclutadoresEmpresa();
        List<EmpresaReclutadorDTO> EmpresaReclutadorDTOs = new ArrayList<>();

        for (String[] data : obtenerNumeroReclutadoresEmpresa) {
            EmpresaReclutadorDTO dto = new EmpresaReclutadorDTO();
            dto.setNameEmpresa(data[0]);
            dto.setReclutadorCount(Integer.parseInt(data[1]));
            EmpresaReclutadorDTOs.add(dto);
        }

        return EmpresaReclutadorDTOs;
    }

    @Override
    public List<EmpresaMatchDTO> reporte10() {
        List<String[]> MatchEmpresa = eR.MatchEmpresa();
        List<EmpresaMatchDTO> EmpresaMatchDTOs = new ArrayList<>();

        for (String[] data : MatchEmpresa) {
            EmpresaMatchDTO dto = new EmpresaMatchDTO();
            dto.setEmpresam(data[1]);
            dto.setCountestudiantesmatch(Integer.parseInt(data[0]));
            EmpresaMatchDTOs.add(dto);
        }

        return EmpresaMatchDTOs;
    }
}
