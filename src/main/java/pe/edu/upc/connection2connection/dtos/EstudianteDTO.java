package pe.edu.upc.connection2connection.dtos;

import pe.edu.upc.connection2connection.entities.Institucion;
import pe.edu.upc.connection2connection.entities.Usuario;

public class EstudianteDTO {
    private int idEstudiante;
    private int Semestre_Estudiante;
    private int Edad_Estudiante;
    private String Genero_Estudiante;
    private boolean Practicante_Estudiante;
    private String Descripcion_Estudiante;
    private Institucion Institucion_Estudiante;
    private Usuario Usuario_Estudiante;

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getSemestre_Estudiante() {
        return Semestre_Estudiante;
    }

    public void setSemestre_Estudiante(int semestre_Estudiante) {
        Semestre_Estudiante = semestre_Estudiante;
    }

    public int getEdad_Estudiante() {
        return Edad_Estudiante;
    }

    public void setEdad_Estudiante(int edad_Estudiante) {
        Edad_Estudiante = edad_Estudiante;
    }

    public String getGenero_Estudiante() {
        return Genero_Estudiante;
    }

    public void setGenero_Estudiante(String genero_Estudiante) {
        Genero_Estudiante = genero_Estudiante;
    }

    public boolean isPracticante_Estudiante() {
        return Practicante_Estudiante;
    }

    public void setPracticante_Estudiante(boolean practicante_Estudiante) {
        Practicante_Estudiante = practicante_Estudiante;
    }

    public String getDescripcion_Estudiante() {
        return Descripcion_Estudiante;
    }

    public void setDescripcion_Estudiante(String descripcion_Estudiante) {
        Descripcion_Estudiante = descripcion_Estudiante;
    }

    public Institucion getInstitucion_Estudiante() {
        return Institucion_Estudiante;
    }

    public void setInstitucion_Estudiante(Institucion institucion_Estudiante) {
        Institucion_Estudiante = institucion_Estudiante;
    }

    public Usuario getUsuario_Estudiante() {
        return Usuario_Estudiante;
    }

    public void setUsuario_Estudiante(Usuario usuario_Estudiante) {
        Usuario_Estudiante = usuario_Estudiante;
    }
}
