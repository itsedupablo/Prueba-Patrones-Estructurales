package user;

import models.*;

import services.Componente;

public class App {
    public static void main(String[] args) {
        // Crear elementos simples
        Componente elemento1 = new Elemento(100, 1);
        Componente elemento2 = new Elemento(50, 2);

        // Crear un kit y agregar elementos
        Componente kit = new Kit();
        kit.agregarComponente(elemento1);
        kit.agregarComponente(elemento2);

        // Obtener el precio total del kit (con descuento aplicado)
        double precioTotal = kit.getPrecioTotal();
        System.out.println("El precio total del kit es de: " + precioTotal + "€");
    }
}