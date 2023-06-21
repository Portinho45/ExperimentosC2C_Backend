package pe.edu.upc.connection2connection.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.connection2connection.dtos.EmpresaDTO;
import pe.edu.upc.connection2connection.dtos.EmpresaReclutadorDTO;
import pe.edu.upc.connection2connection.entities.Empresa;
import pe.edu.upc.connection2connection.services.IEmpresaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Empresa")
public class EmpresaController {
    @Autowired
    private IEmpresaService aS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void insert(@RequestBody EmpresaDTO dto){
        ModelMapper m = new ModelMapper();
        Empresa e = m.map(dto,Empresa.class);
        aS.insert(e);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ESTUDIANTE') or hasAuthority('RECLUTADOR')")
    public List<EmpresaDTO> list(){
        return aS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, EmpresaDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id")Integer id){
        aS.delete(id);
    }
    @GetMapping("/{id}")
    public EmpresaDTO ListId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        EmpresaDTO dto = m.map(aS.ListId(id), EmpresaDTO.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void goUpdate(@RequestBody EmpresaDTO dto){
        ModelMapper m = new ModelMapper();
        Empresa e = m.map(dto, Empresa.class);
        aS.insert(e);
    }

    @GetMapping("/empresa-count")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<EmpresaReclutadorDTO> obtenerNumeroReclutadoresEmpresa() {
        List<EmpresaReclutadorDTO> EmpresaReclutadorDTO = aS.reporte01();
        return EmpresaReclutadorDTO;
    }

}
