package pe.edu.upc.connection2connection.dtos;

public class UsuarioDTO {
    private int idUsuario;
    private int DNI_Usuario;
    private String Usuario_Usuario;
    private String Nombre_Usuario;
    private String Correo_Usuario;
    private String Contrasena_Usuario;
    private String Tipo_Usuario;
    private String key;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getDNI_Usuario() {
        return DNI_Usuario;
    }

    public void setDNI_Usuario(int DNI_Usuario) {
        this.DNI_Usuario = DNI_Usuario;
    }

    public String getUsuario_Usuario() {
        return Usuario_Usuario;
    }

    public void setUsuario_Usuario(String usuario_Usuario) {
        Usuario_Usuario = usuario_Usuario;
    }

    public String getNombre_Usuario() {
        return Nombre_Usuario;
    }

    public void setNombre_Usuario(String nombre_Usuario) {
        Nombre_Usuario = nombre_Usuario;
    }

    public String getCorreo_Usuario() {
        return Correo_Usuario;
    }

    public void setCorreo_Usuario(String correo_Usuario) {
        Correo_Usuario = correo_Usuario;
    }

    public String getContrasena_Usuario() {
        return Contrasena_Usuario;
    }

    public void setContrasena_Usuario(String contrasena_Usuario) {
        Contrasena_Usuario = contrasena_Usuario;
    }

    public String getTipo_Usuario() {
        return Tipo_Usuario;
    }

    public void setTipo_Usuario(String tipo_Usuario) {
        Tipo_Usuario = tipo_Usuario;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
