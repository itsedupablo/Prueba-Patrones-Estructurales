package models;

import java.util.*;

import services.Componente;
public class Kit implements Componente {
	private String nombre;
    private List<Componente> componentes;

    //Constructor
    public Kit() {
        componentes = new ArrayList<Componente>();
    }

    // Métodos de la interfaz Componente
    public void agregarComponente(Componente componente) {
        componentes.add(componente);
    }

    public void eliminarComponente(Componente componente) {
        componentes.remove(componente);
    }

    public double getPrecioTotal() {
        double precioTotal = 0;
        for (Componente componente : componentes) {
            precioTotal += componente.getPrecioTotal();
        }
        return precioTotal * 0.9; // Aplicar descuento del 10%
    }
    
    // Getter
    public String getNombre() {
    	return nombre;
    }
}