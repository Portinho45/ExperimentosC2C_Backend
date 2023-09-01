package pe.edu.upc.connection2connection.entities;

import javax.persistence.*;

@Entity
@Table(name = "Institucion_Educativa")
public class Institucion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre_Institucion", length = 60, nullable = false)//largo de 60 y es obligatorio(nullable)

    private  String nombre_Institucion;
    @Column(name = "correo_Institucion", length = 60, nullable = false)//largo de 60 y es obligatorio(nullable)

    private  String correo_Institucion;

    public Institucion(){

    }

    public Institucion(int id, String nombre_Institucion, String correo_Institucion){
        this.id = id;
        this.nombre_Institucion = nombre_Institucion;
        this.correo_Institucion = correo_Institucion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_Institucion() {
        return nombre_Institucion;
    }

    public void setNombre_Institucion(String nombre_Institucion) {
        this.nombre_Institucion = nombre_Institucion;
    }

    public String getCorreo_Institucion() {
        return correo_Institucion;
    }

    public void setCorreo_Institucion(String correo_Institucion) {
        this.correo_Institucion = correo_Institucion;
    }
}
