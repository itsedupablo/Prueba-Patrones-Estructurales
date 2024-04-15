package services;

import models.*;

public interface ElementoFactory {
    Elemento crearElemento(int codigo, double precio);
}
