package pe.edu.upc.connection2connection.dtos;

public class EmpresaReclutadorDTO {

    private String nameEmpresa;

    private int reclutadorCount;

    public EmpresaReclutadorDTO(){

    }

    public EmpresaReclutadorDTO(String nameEmpresa, int reclutadorCount) {
        this.nameEmpresa = nameEmpresa;
        this.reclutadorCount = reclutadorCount;
    }

    public String getNameEmpresa() {
        return nameEmpresa;
    }

    public void setNameEmpresa(String nameEmpresa) {
        this.nameEmpresa = nameEmpresa;
    }

    public int getReclutadorCount() {
        return reclutadorCount;
    }

    public void setReclutadorCount(int reclutadorCount) {
        this.reclutadorCount = reclutadorCount;
    }
}
