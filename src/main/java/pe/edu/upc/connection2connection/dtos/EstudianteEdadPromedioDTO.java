package pe.edu.upc.connection2connection.dtos;

public class EstudianteEdadPromedioDTO {
    private double promedioedad;
    private int countestudiantes;

    public EstudianteEdadPromedioDTO() {
    }

    public EstudianteEdadPromedioDTO(double promedioedad, int countestudiantes) {
        this.promedioedad = promedioedad;
        this.countestudiantes = countestudiantes;
    }

    public double getPromedioedad() {
        return promedioedad;
    }

    public void setPromedioedad(double promedioedad) {
        this.promedioedad = promedioedad;
    }

    public int getCountestudiantes() {
        return countestudiantes;
    }

    public void setCountestudiantes(int countestudiantes) {
        this.countestudiantes = countestudiantes;
    }
}
