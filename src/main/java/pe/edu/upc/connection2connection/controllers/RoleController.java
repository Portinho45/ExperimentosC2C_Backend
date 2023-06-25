package pe.edu.upc.connection2connection.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import pe.edu.upc.connection2connection.dtos.RoleDTO;
import pe.edu.upc.connection2connection.entities.Role;
import pe.edu.upc.connection2connection.services.IRoleService;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@SessionAttributes
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private IRoleService rS;

    @PostMapping
    public void insert(@RequestBody RoleDTO dto){
        ModelMapper m = new ModelMapper();
        Role e = m.map(dto,Role.class);
        rS.insert(e);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<RoleDTO> list(){
        return rS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, RoleDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public RoleDTO ListId(@PathVariable("id")Long id){
        ModelMapper m = new ModelMapper();
        RoleDTO dto = m.map(rS.ListId(id), RoleDTO.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void goUpdate(@RequestBody RoleDTO dto){
        ModelMapper m = new ModelMapper();
        Role e = m.map(dto, Role.class);
        rS.insert(e);
    }

}

