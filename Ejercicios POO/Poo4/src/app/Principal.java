
package app;

public class Principal {
    public static void main(String[] args) {
        Servicio servicio = new Servicio("001", "Consultoria de software", 50.0, 20);

        System.out.println("Servicio");
        System.out.println("Codigo del servicio: " + servicio.codigo);
        System.out.println("Descripcion: " + servicio.descripcion);
        System.out.println("Precio por hora: " + servicio.precioPorHora);
        System.out.println("Horas trabajadas: " + servicio.horasTrabajadas);
        System.out.println("Costo total del servicio: " + servicio.getCostoTotal());
        
        System.out.println("*************************************************************************");
        
        Venta venta = new Venta("Laptop", 3, 1500.0);

        System.out.println("Venta");
        System.out.println("Producto: " + venta.producto);
        System.out.println("Cantidad: " + venta.cantidad);
        System.out.println("Precio unitario: " + venta.precioUnitario);
        System.out.println("Total de la venta: " + venta.getTotal());
        
        System.out.println("*************************************************************************");
        
        Compra compra = new Compra("12345", "Proveedor S.A.", 100, 15.5);

        System.out.println("Compra");
        System.out.println("Numero de compra: " + compra.getNumero());
        System.out.println("Proveedor: " + compra.getProveedor());
        System.out.println("Cantidad de productos: " + compra.getCantidadProductos());
        System.out.println("Precio por producto: " + compra.getPrecioPorProducto());
        System.out.println("Costo total de la compra: " + compra.calcularCostoTotal());
        
        System.out.println("*************************************************************************");
        
        Proveedor proveedor = new Proveedor("Carlos Gomez", "Suministros S.A.", "555-1234");
        System.out.println("Proveedor 1");
        proveedor.mostrarInformacion();

        System.out.println("Proveedor 2");
        proveedor.setNombre("Ana Perez");
        proveedor.setEmpresa("Distribuidora Perez");
        proveedor.setTelefono("555-5678");

        proveedor.mostrarInformacion();
        
        System.out.println("*************************************************************************");
        
        Inventario inventario = new Inventario("A001", 100, 20.5);

        System.out.println("Inventario");
        System.out.println("Codigo del producto: " + inventario.codigoProducto);
        System.out.println("Cantidad: " + inventario.cantidad);
        System.out.println("Precio por unidad: " + inventario.precioPorUnidad);
        System.out.println("Valor total en inventario: " + inventario.getValorTotal());
        
        System.out.println("*************************************************************************");
        
        Pedido pedido = new Pedido("123", "Carlos Gomez", 10, 50.0);
        
        System.out.println("Pedido");
        System.out.println("Numero de pedido: " + pedido.getNumero());
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Cantidad: " + pedido.getCantidad());
        System.out.println("Precio por unidad: " + pedido.getPrecioPorUnidad());
        
        System.out.println("*************************************************************************");
        
        Factura factura = new Factura("001", "Juan Perez", 1000.00);

        System.out.println("Factura");
        System.out.println("Numero de factura: " + factura.numero);
        System.out.println("Cliente: " + factura.cliente);
        System.out.println("Subtotal: " + factura.subtotal);
        System.out.println("Total: " + factura.getTotal());
        
        System.out.println("*************************************************************************");
        
        Cliente cliente = new Cliente("Maria Lopez", "123 Calle Principal", "555-1234");
        
        System.out.println("Cliente 1");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Direccion: " + cliente.getDireccion());
        System.out.println("Telefono: " + cliente.getTelefono());

        System.out.println("*************************************************************************");
        
        System.out.println("Cliente 2");
        cliente.setNombre("Carlos Sanchez");
        cliente.setDireccion("456 Avenida Secundaria");
        cliente.setTelefono("555-5678");

        System.out.println("Nuevo nombre: " + cliente.getNombre());
        System.out.println("Nueva direccion: " + cliente.getDireccion());
        System.out.println("Nuevo telefono: " + cliente.getTelefono());
              
        System.out.println("*************************************************************************");
        
        Producto producto = new Producto("001", "Laptop", 500.00);
        
        System.out.println("Producto");
        System.out.println("Codigo: "+ producto.getCodigo());
        System.out.println("Nombre: "+ producto.getNombre());
        System.out.println("Precio: "+ producto.getPrecio());
        
        producto.aplicarDescuento(5);
        System.out.println("Precio con descuento del 10%: " + producto.getPrecio());
       
        System.out.println("*************************************************************************");
        
        Empleado empleado = new Empleado("Juan Perez",2500);
        
        System.out.println("Empleado");
        System.out.println("Nombre: "+ empleado.getNombre());
        System.out.println("Salario Mensual: "+ empleado.getSalario());
        System.out.println("Salario Anual: "+ empleado.calcularSalarioAnual());
        
    }
    
}
