
package app;

public class Inventario {
    public String codigoProducto;
    public int cantidad;
    public double precioPorUnidad;

    public Inventario(String codigoProducto, int cantidad, double precioPorUnidad) {
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.precioPorUnidad = precioPorUnidad;
    }
    
    private double calcularValorTotal() {
        return cantidad * precioPorUnidad;
    }
    
    public double getValorTotal() {
        return calcularValorTotal();
    }
    
    
}
