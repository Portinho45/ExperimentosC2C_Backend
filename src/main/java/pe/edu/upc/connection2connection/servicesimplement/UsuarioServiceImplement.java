package pe.edu.upc.connection2connection.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.connection2connection.entities.Usuario;
import pe.edu.upc.connection2connection.repositories.IUsuarioRepository;
import pe.edu.upc.connection2connection.services.IUsuarioService;

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


}
