package pe.edu.upc.connection2connection.dtos;

import java.util.List;
import pe.edu.upc.connection2connection.entities.Role;


public class UsuarioDTO {
    private Long idUsuario;
    private int dni_Usuario;
    private String usuario_Usuario;
    private String nombre_Usuario;
    private String correo_Usuario;
    private String contrasena_Usuario;
    private Boolean enabled;
    private List<Role> roles;

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getDni_Usuario() {
        return dni_Usuario;
    }

    public void setDni_Usuario(int dni_Usuario) {
        this.dni_Usuario = dni_Usuario;
    }

    public String getUsuario_Usuario() {
        return usuario_Usuario;
    }

    public void setUsuario_Usuario(String usuario_Usuario) {
        this.usuario_Usuario = usuario_Usuario;
    }

    public String getNombre_Usuario() {
        return nombre_Usuario;
    }

    public void setNombre_Usuario(String nombre_Usuario) {
        this.nombre_Usuario = nombre_Usuario;
    }

    public String getCorreo_Usuario() {
        return correo_Usuario;
    }

    public void setCorreo_Usuario(String correo_Usuario) {
        this.correo_Usuario = correo_Usuario;
    }

    public String getContrasena_Usuario() {
        return contrasena_Usuario;
    }

    public void setContrasena_Usuario(String contrasena_Usuario) {
        this.contrasena_Usuario = contrasena_Usuario;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
