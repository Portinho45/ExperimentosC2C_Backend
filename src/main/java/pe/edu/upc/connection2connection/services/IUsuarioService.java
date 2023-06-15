package pe.edu.upc.connection2connection.services;

import pe.edu.upc.connection2connection.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public Integer insert(Usuario usuario);
    List<Usuario> list();

    public void delete(Long id);

    public Usuario listId(Long id);
}
