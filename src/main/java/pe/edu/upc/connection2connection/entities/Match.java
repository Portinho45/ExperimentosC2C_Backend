package pe.edu.upc.connection2connection.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "match")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo_match;
    @Column(name = "confirmacion_match", length = 60, nullable = false)
    private boolean confirmacion_match;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "Reclutador_id")
    private Reclutador reclutador;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "Estudiante_id")
    private Estudiante estudiante;


    public Match() {
    }

    public Match(int id, int codigo_match, boolean confirmacion_match, Reclutador reclutador, Estudiante estudiante) {
        this.id = id;
        this.codigo_match = codigo_match;
        this.confirmacion_match = confirmacion_match;
        this.reclutador = reclutador;
        this.estudiante = estudiante;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo_match() {
        return codigo_match;
    }

    public void setCodigo_match(int codigo_match) {
        this.codigo_match = codigo_match;
    }

    public boolean isConfirmacion_match() {
        return confirmacion_match;
    }

    public void setConfirmacion_match(boolean confirmacion_match) {
        this.confirmacion_match = confirmacion_match;
    }

    public Reclutador getReclutador() {
        return reclutador;
    }

    public void setReclutador(Reclutador reclutador) {
        this.reclutador = reclutador;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
