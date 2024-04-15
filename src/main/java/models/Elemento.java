package models;

import services.Componente;

public class Elemento implements Componente {
    private double precio;
    private int codigo;

    // Constructor
    public Elemento(double precio, int codigo) {
        this.precio = precio;
        this.codigo = codigo;
    }

    // Métodos de la interfaz Componente
    public void agregarComponente(Componente componente) {
        throw new UnsupportedOperationException("No se pueden agregar componentes a un elemento simple");
    }

    public void eliminarComponente(Componente componente) {
        throw new UnsupportedOperationException("No se pueden eliminar componentes de un elemento simple");
    }

    public double getPrecioTotal() {
        return precio;
    }
}