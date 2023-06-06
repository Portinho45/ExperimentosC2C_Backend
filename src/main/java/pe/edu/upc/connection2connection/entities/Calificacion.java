package pe.edu.upc.connection2connection.entities;

import javax.persistence.*;

@Entity
@Table(name = "Calificacion")
public class Calificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "idEstudiante_Calificacion", length = 3, nullable = false)//largo de 60 y es obligatorio(nullable)
    private  int idEstudiante_Calificacion;
    @Column(name = "calificacion_Calificacion", length = 3, nullable = false)//largo de 60 y es obligatorio(nullable)
    private  int calificacion_Calificacion;


    public Calificacion(){

    }

    public Calificacion(int id, int idEstudiante_Calificacion, int calificacion_Calificacion) {
        this.id = id;
        this.idEstudiante_Calificacion = idEstudiante_Calificacion;
        this.calificacion_Calificacion = calificacion_Calificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getidEstudiante_Calificacion() {
        return idEstudiante_Calificacion;
    }

    public void setidEstudiante_Calificacion(int idEstudiante_Calificacion) { this.idEstudiante_Calificacion = idEstudiante_Calificacion; }

    public int getcalificacion_Calificacion() {
        return calificacion_Calificacion;
    }

    public void setcalificacion_Calificacion(int calificacion_Calificacion) { this.calificacion_Calificacion = calificacion_Calificacion; }


}
