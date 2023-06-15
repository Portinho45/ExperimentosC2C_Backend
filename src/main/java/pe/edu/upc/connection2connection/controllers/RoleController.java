package pe.edu.upc.connection2connection.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import pe.edu.upc.connection2connection.dtos.EmpresaDTO;
import pe.edu.upc.connection2connection.dtos.RoleDTO;
import pe.edu.upc.connection2connection.entities.Empresa;
import pe.edu.upc.connection2connection.services.IUsuarioService;
import pe.edu.upc.connection2connection.entities.Role;
import pe.edu.upc.connection2connection.services.IRoleService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@SessionAttributes
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private IUsuarioService uService;
    @Autowired
    private IRoleService rService;

    @GetMapping("/new")
    public String newRole(Model model) {
        model.addAttribute("role", new Role());
        model.addAttribute("listaUsuarios", uService.list());
        return "role/role";
    }

    @PostMapping("/save")
    public String saveRole(@Validated Role role, BindingResult result, Model model, SessionStatus status) throws Exception {
        if (result.hasErrors()) {
            return "role/role";
        } else {
            rService.insert(role);
            model.addAttribute("mensaje", "Se guardó correctamente");
            status.setComplete();
        }
        model.addAttribute("listaRoles", rService.list());

        return "role/role";

    }

    @PostMapping
    public void insert(@RequestBody RoleDTO dto){
        ModelMapper m = new ModelMapper();
        Role r = m.map(dto,Role.class);
        rService.insert(r);
    }

    @GetMapping
    public List<RoleDTO> list(){
        return rService.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, RoleDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/list")
    public String listRole(Model model) {
        try {
            model.addAttribute("role", new Role());
            model.addAttribute("listaRoles", rService.list());
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "role/listRole";
    }

}