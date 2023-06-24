package pe.edu.upc.connection2connection.controllers;

import io.swagger.annotations.ApiOperation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.connection2connection.dtos.EmpresaDTO;
import pe.edu.upc.connection2connection.dtos.ReclutadorDTO;
import pe.edu.upc.connection2connection.entities.Empresa;
import pe.edu.upc.connection2connection.entities.Reclutador;
import pe.edu.upc.connection2connection.services.IReclutadorService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reclutadores")
public class ReclutadorController {

    @Autowired
    private IReclutadorService rS;

    @PostMapping
    public void registrar(@RequestBody ReclutadorDTO dto) {
        ModelMapper m = new ModelMapper();
        Reclutador r = m.map(dto, Reclutador.class);
        rS.insert(r);
    }


    @GetMapping
    public List<ReclutadorDTO> listar() {
        return rS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ReclutadorDTO.class);

        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('RECLUTADOR')")
    public void delete(@PathVariable("id")Integer id){
        rS.delete(id);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('RECLUTADOR')")
    public ReclutadorDTO ListId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        ReclutadorDTO dto = m.map(rS.ListId(id), ReclutadorDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('RECLUTADOR')")
    public void goUpdate(@RequestBody ReclutadorDTO dto){
        ModelMapper m = new ModelMapper();
        Reclutador r = m.map(dto, Reclutador.class);
        rS.insert(r);
    }

    @PostMapping("/buscarEmpresa")
    @ApiOperation(value = "Buscar reclutadores por empresa")
    public List<ReclutadorDTO> buscar(@RequestBody Empresa empresa) {
        return rS.buscarEmpresa(empresa).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, ReclutadorDTO.class);
        }).collect(Collectors.toList());
    }

}
