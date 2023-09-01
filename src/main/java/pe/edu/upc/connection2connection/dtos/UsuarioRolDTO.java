package pe.edu.upc.connection2connection.dtos;

public class UsuarioRolDTO {
    private int countusuarios;
    private String rol;

    public UsuarioRolDTO() {
    }

    public UsuarioRolDTO(int countusuarios, String rol) {
        this.countusuarios = countusuarios;
        this.rol = rol;
    }

    public int getCountusuarios() {
        return countusuarios;
    }

    public void setCountusuarios(int countusuarios) {
        this.countusuarios = countusuarios;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
