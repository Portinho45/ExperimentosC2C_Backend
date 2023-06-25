package pe.edu.upc.connection2connection.dtos;

public class ReclutadorMatchDTO {
    private int countestudiantesmatch;
    private String reclutadorm;

    public ReclutadorMatchDTO() {
    }

    public ReclutadorMatchDTO(int countestudiantesmatch, String reclutadorm) {
        this.countestudiantesmatch = countestudiantesmatch;
        this.reclutadorm = reclutadorm;
    }

    public int getCountestudiantesmatch() {
        return countestudiantesmatch;
    }

    public void setCountestudiantesmatch(int countestudiantesmatch) {
        this.countestudiantesmatch = countestudiantesmatch;
    }

    public String getReclutadorm() {
        return reclutadorm;
    }

    public void setReclutadorm(String reclutadorm) {
        this.reclutadorm = reclutadorm;
    }
}
