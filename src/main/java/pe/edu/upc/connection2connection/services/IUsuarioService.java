package pe.edu.upc.connection2connection.services;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.connection2connection.dtos.UsuarioRolDTO;
import pe.edu.upc.connection2connection.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public Integer insert(Usuario usuario);
    public void actualizar(Usuario usuario);
    List<Usuario> list();

    public void delete(Long id);

    public Usuario listId(Long id);

    public Usuario listUsername(String name);
    public List<UsuarioRolDTO> reporte08();

}
