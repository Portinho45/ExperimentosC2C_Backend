package pe.edu.upc.connection2connection.dtos;

import pe.edu.upc.connection2connection.entities.Calificacion;
import pe.edu.upc.connection2connection.entities.Estudiante;

public class Calificacion_EstudianteDTO {


    private int id;
    private Estudiante estudiante;
    private Calificacion calificacion;

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

