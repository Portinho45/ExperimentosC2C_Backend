package pe.edu.upc.connection2connection.dtos;

import pe.edu.upc.connection2connection.entities.Estudiante;


import java.time.LocalDate;

public class RepositorioDTO {

    private int id;

    private String nombreRepositorio;

    private String descripcionRepositorio;

    private String enlaceRepositorio;

    private LocalDate fechaRepositorio;

    private Estudiante estudiante;

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
