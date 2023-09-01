package pe.edu.upc.connection2connection.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import pe.edu.upc.connection2connection.dtos.EmpresaReclutadorDTO;
import pe.edu.upc.connection2connection.dtos.UsuarioDTO;
import pe.edu.upc.connection2connection.dtos.UsuarioRolDTO;
import pe.edu.upc.connection2connection.entities.Usuario;
import pe.edu.upc.connection2connection.services.IUsuarioService;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private PasswordEncoder bcrypt;
    @Autowired
    private IUsuarioService uS;



    @GetMapping
    public List<UsuarioDTO> list(){
        return uS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('ADMIN')")
    public void delete(@PathVariable("id")long id){
        uS.delete(id);
    }
    @GetMapping("/{id}")
    public UsuarioDTO ListId(@PathVariable("id")long id){
        ModelMapper m = new ModelMapper();
        UsuarioDTO dto = m.map(uS.listId(id), UsuarioDTO.class);
        return dto;
    }
    @GetMapping("/username/{username}")
    public UsuarioDTO ListUsername(@PathVariable("username")String name){
        ModelMapper m = new ModelMapper();
        UsuarioDTO dto = m.map(uS.listUsername(name), UsuarioDTO.class);
        return dto;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ESTUDIANTE') or hasAuthority('RECLUTADOR')")
    public void goUpdate(@RequestBody UsuarioDTO dto){
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(dto, Usuario.class);
        uS.actualizar(u);
    }

    @PostMapping
    public String saveUser(@Valid Usuario usuario, BindingResult result, Model model, SessionStatus status,@RequestBody UsuarioDTO dto)
            throws Exception {
        if (result.hasErrors()) {
            return "usersecurity/user";
        } else {
            ModelMapper m = new ModelMapper();
            Usuario u = m.map(dto, Usuario.class);
            String bcryptPassword = bcrypt.encode(u.getContrasena_Usuario());
            u.setContrasena_Usuario(bcryptPassword);
            uS.insert(u);
            return "Usuario creado";
        }
    }

    @GetMapping("/list")
    public String listUser(Model model) {
        try {
            model.addAttribute("user", new Usuario());
            model.addAttribute("listaUsuarios", uS.list());
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "usersecurity/listUser";
    }
    @GetMapping("/usuariosporrol")
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('ESTUDIANTE') or hasAuthority('RECLUTADOR')")
    public List<UsuarioRolDTO> usuariosporrol() {
        List<UsuarioRolDTO> UsuarioRolDTO = uS.reporte08();
        return UsuarioRolDTO;
    }

}
