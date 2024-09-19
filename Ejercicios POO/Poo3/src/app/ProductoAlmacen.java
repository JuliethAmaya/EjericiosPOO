
package app;

public class ProductoAlmacen {
    private String codigoProducto;
    private String nombreProducto;
    private int cantidadEnAlmacen;
    private double precioPorUnidad;
    private double valorTotalEnAlmacen;

    
    public ProductoAlmacen(String codigoProducto, String nombreProducto, int cantidadEnAlmacen, double precioPorUnidad) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidadEnAlmacen = cantidadEnAlmacen;
        this.precioPorUnidad = precioPorUnidad;
        this.valorTotalEnAlmacen = calcularValorTotalEnAlmacen();
    }

    
    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidadEnAlmacen() {
        return cantidadEnAlmacen;
    }

    public void setCantidadEnAlmacen(int cantidadEnAlmacen) {
        this.cantidadEnAlmacen = cantidadEnAlmacen;
        this.valorTotalEnAlmacen = calcularValorTotalEnAlmacen();
    }

    public double getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    public void setPrecioPorUnidad(double precioPorUnidad) {
        this.precioPorUnidad = precioPorUnidad;
        this.valorTotalEnAlmacen = calcularValorTotalEnAlmacen();
    }

    public double getValorTotalEnAlmacen() {
        return valorTotalEnAlmacen;
    }

    
    private double calcularValorTotalEnAlmacen() {
        return this.cantidadEnAlmacen * this.precioPorUnidad;
    }
    
    @Override
    public String toString() {
    return """
           Producto Almacen
           Cidigo del Producto: """+ codigoProducto + "\n"+
           "Nombre Producto: " + nombreProducto +"\n"+
           "Cantidad en Almacen: " + cantidadEnAlmacen + "\n"+
           "Precio por Unidad: " + precioPorUnidad + "\n"+
           "Valor Total en Almacen: " + valorTotalEnAlmacen + "\n";
    }
    
    
    
}
