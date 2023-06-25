package pe.edu.upc.connection2connection.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.connection2connection.dtos.MatchDTO;
import pe.edu.upc.connection2connection.entities.Match;
import pe.edu.upc.connection2connection.services.IMatchService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/match")
public class MatchController {

    @Autowired
    private IMatchService mS;

    @PostMapping
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
}
