
package app;

public class Venta {
    private String producto;
    private int cantidad;
    private double precioUnitario;
    private double precioTotal;

    // Constructor para inicializar todos los atributos excepto precio total
    public Venta(String producto, int cantidad, double precioUnitario) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.precioTotal = calcularPrecioTotal();
    }

    // Métodos getter y setter
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.precioTotal = calcularPrecioTotal();
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
        this.precioTotal = calcularPrecioTotal();
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    // Método para calcular el precio total
    private double calcularPrecioTotal() {
        return this.cantidad * this.precioUnitario;
    }
    
    
    @Override
    public String toString() {
        return """
               Venta 
               Producto: """+ producto + "\n"+
               "Cantidad: " + cantidad +"\n"+
               "Precio Unitario: " + precioUnitario + "\n"+ 
               "Precio Total: " + precioTotal + "\n";
    }

    
}
