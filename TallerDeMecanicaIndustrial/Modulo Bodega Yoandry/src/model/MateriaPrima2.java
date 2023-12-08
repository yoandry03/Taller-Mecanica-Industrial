package model;

public class MateriaPrima2 extends Bodega{

    public MateriaPrima2() {
    }

    public MateriaPrima2(String nombreB, int cantEstibas, int cantTrabajadores, String tipoMP) {
        super(nombreB, cantEstibas, cantTrabajadores, tipoMP);
    }

    @Override
    public String toString() {
        return "MateriaPrima2{" + '}';
    }
    
    
}
