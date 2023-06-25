package pe.edu.upc.connection2connection.dtos;

public class InstitucionEstudianteDTO {
    private String institucion;

    private int countestudiantes;

    public InstitucionEstudianteDTO() {

    }

    public InstitucionEstudianteDTO(String institucion, int countestudiantes) {
        this.institucion = institucion;
        this.countestudiantes = countestudiantes;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public int getCountestudiantes() {
        return countestudiantes;
    }

    public void setCountestudiantes(int countestudiantes) {
        this.countestudiantes = countestudiantes;
    }
}
