package pe.edu.upc.connection2connection.entities;

import javax.persistence.*;

@Entity
@Table(name = "carreras")

public class Carrera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre_Carrera", length = 60, nullable = false)//largo de 60 y es obligatorio
    private  String nombre_Carrera;


    public Carrera(){

    }

    public Carrera(int id, String nombre_Carrera) {
        this.id = id;
        this.nombre_Carrera = nombre_Carrera;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_Carrera() {
        return nombre_Carrera;
    }

    public void setNombre_Carrera(String nombre_Carrera) {
        this.nombre_Carrera = nombre_Carrera;
    }

}
