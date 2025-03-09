package primerlabestrdatosconcesionariovehiculos.Clases;

public class Vehiculo {
    private String modelo;
    private Vehiculo anterior;
    private Vehiculo siguiente;

    public Vehiculo(String modelo) {
        this.modelo = modelo;
        this.anterior = null;
        this.siguiente = null;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Vehiculo getAnterior() {
        return anterior;
    }

    public void setAnterior(Vehiculo anterior) {
        this.anterior = anterior;
    }

    public Vehiculo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Vehiculo siguiente) {
        this.siguiente = siguiente;
    }
}
