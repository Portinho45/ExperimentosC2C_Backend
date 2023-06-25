package pe.edu.upc.connection2connection.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.connection2connection.dtos.EmpresaDTO;
import pe.edu.upc.connection2connection.dtos.Puesto_TrabajoDTO;
import pe.edu.upc.connection2connection.entities.Empresa;
import pe.edu.upc.connection2connection.entities.Puesto_Trabajo;
import pe.edu.upc.connection2connection.services.IPuesto_TrabajoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/puesto_trabajos")
public class Puesto_TrabajoController {

    @Autowired
    private IPuesto_TrabajoService pS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('RECLUTADOR')")
    public void registrar(@RequestBody Puesto_TrabajoDTO dto) {
        ModelMapper m = new ModelMapper();
        Puesto_Trabajo pT = m.map(dto, Puesto_Trabajo.class);
        pS.insertar(pT);
    }


    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ESTUDIANTE') or hasAuthority('RECLUTADOR')")
    public List<Puesto_TrabajoDTO> listar() {
        return pS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,Puesto_TrabajoDTO.class);

        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('RECLUTADOR')")
    public void delete(@PathVariable("id")Integer id){
        pS.delete(id);
    }


    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('RECLUTADOR')")
    public void goUpdate(@RequestBody Puesto_TrabajoDTO dto){
        ModelMapper m = new ModelMapper();
        Puesto_Trabajo pT = m.map(dto, Puesto_Trabajo.class);
        pS.insertar(pT);
    }

}
