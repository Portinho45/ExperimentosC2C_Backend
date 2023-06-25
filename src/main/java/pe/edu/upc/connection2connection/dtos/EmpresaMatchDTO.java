package pe.edu.upc.connection2connection.dtos;

public class EmpresaMatchDTO {
    private int countestudiantesmatch;
    private String empresam;

    public EmpresaMatchDTO() {
    }

    public EmpresaMatchDTO(int countestudiantesmatch, String empresam) {
        this.countestudiantesmatch = countestudiantesmatch;
        this.empresam = empresam;
    }

    public int getCountestudiantesmatch() {
        return countestudiantesmatch;
    }

    public void setCountestudiantesmatch(int countestudiantesmatch) {
        this.countestudiantesmatch = countestudiantesmatch;
    }

    public String getEmpresam() {
        return empresam;
    }

    public void setEmpresam(String empresam) {
        this.empresam = empresam;
    }
}
