package pe.edu.upc.connection2connection.entities;

import javax.persistence.*;

@Entity
@Table(name="Usuarios")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name="dni_Usuario",length = 6,nullable = false)
    private int dni_Usuario;
    @Column(name="usuario_Usuario",length = 60,nullable = false)
    private String usuario_Usuario;
    @Column(name="nombre_Usuario",length = 60,nullable = false)
    private String nombre_Usuario;
    @Column(name="correo_Usuario",length = 60,nullable = false)
    private String correo_Usuario;
    @Column(name="contrasena_Usuario",length = 60,nullable = false)
    private String contrasena_Usuario;
    @Column(name="tipo_Usuario",length = 60,nullable = false)
    private String tipo_Usuario;
    @Column(name="key")
    private String key;

    public Usuario() {
    }

    public Usuario(int idUsuario, int dni_Usuario, String usuario_Usuario, String nombre_Usuario, String correo_Usuario, String contrasena_Usuario, String tipo_Usuario, String key) {
        this.idUsuario = idUsuario;
        this.dni_Usuario = dni_Usuario;
        this.usuario_Usuario = usuario_Usuario;
        this.nombre_Usuario = nombre_Usuario;
        this.correo_Usuario = correo_Usuario;
        this.contrasena_Usuario = contrasena_Usuario;
        this.tipo_Usuario = tipo_Usuario;
        this.key = key;
    }

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
