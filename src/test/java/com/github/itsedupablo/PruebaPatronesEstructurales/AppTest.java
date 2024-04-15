package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import models.Elemento;
import models.Kit;
import services.Componente;

public class AppTest {
    
    @Test
    public void testPrecioTotalKitConDescuento() {
        // Crear elementos simples
        Componente elemento1 = new Elemento(100, 1);
        Componente elemento2 = new Elemento(50, 2);

        // Crear un kit y agregar elementos
        Componente kit = new Kit();
        kit.agregarComponente(elemento1);
        kit.agregarComponente(elemento2);

        // Obtener el precio total del kit (con descuento aplicado)
        double precioTotal = kit.getPrecioTotal();
        
        // Comprobar que el precio total es el esperado (150 con 10% de descuento)
        assertEquals(135, precioTotal, 0.001);
    }
}

