package pe.edu.upc.connection2connection.services;

import pe.edu.upc.connection2connection.entities.Usuario;

import java.util.List;

public interface IUsuarioService {
    public void insert(Usuario usuario);
    List<Usuario> list();

    public void delete(int id);

    public Usuario listId(int id);
}
