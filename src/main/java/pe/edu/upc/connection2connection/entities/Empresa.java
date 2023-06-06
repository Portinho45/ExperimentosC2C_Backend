package pe.edu.upc.connection2connection.entities;

import javax.persistence.*;

@Entity
@Table(name = "Empresa")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre_Empresa", length = 60, nullable = false)//largo de 60 y es obligatorio(nullable)
    private  String nombre_Empresa;
    @Column(name = "descripcion_Empresa", length = 60, nullable = false)//largo de 60 y es obligatorio(nullable)
    private  String descripcion_Empresa;
    @Column(name = "correo_Empresa", length = 60, nullable = false)//largo de 60 y es obligatorio(nullable)
    private  String correo_Empresa;

    public Empresa(){

    }

    public Empresa(int id, String nombre_Empresa, String descripcion_Empresa, String correo_Empresa) {
        this.id = id;
        this.nombre_Empresa = nombre_Empresa;
        this.descripcion_Empresa = descripcion_Empresa;
        this.correo_Empresa = correo_Empresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_Empresa() {
        return nombre_Empresa;
    }

    public void setNombre_Empresa(String nombre_Empresa) {
        this.nombre_Empresa = nombre_Empresa;
    }

    public String getDescripcion_Empresa() {
        return descripcion_Empresa;
    }

    public void setDescripcion_Empresa(String descripcion_Empresa) {
        this.descripcion_Empresa = descripcion_Empresa;
    }

    public String getCorreo_Empresa() {
        return correo_Empresa;
    }

    public void setCorreo_Empresa(String correo_Empresa) {
        this.correo_Empresa = correo_Empresa;
    }

}
