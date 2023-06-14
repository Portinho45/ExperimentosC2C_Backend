package pe.edu.upc.connection2connection.dtos;

import pe.edu.upc.connection2connection.entities.Institucion;
import pe.edu.upc.connection2connection.entities.Usuario;

public class EstudianteDTO {
    private int idEstudiante;
    private int semestre_Estudiante;
    private int edad_Estudiante;
    private String genero_Estudiante;
    private boolean practicante_Estudiante;
    private String descripcion_Estudiante;
    private Institucion institucion_Estudiante;
    private Usuario usuario_Estudiante;

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getSemestre_Estudiante() {
        return semestre_Estudiante;
    }

    public void setSemestre_Estudiante(int semestre_Estudiante) {
        this.semestre_Estudiante = semestre_Estudiante;
    }

    public int getEdad_Estudiante() {
        return edad_Estudiante;
    }

    public void setEdad_Estudiante(int edad_Estudiante) {
        this.edad_Estudiante = edad_Estudiante;
    }

    public String getGenero_Estudiante() {
        return genero_Estudiante;
    }

    public void setGenero_Estudiante(String genero_Estudiante) {
        this.genero_Estudiante = genero_Estudiante;
    }

    public boolean isPracticante_Estudiante() {
        return practicante_Estudiante;
    }

    public void setPracticante_Estudiante(boolean practicante_Estudiante) {
        this.practicante_Estudiante = practicante_Estudiante;
    }

    public String getDescripcion_Estudiante() {
        return descripcion_Estudiante;
    }

    public void setDescripcion_Estudiante(String descripcion_Estudiante) {
        this.descripcion_Estudiante = descripcion_Estudiante;
    }

    public Institucion getInstitucion_Estudiante() {
        return institucion_Estudiante;
    }

    public void setInstitucion_Estudiante(Institucion institucion_Estudiante) {
        this.institucion_Estudiante = institucion_Estudiante;
    }

    public Usuario getUsuario_Estudiante() {
        return usuario_Estudiante;
    }

    public void setUsuario_Estudiante(Usuario usuario_Estudiante) {
        this.usuario_Estudiante = usuario_Estudiante;
    }
}
