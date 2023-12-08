package model;

public class Gerente {
    
    private String idGerente;
    private String nombreGerente;
    private String direccionGerente;

    public Gerente() {
    }

    public Gerente(String idGerente, String nombreGerente, String direccionGerente) {
        this.idGerente = idGerente;
        this.nombreGerente = nombreGerente;
        this.direccionGerente = direccionGerente;
    }

    public String getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(String idGerente) {
        this.idGerente = idGerente;
    }

    public String getNombreGerente() {
        return nombreGerente;
    }

    public void setNombreGerente(String nombreGerente) {
        this.nombreGerente = nombreGerente;
    }

    public String getDireccionGerente() {
        return direccionGerente;
    }

    public void setDireccionGerente(String direccionGerente) {
        this.direccionGerente = direccionGerente;
    }

    @Override
    public String toString() {
        return "Gerente{" + "idGerente=" + idGerente + ", nombreGerente=" + nombreGerente + ", direccionGerente=" + direccionGerente + '}';
    }
    
    
    
}
