
package app;

public class Compra {
    private String numeroCompra;
    private String proveedor;
    private int cantidadProductos;
    private double precioProducto;
    private double precioTotal;

    public Compra(String numeroCompra, String proveedor, int cantidadProductos, double precioProducto) {
        this.numeroCompra = numeroCompra;
        this.proveedor = proveedor;
        this.cantidadProductos = cantidadProductos;
        this.precioProducto = precioProducto;
        this.precioTotal = cantidadProductos * precioProducto;
    }

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

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
        this.precioTotal = calcularPrecioTotal();
    }

    public double getPrecioTotal() {
        return precioTotal;
    }


    private double calcularPrecioTotal(){
        return cantidadProductos * precioProducto;
    }
    

    

    
    
    
    
    
}
