
package app;


public class Principal {
    public static void main(String[] args) {
        Compra compra1 = new Compra("C001", "Proveedor A", 100, 5.00);
        Compra compra2 = new Compra("C002", "Proveedor B", 200, 3.50);
        Compra compra3 = new Compra("C003", "Proveedor C", 150, 4.00);

        System.out.println(compra1);
        System.out.println(compra2);
        System.out.println(compra3);
        
        System.out.println("*************************************************************************************");
        
        Servicio servicio1 = new Servicio("S001", "Desarrollo web", 50.00, 40);
        Servicio servicio2 = new Servicio("S002", "Consultoria TI", 100.00, 20);
        Servicio servicio3 = new Servicio("S003", "Mantenimiento de sistemas", 75.00, 30);

        System.out.println(servicio1);
        System.out.println(servicio2);
        System.out.println(servicio3);
        
        System.out.println("*************************************************************************************");
        
        Pago pago1 = new Pago("P001", "Juan Perez", 1000.00, 150.00, 50.00);
        Pago pago2 = new Pago("P002", "Ana Gomez", 1200.00, 100.00, 60.00);
        Pago pago3 = new Pago("P003", "Carlos Lopez", 1100.00, 200.00, 70.00);

        System.out.println(pago1);
        System.out.println(pago2);
        System.out.println(pago3);
        
        System.out.println("*************************************************************************************");
        
        ProductoAlmacen Producto1 = new ProductoAlmacen("PA001", "Teclado", 50, 25.50);
        ProductoAlmacen Producto2 = new ProductoAlmacen("PA002", "Monitor", 30, 150.00);
        ProductoAlmacen Producto3 = new ProductoAlmacen("PA003", "Mouse", 100, 10.00);

        System.out.println(Producto1);
        System.out.println(Producto2);
        System.out.println(Producto3);
        
        System.out.println("*************************************************************************************");
        
        Inversion inversion1 = new Inversion("INV001", "Juan Perez", 10000.00, 5.0);
        Inversion inversion2 = new Inversion("INV002", "Ana Gomez", 20000.00, 4.5);
        Inversion inversion3 = new Inversion("INV003", "Carlos Lopez", 15000.00, 6.0);

        System.out.println(inversion1);
        System.out.println(inversion2);
        System.out.println(inversion3);
        
        System.out.println("*************************************************************************************");
        
        Pedido pedido1 = new Pedido("P001", "Juan Perez", 10, 25.50);
        Pedido pedido2 = new Pedido("P002", "Ana Gomez", 5, 30.00);
        Pedido pedido3 = new Pedido("P003", "Carlos Lopez", 20, 15.75);

        System.out.println(pedido1);
        System.out.println(pedido2);
        System.out.println(pedido3);
        
        System.out.println("*************************************************************************************");
        
        Factura factura1 = new Factura("F001", "03-05-2024", 1000.00);
        Factura factura2 = new Factura("F002", "05-05-2024", 1500.00);
        Factura factura3 = new Factura("F003", "06-05-2024", 2000.00);

        System.out.println(factura1);
        System.out.println(factura2);
        System.out.println(factura3);
        
        System.out.println("*************************************************************************************");
        
        ProductoInventario producto1 = new ProductoInventario("001", "Laptop", 10, 750.00);
        ProductoInventario producto2 = new ProductoInventario("002", "Smartphone", 20, 300.00);
        ProductoInventario producto3 = new ProductoInventario("003", "Tablet", 15, 200.00);

        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
        
        System.out.println("*************************************************************************************");
        
        Empleado empleado1 = new Empleado("Juan Perez", 40, 15.50);
        Empleado empleado2 = new Empleado("Ana Gomez", 35, 18.00);
        Empleado empleado3 = new Empleado("Carlos Lopez", 45, 20.00);

        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        
        System.out.println("*************************************************************************************");
        
        Venta venta1 = new Venta("Laptop", 3, 750.00);
        Venta venta2 = new Venta("Smartphone", 5, 300.00);
        Venta venta3 = new Venta("Tablet", 2, 200.00);

        System.out.println(venta1);
        System.out.println(venta2);
        System.out.println(venta3);
    }
    
}
