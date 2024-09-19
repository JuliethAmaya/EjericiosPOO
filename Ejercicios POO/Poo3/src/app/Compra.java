
package app;

public class Compra {
    private String numeroCompra;
    private String proveedor;
    private int cantidadProductos;
    private double precioPorProducto;
    private double precioTotal;

    public String getNumeroCompra() {
        return numeroCompra;
    }

    public void setNumeroCompra(String numeroCompra) {
        this.numeroCompra = numeroCompra;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
        this.precioTotal = calcularPrecioTotal();
    }

    public double getPrecioPorProducto() {
        return precioPorProducto;
    }

    public void setPrecioPorProducto(double precioPorProducto) {
        this.precioPorProducto = precioPorProducto;
        this.precioTotal = calcularPrecioTotal();
    }

    public Compra(String numeroCompra, String proveedor, int cantidadProductos, double precioPorProducto) {
        this.numeroCompra = numeroCompra;
        this.proveedor = proveedor;
        this.cantidadProductos = cantidadProductos;
        this.precioPorProducto = precioPorProducto;
        this.precioTotal = calcularPrecioTotal();
    }
    
    private double calcularPrecioTotal() {
        return this.cantidadProductos * this.precioPorProducto;
    }
    
    @Override
    public String toString() {
    return """
           Compra
           Numero de compra: """+ numeroCompra + "\n"+
           "Proveedor: " + proveedor +"\n"+
           "Cantidad de Productos: " + cantidadProductos + "\n"+
           "Precio por producto: " + precioPorProducto + "\n"+
           "Precio total: " + precioTotal + "\n";
    }
    
}
