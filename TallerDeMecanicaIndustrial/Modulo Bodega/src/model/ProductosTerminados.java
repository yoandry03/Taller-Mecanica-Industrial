package model;

public class ProductosTerminados extends Bodega{
    
    private int cantidadPT;

    public ProductosTerminados() {
    }

    public ProductosTerminados(int cantidadPT) {
        this.cantidadPT = cantidadPT;
    }
    
    public ProductosTerminados(String nombreB, int cantEstibas, int cantTrabajadores, String tipoMP) {
        super(nombreB, cantEstibas, cantTrabajadores, tipoMP);
    }

    public int getCantidadPT() {
        return cantidadPT;
    }

    public void setCantidadPT(int cantidadPT) {
        this.cantidadPT = cantidadPT;
    }

    @Override
    public String toString() {
        return "ProductosTerminados{" + "cantidadPT=" + cantidadPT + '}';
    }
    
    
    
}
