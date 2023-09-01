package pe.edu.upc.connection2connection.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.connection2connection.dtos.EmpresaDTO;
import pe.edu.upc.connection2connection.dtos.RequisitoDTO;
import pe.edu.upc.connection2connection.entities.Requisito;
import pe.edu.upc.connection2connection.services.IRequisitoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Requisitos")
public class RequisitoController
{
    @Autowired
    private IRequisitoService rS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('RECLUTADOR')")
    public void insert(@RequestBody RequisitoDTO dto){
        ModelMapper m = new ModelMapper();
        Requisito r = m.map(dto,Requisito.class);
        rS.insert(r);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('RECLUTADOR')")
    public List<RequisitoDTO> list(){
        return rS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, RequisitoDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('RECLUTADOR')")
    public void delete(@PathVariable("id")Integer id){
        rS.delete(id);
    }
    @GetMapping("/{id}")
    public RequisitoDTO ListId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        RequisitoDTO dto = m.map(rS.ListId(id), RequisitoDTO.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('RECLUTADOR')")
    public void goUpdate(@RequestBody RequisitoDTO dto){
        ModelMapper m = new ModelMapper();
        Requisito r = m.map(dto, Requisito.class);
        rS.insert(r);
    }


}