package pe.edu.upc.connection2connection.entities;

import javax.persistence.*;

@Entity
@Table(name="Estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstudiante;
    @Column(name="Semestre_Estudiante",length = 6,nullable = false)
    private int Semestre_Estudiante;
    @Column(name="Edad_Estudiante",length = 60,nullable = false)
    private int Edad_Estudiante;
    @Column(name="Genero_Estudiante",length = 60,nullable = false)
    private String Genero_Estudiante;
    @Column(name="Practicante_Estudiante",length = 60,nullable = false)
    private boolean Practicante_Estudiante;
    @Column(name="Descripcion_Estudiante",length = 60,nullable = false)
    private String Descripcion_Estudiante;
    @ManyToOne
    @JoinColumn(name = "Institucion_Educativa_id")
    private Institucion Institucion_Estudiante;

    @ManyToOne
    @JoinColumn(name = "Usuario_id")
    private Usuario Usuario_Estudiante;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, int semestre_Estudiante, int edad_Estudiante, String genero_Estudiante, boolean practicante_Estudiante, String descripcion_Estudiante, Institucion institucion_Estudiante, Usuario usuario_Estudiante) {
        this.idEstudiante = idEstudiante;
        Semestre_Estudiante = semestre_Estudiante;
        Edad_Estudiante = edad_Estudiante;
        Genero_Estudiante = genero_Estudiante;
        Practicante_Estudiante = practicante_Estudiante;
        Descripcion_Estudiante = descripcion_Estudiante;
        Institucion_Estudiante = institucion_Estudiante;
        Usuario_Estudiante = usuario_Estudiante;
    }

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
