package pe.edu.upc.connection2connection.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.connection2connection.dtos.MatchDTO;
import pe.edu.upc.connection2connection.dtos.ReclutadorDTO;
import pe.edu.upc.connection2connection.entities.Match;
import pe.edu.upc.connection2connection.entities.Reclutador;
import pe.edu.upc.connection2connection.services.IMatchService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/match")
public class MatchController {

    @Autowired
    private IMatchService mS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ESTUDIANTE') or hasAuthority('RECLUTADOR')")
    public void registrar(@RequestBody MatchDTO dto) {
        ModelMapper m = new ModelMapper();
        Match mt = m.map(dto, Match.class);
        mS.insertar(mt);
    }


    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ESTUDIANTE') or hasAuthority('RECLUTADOR')")
    public List<MatchDTO> listar() {
        return mS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,MatchDTO.class);

        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ESTUDIANTE') or hasAuthority('RECLUTADOR')")
    public void delete(@PathVariable("id")Integer id){
        mS.delete(id);
    }

    @GetMapping("/{id}")
    public MatchDTO ListId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        MatchDTO dto = m.map(mS.ListId(id), MatchDTO.class);
        return dto;
    }

    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void goUpdate(@RequestBody MatchDTO dto){
        ModelMapper m = new ModelMapper();
        Match r = m.map(dto, Match.class);
        mS.insertar(r);
    }
}
