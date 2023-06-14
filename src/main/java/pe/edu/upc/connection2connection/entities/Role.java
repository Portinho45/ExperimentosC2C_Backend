package pe.edu.upc.connection2connection.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "roles", uniqueConstraints = { @UniqueConstraint(columnNames = { "idUsuario", "rol" }) })
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rol;

    @ManyToOne
    @JoinColumn(name="idUsuario", nullable=false)
    private Usuario usuario;

    public Role(){

    }
    public Role(Long id, String rol, Usuario usuario) {
        this.id = id;
        this.rol = rol;
        this.usuario = usuario;
    }


    //GETTERS AND SETTERES

    public Usuario getUser() {
        return usuario;
    }

    public void setUser(Usuario user) {
        this.usuario = usuario;
    }

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

}