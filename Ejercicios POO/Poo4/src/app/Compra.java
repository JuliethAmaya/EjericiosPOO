
package app;

public class Compra {
    private String numero;
    private String proveedor;
    private int cantidadProductos;
    private double precioPorProducto;

    public Compra(String numero, String proveedor, int cantidadProductos, double precioPorProducto) {
        this.numero = numero;
        this.proveedor = proveedor;
        this.cantidadProductos = cantidadProductos;
        this.precioPorProducto = precioPorProducto;
    }


    public String getNumero() {
        return numero;
    }

    public String getProveedor() {
        return proveedor;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public double getPrecioPorProducto() {
        return precioPorProducto;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public void setPrecioPorProducto(double precioPorProducto) {
        this.precioPorProducto = precioPorProducto;
    }

    public double calcularCostoTotal() {
        return cantidadProductos * precioPorProducto;
    }
    
}
