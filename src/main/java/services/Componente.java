package services;

public interface Componente {
	// Métodos de la interfaz Componente para el patrón Composite
    void agregarComponente(Componente componente);
    void eliminarComponente(Componente componente);
    double getPrecioTotal();
}

