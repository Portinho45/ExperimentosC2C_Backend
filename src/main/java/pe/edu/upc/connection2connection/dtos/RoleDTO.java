package pe.edu.upc.connection2connection.dtos;

import pe.edu.upc.connection2connection.entities.Usuario;

public class RoleDTO {
    private Long id;

    private String rol;

    private Usuario usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Usuario getUser() {
        return usuario;
    }

    public void setUser(Usuario usuario) {
        this.usuario = usuario;
    }
}