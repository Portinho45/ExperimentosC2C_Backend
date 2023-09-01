package pe.edu.upc.connection2connection.dtos;

public class EstudiantePracticasDTO {
    private int buscapracticas;

    private int nobuscapracticas;

    public EstudiantePracticasDTO() {
    }

    public EstudiantePracticasDTO(int buscapracticas, int nobuscapracticas) {
        this.buscapracticas = buscapracticas;
        this.nobuscapracticas = nobuscapracticas;
    }

    public int getBuscapracticas() {
        return buscapracticas;
    }

    public void setBuscapracticas(int buscapracticas) {
        this.buscapracticas = buscapracticas;
    }

    public int getNobuscapracticas() {
        return nobuscapracticas;
    }

    public void setNobuscapracticas(int nobuscapracticas) {
        this.nobuscapracticas = nobuscapracticas;
    }
}
