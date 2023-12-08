package model;

public class Proveedor {
    
    private String idP;
    private String nombreP;
    private String numeroTP;

    public Proveedor() {
    }

    public Proveedor(String idP, String nombreP, String numeroTP) {
        this.idP = idP;
        this.nombreP = nombreP;
        this.numeroTP = numeroTP;
    }

    public String getIdP() {
        return idP;
    }

    public void setIdP(String idP) {
        this.idP = idP;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getNumeroTP() {
        return numeroTP;
    }

    public void setNumeroTP(String numeroTP) {
        this.numeroTP = numeroTP;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "idP=" + idP + ", nombreP=" + nombreP + ", numeroTP=" + numeroTP + '}';
    }
    
    
     
}
