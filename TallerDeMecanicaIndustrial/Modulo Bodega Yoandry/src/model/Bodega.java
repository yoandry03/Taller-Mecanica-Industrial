package model;

public class Bodega {
   
    private String nombreB;
    private int cantEstibas;
    private int cantTrabajadores;
    private String tipoMP;

    public Bodega() {
    }

    public Bodega(String nombreB, int cantEstibas, int cantTrabajadores, String tipoMP) {
        this.nombreB = nombreB;
        this.cantEstibas = cantEstibas;
        this.cantTrabajadores = cantTrabajadores;
        this.tipoMP = tipoMP;
    }

    public String getNombreB() {
        return nombreB;
    }

    public void setNombreB(String nombreB) {
        this.nombreB = nombreB;
    }

    public int getCantEstibas() {
        return cantEstibas;
    }

    public void setCantEstibas(int cantEstibas) {
        this.cantEstibas = cantEstibas;
    }

    public int getCantTrabajadores() {
        return cantTrabajadores;
    }

    public void setCantTrabajadores(int cantTrabajadores) {
        this.cantTrabajadores = cantTrabajadores;
    }

    public String getTipoMP() {
        return tipoMP;
    }

    public void setTipoMP(String tipoMP) {
        this.tipoMP = tipoMP;
    }

    @Override
    public String toString() {
        return "Bodega{" + "nombreB=" + nombreB + ", cantEstibas=" + cantEstibas + ", cantTrabajadores=" + cantTrabajadores + ", tipoMP=" + tipoMP + '}';
    }
    
    
    
}
