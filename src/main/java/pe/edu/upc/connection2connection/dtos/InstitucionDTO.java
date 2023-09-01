package pe.edu.upc.connection2connection.dtos;

public class InstitucionDTO {

    private int id;

    private String nombre_Institucion;

    private String correo_Institucion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_Institucion() {
        return nombre_Institucion;
    }

    public void setNombre_Institucion(String nombre_Institucion) {
        this.nombre_Institucion = nombre_Institucion;
    }

    public String getCorreo_Institucion() {
        return correo_Institucion;
    }

    public void setCorreo_Institucion(String correo_Institucion) {
        this.correo_Institucion = correo_Institucion;
    }
}
