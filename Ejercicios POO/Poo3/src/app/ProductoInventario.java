
package app;

public class ProductoInventario {
    private String codigoProducto;
    private String nombreProducto;
    private int cantidadEnStock;
    private double precioPorUnidad;
    private double valorTotalEnStock;

   
    public ProductoInventario(String codigoProducto, String nombreProducto, int cantidadEnStock, double precioPorUnidad) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidadEnStock = cantidadEnStock;
        this.precioPorUnidad = precioPorUnidad;
        this.valorTotalEnStock = calcularValorTotalEnStock();
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

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
        this.valorTotalEnStock = calcularValorTotalEnStock();
    }

    public double getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    public void setPrecioPorUnidad(double precioPorUnidad) {
        this.precioPorUnidad = precioPorUnidad;
        this.valorTotalEnStock = calcularValorTotalEnStock();
    }

    public double getValorTotalEnStock() {
        return valorTotalEnStock;
    }

    
    private double calcularValorTotalEnStock() {
        return this.cantidadEnStock * this.precioPorUnidad;
    }
    
    @Override
    public String toString() {
        return """
               Producto Inventario 
               Codigo del Producto: """+ codigoProducto + "\n"+
               "Nombre del Producto: " + nombreProducto +"\n"+
               "Cantidad en Stock: " + cantidadEnStock + "\n"+ 
               "Precio por Unidad: " + precioPorUnidad + "\n"+
               "Valor Total en Stock: " + valorTotalEnStock + "\n";
    }
}
