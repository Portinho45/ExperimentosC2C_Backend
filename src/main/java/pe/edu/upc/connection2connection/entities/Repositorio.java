package pe.edu.upc.connection2connection.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "repositorios")
public class Repositorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombreRepositorio",length = 200, nullable = false)
    private String nombreRepositorio;
    @Column(name = "descripcionRepositorio",length = 200, nullable = false)
    private String descripcionRepositorio;
    @Column(name = "enlaceRepositorio",length = 200, nullable = false)
    private String enlaceRepositorio;
    @Column(name ="fechaRepositorio", nullable = false )
    private LocalDate fechaRepositorio;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "idEstudiante")
    private Estudiante estudiante;

    public Repositorio(){

    }

    public Repositorio(int id, String nombreRepositorio, String descripcionRepositorio, String enlaceRepositorio, LocalDate fechaRepositorio, Estudiante estudiante) {
        this.id = id;
        this.nombreRepositorio = nombreRepositorio;
        this.descripcionRepositorio = descripcionRepositorio;
        this.enlaceRepositorio = enlaceRepositorio;
        this.fechaRepositorio = fechaRepositorio;
        this.estudiante = estudiante;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreRepositorio() {
        return nombreRepositorio;
    }

    public void setNombreRepositorio(String nombreRepositorio) {
        this.nombreRepositorio = nombreRepositorio;
    }

    public String getDescripcionRepositorio() {
        return descripcionRepositorio;
    }

    public void setDescripcionRepositorio(String descripcionRepositorio) {
        this.descripcionRepositorio = descripcionRepositorio;
    }

    public String getEnlaceRepositorio() {
        return enlaceRepositorio;
    }

    public void setEnlaceRepositorio(String enlaceRepositorio) {
        this.enlaceRepositorio = enlaceRepositorio;
    }

    public LocalDate getFechaRepositorio() {
        return fechaRepositorio;
    }

    public void setFechaRepositorio(LocalDate fechaRepositorio) {
        this.fechaRepositorio = fechaRepositorio;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
