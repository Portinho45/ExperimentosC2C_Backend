package pe.edu.upc.connection2connection.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.connection2connection.dtos.EmpresaReclutadorDTO;
import pe.edu.upc.connection2connection.dtos.UsuarioRolDTO;
import pe.edu.upc.connection2connection.entities.Usuario;
import pe.edu.upc.connection2connection.repositories.IUsuarioRepository;
import pe.edu.upc.connection2connection.services.IUsuarioService;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;
    @Override
    public Integer insert(Usuario usuario) {

        int rpta = uR.buscarUsername(usuario.getUsername());
        if (rpta == 0) {
            uR.save(usuario);
        }
        return rpta;
    }

    @Override
    public void actualizar(Usuario usuario) {
        int rpta = uR.buscarUsername(usuario.getUsername());
        if (rpta != 0) {
            uR.save(usuario);
        }
    }

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public void delete(Long id) {
        uR.deleteById(id);
    }

    @Override
    public Usuario listId(Long idUsuario) {
        return uR.findById(idUsuario).orElse(new Usuario());
    }

    @Override
    public Usuario listUsername(String name) {
        return uR.findByUsername(name);
    }

    @Override
    public List<UsuarioRolDTO> reporte08() {
        List<String[]> usuariosporrol = uR.usuariosporrol();
        List<UsuarioRolDTO> UsuarioRolDTOs = new ArrayList<>();

        for (String[] data : usuariosporrol) {
            UsuarioRolDTO dto = new UsuarioRolDTO();
            dto.setRol(data[1]);
            dto.setCountusuarios(Integer.parseInt(data[0]));
            UsuarioRolDTOs.add(dto);
        }

        return UsuarioRolDTOs;
    }


}
