package pe.edu.upc.connection2connection.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "Calificacion_Estudiante")
public class Calificacion_Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "Estudiante_id")
    private Estudiante estudiante;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "Calificacion_id")
    private Calificacion calificacion;

    public Calificacion_Estudiante(){

    }

    public Calificacion_Estudiante(int id, Estudiante estudiante, Calificacion calificacion) {
        this.id = id;
        this.estudiante = estudiante;
        this.calificacion = calificacion;
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

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }
}
