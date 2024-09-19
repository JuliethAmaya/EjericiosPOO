
package app;

import java.time.LocalDate;

public class Principal {
    //metodo main
    public static void main(String[] args) {
        CompraInternacional compra1 = new CompraInternacional("C001", "Proveedor A", 50, 20.0, 0.15);
        CompraInternacional compra2 = new CompraInternacional("C002", "Proveedor B", 30, 15.0, 0.15);
        CompraInternacional compra3 = new CompraInternacional("C003", "Proveedor C", 100, 10.0, 0.15);

        System.out.println(compra1);
        System.out.println(compra2);
        System.out.println(compra3);
        
        System.out.println("*******************************************************************************************");
        
        ServicioUrgente servicio1 = new ServicioUrgente("S001", "Reparacion urgente", 50.0, 2.0, 0.25);
        ServicioUrgente servicio2 = new ServicioUrgente("S002", "Mantenimiento urgente", 40.0, 3.0, 0.25);
        ServicioUrgente servicio3 = new ServicioUrgente("S003", "Instalacion urgente", 60.0, 1.0, 0.25);

        System.out.println(servicio1);
        System.out.println(servicio2);
        System.out.println(servicio3);
        
        System.out.println("*******************************************************************************************");
        
        ProductoFragil productoA = new ProductoFragil("P001", "Vaso de vidrio", 100, 2.50, "alto");
        ProductoFragil productoB = new ProductoFragil("P002", "Plato de ceramica", 200, 3.00, "medio");
        ProductoFragil productoC = new ProductoFragil("P003", "Espejo", 50, 10.00, "alto");

        System.out.println(productoA);
        System.out.println(productoB);
        System.out.println(productoC);
        
        System.out.println("*******************************************************************************************");
        
        InversionRiesgo inversion1 = new InversionRiesgo("INV001", "Maria Herrera", 1000.0, 5.0, "alto");
        InversionRiesgo inversion2 = new InversionRiesgo("INV002", "Carlos Amaya", 2000.0, 4.0, "medio");
        InversionRiesgo inversion3 = new InversionRiesgo("INV003", "Ivan Fuentes", 1500.0, 3.0, "bajo");

        System.out.println(inversion1);
        System.out.println(inversion2);
        System.out.println(inversion3);
        
        System.out.println("*******************************************************************************************");
        
        PedidoExpress pedido1 = new PedidoExpress(1, "Juan Martinez", 10, 15.0, 5.0, 2);
        PedidoExpress pedido2 = new PedidoExpress(2, "Daniel Castillo", 5, 20.0, 10.0, 1);

        System.out.println(pedido1);
        System.out.println(pedido2);
            
        System.out.println("*******************************************************************************************");
        
        FacturaConDescuento factura1 = new FacturaConDescuento("F001", 1000.00, 50.00);
        FacturaConDescuento factura2 = new FacturaConDescuento("F002", 2000.00, 100.00);
        FacturaConDescuento factura3 = new FacturaConDescuento("F003", 3000.00, 150.00);

        System.out.println(factura1);
        System.out.println(factura2);
        System.out.println(factura3);
        
        System.out.println("*******************************************************************************************");
        
        ClienteFrecuente cliente1 = new ClienteFrecuente("Juan Perez", "Calle Falsa 123", "555-1234", 0.10, 5);
        ClienteFrecuente cliente2 = new ClienteFrecuente("Ana Gomez", "Avenida Siempre Viva 742", "555-5678", 0.50, 10);
        ClienteFrecuente cliente3 = new ClienteFrecuente("Carlos Lopez", "Plaza Mayor 1", "555-8765", 0.10, 3);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        
        System.out.println("*******************************************************************************************");
        
        ProductoPerecedero producto1 = new ProductoPerecedero("001", "Leche", 1.50, LocalDate.of(2024, 8, 1));
        ProductoPerecedero producto2 = new ProductoPerecedero("002", "Yogur", 0.90, LocalDate.of(2024, 7, 30));
        ProductoPerecedero producto3 = new ProductoPerecedero("003", "Queso", 3.00, LocalDate.of(2024, 8, 10));

        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
        
        System.out.println("*******************************************************************************************");
        
        Gerente gerente1 = new Gerente("Ana Perez", 5000, 1500);
        Gerente gerente2 = new Gerente("Carlos Gomez", 6000, 2000);

        System.out.println(gerente1);
        System.out.println(gerente2);
        
        Empleado emple1 = new Empleado("Ana",5000);
        Empleado emple2 = new Empleado("Pedro",8000);
    
        System.out.println(emple1);
        System.out.println(emple2);
    }
    
            
    
}
