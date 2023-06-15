package pe.edu.upc.connection2connection.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import pe.edu.upc.connection2connection.dtos.UsuarioDTO;
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
@Controller
@Secured({"ROLE_ADMIN"})
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private PasswordEncoder bcrypt;
    @Autowired
    private PasswordEncoder bcrypt;
    @Autowired
    private IUsuarioService uService;

    @PostMapping("/save")
    public String saveUser(@Valid Usuario user, BindingResult result, Model model, SessionStatus status)
            throws Exception {
        if (result.hasErrors()) {
            return "usersecurity/user";
        } else {
            String bcryptPassword = bcrypt.encode(user.getContrasena_Usuario());
            user.setContrasena_Usuario(bcryptPassword);
            int rpta = uService.insert(user);
            if (rpta > 0) {
                model.addAttribute("mensaje", "Ya existe");
                return "usersecurity/user";
            } else {
                model.addAttribute("mensaje", "Se guardó correctamente");
                status.setComplete();
            }
        }
        model.addAttribute("listaUsuarios", uService.list());

        return "usersecurity/listUser";
    }

    @GetMapping("/list")
    public String listUser(Model model) {
        try {
            model.addAttribute("user", new Usuario());
            model.addAttribute("listaUsuarios", uService.list());
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "usersecurity/listUser";
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Long id){
        uService.delete(id);
    }
    @GetMapping("/{id}")
    public UsuarioDTO ListId(@PathVariable("id")Long id){
        ModelMapper m = new ModelMapper();
        UsuarioDTO dto = m.map(uService.listId(id), UsuarioDTO.class);
        return dto;
    }
    @PutMapping
    public void goUpdate(@RequestBody UsuarioDTO dto){
        ModelMapper m = new ModelMapper();
        Usuario u = m.map(dto, Usuario.class);
        uService.insert(u);
    }

    @PostMapping("/save")
    public String saveUser(@Valid Usuario usuario, BindingResult result, Model model, SessionStatus status)
            throws Exception {
        if (result.hasErrors()) {
            return "usersecurity/user";
        } else {
            String bcryptPassword = bcrypt.encode(usuario.getContrasena_Usuario());
            usuario.setContrasena_Usuario(bcryptPassword);
            int rpta = uS.insert(usuario);
            if (rpta > 0) {
                model.addAttribute("mensaje", "Ya existe");
                return "usersecurity/user";
            } else {
                model.addAttribute("mensaje", "Se guardó correctamente");
                status.setComplete();
            }
        }
        model.addAttribute("listaUsuarios", uS.list());

        return "usersecurity/listUser";
    }

    @GetMapping("/list")
    public String listUser(Model model) {
        try {
            model.addAttribute("usuario", new Usuario());
            model.addAttribute("listaUsuarios", uS.list());
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "usersecurity/listUser";
    }

}
