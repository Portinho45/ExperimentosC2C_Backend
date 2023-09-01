package pe.edu.upc.connection2connection.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.connection2connection.dtos.CalificacionDTO;
import pe.edu.upc.connection2connection.entities.Calificacion;
import pe.edu.upc.connection2connection.services.ICalificacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Calificacion")
public class CalificacionController {
    @Autowired
    private ICalificacionService aS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ESTUDIANTE')")
    public void insert(@RequestBody CalificacionDTO dto){
        ModelMapper m = new ModelMapper();
        Calificacion e = m.map(dto,Calificacion.class);
        aS.insert(e);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<CalificacionDTO> list(){
        return aS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, CalificacionDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id")Integer id){
        aS.delete(id);
    }
    @GetMapping("/{id}")
    public CalificacionDTO ListId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        CalificacionDTO dto = m.map(aS.ListId(id), CalificacionDTO.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void goUpdate(@RequestBody CalificacionDTO dto){
        ModelMapper m = new ModelMapper();
        Calificacion e = m.map(dto, Calificacion.class);
        aS.insert(e);
    }
}
