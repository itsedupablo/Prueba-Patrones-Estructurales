package models;

import services.*;

public class ElementoSimpleFactory implements ElementoFactory {
    
	// factory method
    public Elemento crearElemento(int codigo, double precio) {
        return new Elemento(precio, codigo);
    }
}

