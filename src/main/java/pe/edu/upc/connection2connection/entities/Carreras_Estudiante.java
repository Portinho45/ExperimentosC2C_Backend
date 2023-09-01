package pe.edu.upc.connection2connection.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "Carreras_Estudiante")

public class Carreras_Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "Estudiante_id")
    private Estudiante estudiante;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "Carrera_id")
    private Carrera carrera;

    public Carreras_Estudiante(){

    }

    public Carreras_Estudiante(int id, Estudiante estudiante, Carrera carrera) {
        this.id = id;
        this.estudiante = estudiante;
        this.carrera = carrera;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

}
