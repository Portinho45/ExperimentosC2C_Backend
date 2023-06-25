package pe.edu.upc.connection2connection.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.connection2connection.dtos.Carreras_EstudianteDTO;
import pe.edu.upc.connection2connection.entities.Carreras_Estudiante;
import pe.edu.upc.connection2connection.services.ICarreras_EstudianteService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Carreras_Estudiante")


public class Carreras_EstudianteController {
    @Autowired
    private ICarreras_EstudianteService cS;

    @PostMapping
    public void registrar(@RequestBody Carreras_EstudianteDTO dto) {
        ModelMapper m = new ModelMapper();
        Carreras_Estudiante pT = m.map(dto, Carreras_Estudiante.class);
        cS.insertar(pT);
    }


    @GetMapping
    public List<Carreras_EstudianteDTO> listar() {
        return cS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Carreras_EstudianteDTO.class);

        }).collect(Collectors.toList());
    }

}
