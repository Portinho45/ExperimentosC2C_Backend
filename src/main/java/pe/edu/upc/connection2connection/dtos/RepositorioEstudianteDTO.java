package pe.edu.upc.connection2connection.dtos;

public class RepositorioEstudianteDTO {

    private String nameEstudiante;

    private String correoEstudiante;

    private int edadEstudiante;

    private boolean practicanteEstudiante;

    private int repositorioCount;

    public RepositorioEstudianteDTO(){

    }

    public RepositorioEstudianteDTO(String nameEstudiante, String correoEstudiante, int edadEstudiante, boolean practicanteEstudiante, int repositorioCount) {
        this.nameEstudiante = nameEstudiante;
        this.correoEstudiante = correoEstudiante;
        this.edadEstudiante = edadEstudiante;
        this.practicanteEstudiante = practicanteEstudiante;
        this.repositorioCount = repositorioCount;
    }

    public String getNameEstudiante() {
        return nameEstudiante;
    }

    public void setNameEstudiante(String nameEstudiante) {
        this.nameEstudiante = nameEstudiante;
    }

    public String getCorreoEstudiante() {
        return correoEstudiante;
    }

    public void setCorreoEstudiante(String correoEstudiante) {
        this.correoEstudiante = correoEstudiante;
    }

    public int getEdadEstudiante() {
        return edadEstudiante;
    }

    public void setEdadEstudiante(int edadEstudiante) {
        this.edadEstudiante = edadEstudiante;
    }

    public boolean isPracticanteEstudiante() {
        return practicanteEstudiante;
    }

    public void setPracticanteEstudiante(boolean practicanteEstudiante) {
        this.practicanteEstudiante = practicanteEstudiante;
    }

    public int getRepositorioCount() {
        return repositorioCount;
    }

    public void setRepositorioCount(int repositorioCount) {
        this.repositorioCount = repositorioCount;
    }
}
