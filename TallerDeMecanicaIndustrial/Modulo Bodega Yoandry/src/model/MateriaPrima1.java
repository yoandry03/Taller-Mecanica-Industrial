package model;

public class MateriaPrima1 extends Bodega{

    public MateriaPrima1() {
    }

    public MateriaPrima1(String nombreB, int cantEstibas, int cantTrabajadores, String tipoMP) {
        super(nombreB, cantEstibas, cantTrabajadores, tipoMP);
    }

    @Override
    public String toString() {
        return "MateriaPrima1{" + '}';
    }
    
}
