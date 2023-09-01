package pe.edu.upc.connection2connection.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.connection2connection.dtos.Calificacion_EstudianteDTO;
import pe.edu.upc.connection2connection.dtos.ReclutadorDTO;
import pe.edu.upc.connection2connection.entities.Calificacion_Estudiante;
import pe.edu.upc.connection2connection.entities.Reclutador;
import pe.edu.upc.connection2connection.services.ICalificacion_EstudianteService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Calificacion_Estudiante")
public class Calificacion_EstudianteController {
    @Autowired
    private ICalificacion_EstudianteService cS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void registrar(@RequestBody Calificacion_EstudianteDTO dto) {
        ModelMapper m = new ModelMapper();
        Calificacion_Estudiante pT = m.map(dto, Calificacion_Estudiante.class);
        cS.insertar(pT);
    }


    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ESTUDIANTE') or hasAuthority('RECLUTADOR')")
    public List<Calificacion_EstudianteDTO> listar() {
        return cS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Calificacion_EstudianteDTO.class);

        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id")Integer id){
        cS.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public Calificacion_EstudianteDTO ListId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        Calificacion_EstudianteDTO dto = m.map(cS.ListId(id), Calificacion_EstudianteDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void goUpdate(@RequestBody Calificacion_EstudianteDTO dto){
        ModelMapper m = new ModelMapper();
        Calificacion_Estudiante r = m.map(dto, Calificacion_Estudiante.class);
        cS.insertar(r);
    }

}
