package pe.edu.upc.connection2connection.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.connection2connection.dtos.Calificacion_EstudianteDTO;
import pe.edu.upc.connection2connection.entities.Calificacion_Estudiante;
import pe.edu.upc.connection2connection.services.ICalificacion_EstudianteService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Calificacion_Estudiante")
public class Calificacion_EstudianteController {
    @Autowired
    private ICalificacion_EstudianteService cS;

    @PostMapping
    public void registrar(@RequestBody Calificacion_EstudianteDTO dto) {
        ModelMapper m = new ModelMapper();
        Calificacion_Estudiante pT = m.map(dto, Calificacion_Estudiante.class);
        cS.insertar(pT);
    }


    @GetMapping
    public List<Calificacion_EstudianteDTO> listar() {
        return cS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Calificacion_EstudianteDTO.class);

        }).collect(Collectors.toList());
    }

}
