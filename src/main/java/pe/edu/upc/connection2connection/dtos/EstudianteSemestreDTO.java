package pe.edu.upc.connection2connection.dtos;

public class EstudianteSemestreDTO {
    private int countestudiante;
    private int semestree;

    public EstudianteSemestreDTO() {
    }

    public EstudianteSemestreDTO(int countestudiante, int semestree) {
        this.countestudiante = countestudiante;
        this.semestree = semestree;
    }

    public int getCountestudiante() {
        return countestudiante;
    }

    public void setCountestudiante(int countestudiante) {
        this.countestudiante = countestudiante;
    }

    public int getSemestree() {
        return semestree;
    }

    public void setSemestree(int semestree) {
        this.semestree = semestree;
    }
}
