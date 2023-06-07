package pe.edu.upc.connection2connection.dtos;

public class UsuarioDTO {
    private int idUsuario;
    private int dni_Usuario;
    private String usuario_Usuario;
    private String nombre_Usuario;
    private String correo_Usuario;
    private String contrasena_Usuario;
    private String tipo_Usuario;
    private String key;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
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

    public String getTipo_Usuario() {
        return tipo_Usuario;
    }

    public void setTipo_Usuario(String tipo_Usuario) {
        this.tipo_Usuario = tipo_Usuario;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
