package pe.edu.upc.connection2connection.dtos;

import pe.edu.upc.connection2connection.entities.Empresa;
import pe.edu.upc.connection2connection.entities.Usuario;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ReclutadorDTO {

    private int id;

    private String Descripcion_Reclutador;

    private Empresa empresa;

    private Usuario usuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion_Reclutador() {
        return Descripcion_Reclutador;
    }

    public void setDescripcion_Reclutador(String descripcion_Reclutador) {
        Descripcion_Reclutador = descripcion_Reclutador;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
