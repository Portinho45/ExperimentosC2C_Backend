package pe.edu.upc.connection2connection.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.connection2connection.dtos.*;
import pe.edu.upc.connection2connection.entities.Empresa;
import pe.edu.upc.connection2connection.entities.Estudiante;
import pe.edu.upc.connection2connection.repositories.IEstudianteRepository;
import pe.edu.upc.connection2connection.repositories.IReclutadorRepository;
import pe.edu.upc.connection2connection.services.IEstudianteService;

import java.util.ArrayList;
import java.util.List;
@Service
public class EstudianteServiceImplement implements IEstudianteService {
    @Autowired
    private IEstudianteRepository eR;
    @Override
    public void insertar(Estudiante estudiante) {
        eR.save(estudiante);
    }
    @Override
    public List<Estudiante> listar() {
        return eR.findAll();
    }

    @Override
    public void delete(int id) {
        eR.deleteById(id);
    }

    @Override
    public Estudiante ListId(int id) {
        return eR.findById(id).orElse(new Estudiante());
    }

    @Override
    public List<EstudianteEdadDTO> reporte03() {
        List<String[]> mayoresymenores =eR.mayoresymenores();
        List<EstudianteEdadDTO> EstudianteEdadDTOs=new ArrayList<>();
        for (String[] data : mayoresymenores) {
            EstudianteEdadDTO dto = new EstudianteEdadDTO();
            dto.setMayores(Integer.parseInt(data[0]));
            dto.setMenores(Integer.parseInt(data[1]));
            EstudianteEdadDTOs.add(dto);
        }
        return EstudianteEdadDTOs;
    }

    @Override
    public List<EstudianteEdadPromedioDTO> reporte04() {
        List<String[]> promedioedad = eR.promedioedad();
        List<EstudianteEdadPromedioDTO> EstudianteEdadPromedioDTOs = new ArrayList<>();

        for (String[] data : promedioedad) {
            EstudianteEdadPromedioDTO dto = new EstudianteEdadPromedioDTO();
            dto.setCountestudiantes(Integer.parseInt(data[1]));
            dto.setPromedioedad(Double.parseDouble(data[0]));
            EstudianteEdadPromedioDTOs.add(dto);
        }

        return EstudianteEdadPromedioDTOs;
    }

    @Override
    public List<EstudiantePracticasDTO> reporte05() {
        List<String[]> buscapracticasporcentaje = eR.buscapracticasporcentaje();
        List<EstudiantePracticasDTO> EstudiantePracticasDTOs = new ArrayList<>();

        for (String[] data : buscapracticasporcentaje) {
            EstudiantePracticasDTO dto = new EstudiantePracticasDTO();
            dto.setBuscapracticas(Integer.parseInt(data[0]));
            dto.setNobuscapracticas(Integer.parseInt(data[1]));
            EstudiantePracticasDTOs.add(dto);
        }

        return EstudiantePracticasDTOs;
    }

    @Override
    public List<EstudianteSemestreDTO> reporte06() {
        List<String[]> cantidadestudiantesporsemestre = eR.cantidadestudiantesporsemestre();
        List<EstudianteSemestreDTO>EstudianteSemestreDTOs = new ArrayList<>();

        for (String[] data : cantidadestudiantesporsemestre) {
            EstudianteSemestreDTO dto = new EstudianteSemestreDTO();
            dto.setCountestudiante(Integer.parseInt(data[0]));
            dto.setSemestree(Integer.parseInt(data[1]));
            EstudianteSemestreDTOs.add(dto);
        }

        return EstudianteSemestreDTOs;
    }

    @Override
    public List<InstitucionEstudianteDTO> reporte07() {
        List<String[]> estudiantesporinstitucion = eR.estudiantesporinstitucion();
        List<InstitucionEstudianteDTO>InstitucionEstudianteDTOs = new ArrayList<>();

        for (String[] data : estudiantesporinstitucion) {
            InstitucionEstudianteDTO dto = new InstitucionEstudianteDTO();
            dto.setCountestudiantes(Integer.parseInt(data[0]));
            dto.setInstitucion(data[1]);
            InstitucionEstudianteDTOs.add(dto);
        }

        return InstitucionEstudianteDTOs;
    }
}
