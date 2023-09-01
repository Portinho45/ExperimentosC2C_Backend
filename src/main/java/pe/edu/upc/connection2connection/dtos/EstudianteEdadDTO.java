package pe.edu.upc.connection2connection.dtos;

public class EstudianteEdadDTO {
    private int mayores;
    private int menores;

    public EstudianteEdadDTO() {
    }

    public EstudianteEdadDTO(int mayores, int menores) {
        this.mayores = mayores;
        this.menores = menores;
    }

    public int getMayores() {
        return mayores;
    }

    public void setMayores(int mayores) {
        this.mayores = mayores;
    }

    public int getMenores() {
        return menores;
    }

    public void setMenores(int menores) {
        this.menores = menores;
    }
}
