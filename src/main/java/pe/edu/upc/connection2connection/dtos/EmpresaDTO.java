package pe.edu.upc.connection2connection.dtos;

public class EmpresaDTO {

    private int id;

    private String nombre_Empresa;

    private String descripcion_Empresa;

    private String correo_Empresa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_Empresa() {
        return nombre_Empresa;
    }

    public void setNombre_Empresa(String nombre_Empresa) {
        this.nombre_Empresa = nombre_Empresa;
    }

    public String getDescripcion_Empresa() {
        return descripcion_Empresa;
    }

    public void setDescripcion_Empresa(String descripcion_Empresa) {
        this.descripcion_Empresa = descripcion_Empresa;
    }

    public String getCorreo_Empresa() {
        return correo_Empresa;
    }

    public void setCorreo_Empresa(String correo_Empresa) {
        this.correo_Empresa = correo_Empresa;
    }
}
