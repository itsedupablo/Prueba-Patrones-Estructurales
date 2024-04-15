package models;

import services.ElementoFactory;

public abstract class ElementoFactoryImpl implements ElementoFactory {
    
	// Método de la interfaz ElementoFactory
    public Elemento crearElemento(double precio, int codigo) {
        return new Elemento(precio, codigo);
    }

	



	
}