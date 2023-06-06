package pe.edu.upc.connection2connection.entities;

import javax.persistence.*;

@Entity
@Table(name="Usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name="DNI_Usuario",length = 6,nullable = false)
    private int DNI_Usuario;
    @Column(name="Usuario_Usuario",length = 60,nullable = false)
    private String Usuario_Usuario;
    @Column(name="Nombre_Usuario",length = 60,nullable = false)
    private String Nombre_Usuario;
    @Column(name="Correo_Usuario",length = 60,nullable = false)
    private String Correo_Usuario;
    @Column(name="Contrasena_Usuario",length = 60,nullable = false)
    private String Contrasena_Usuario;
    @Column(name="Tipo_Usuario",length = 60,nullable = false)
    private String Tipo_Usuario;
    @Column(name="key")
    private String key;

    public Usuario() {
    }

    public Usuario(int idUsuario, int DNI_Usuario, String usuario_Usuario, String nombre_Usuario, String correo_Usuario, String contrasena_Usuario, String tipo_Usuario, String key) {
        this.idUsuario = idUsuario;
        this.DNI_Usuario = DNI_Usuario;
        this.Usuario_Usuario = usuario_Usuario;
        this.Nombre_Usuario = nombre_Usuario;
        this.Correo_Usuario = correo_Usuario;
        this.Contrasena_Usuario = contrasena_Usuario;
        this.Tipo_Usuario = tipo_Usuario;
        this.key = key;
    }

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
