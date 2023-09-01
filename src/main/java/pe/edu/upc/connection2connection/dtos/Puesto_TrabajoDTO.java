package pe.edu.upc.connection2connection.dtos;

import pe.edu.upc.connection2connection.entities.Reclutador;
import pe.edu.upc.connection2connection.entities.Requisito;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Puesto_TrabajoDTO {

    private int id;

    private Requisito requisito;

    private Reclutador reclutador;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Requisito getRequisito() {
        return requisito;
    }

    public void setRequisito(Requisito requisito) {
        this.requisito = requisito;
    }

    public Reclutador getReclutador() {
        return reclutador;
    }

    public void setReclutador(Reclutador reclutador) {
        this.reclutador = reclutador;
    }
}
