package pe.edu.upc.connection2connection.entities;

import javax.persistence.*;

@Entity
@Table(name="requisitos")
public class Requisito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "descripcion_Requisito", length = 60, nullable = false)//largo de 60 y es obligatorio(nullable)
    private  String descripcion_Requisito;


    public Requisito(){

    }

    public Requisito(int id, String descripcion_Requisito) {
        this.id = id;
        this.descripcion_Requisito = descripcion_Requisito;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion_Requisito() {
        return descripcion_Requisito;
    }

    public void setDescripcion_Requisito(String descripcion_Requisito) {
        this.descripcion_Requisito = descripcion_Requisito;
    }
}
