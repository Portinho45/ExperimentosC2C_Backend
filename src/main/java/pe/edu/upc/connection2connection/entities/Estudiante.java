package pe.edu.upc.connection2connection.entities;

import javax.persistence.*;

@Entity
@Table(name="Estudiantes")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstudiante;
    @Column(name="semestre_Estudiante",length = 6,nullable = false)
    private int semestre_Estudiante;
    @Column(name="edad_Estudiante",length = 60,nullable = false)
    private int edad_Estudiante;
    @Column(name="genero_Estudiante",length = 60,nullable = false)
    private String genero_Estudiante;
    @Column(name="practicante_Estudiante",length = 60,nullable = false)
    private boolean practicante_Estudiante;
    @Column(name="descripcion_Estudiante",length = 60,nullable = false)
    private String descripcion_Estudiante;
    @ManyToOne
    @JoinColumn(name = "Institucion_educativa_id")
    private Institucion institucion_Estudiante;

    @ManyToOne
    @JoinColumn(name = "Usuario_id")
    private Usuario usuario_Estudiante;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, int semestre_Estudiante, int edad_Estudiante, String genero_Estudiante, boolean practicante_Estudiante, String descripcion_Estudiante, Institucion institucion_Estudiante, Usuario usuario_Estudiante) {
        this.idEstudiante = idEstudiante;
        this.semestre_Estudiante = semestre_Estudiante;
        this.edad_Estudiante = edad_Estudiante;
        this.genero_Estudiante = genero_Estudiante;
        this.practicante_Estudiante = practicante_Estudiante;
        this.descripcion_Estudiante = descripcion_Estudiante;
        this.institucion_Estudiante = institucion_Estudiante;
        this.usuario_Estudiante = usuario_Estudiante;
    }

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
