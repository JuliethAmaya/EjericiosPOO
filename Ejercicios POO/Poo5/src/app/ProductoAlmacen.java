
package app;

public class ProductoAlmacen {
    private String codigodelProducto;
    private String nombredelProducto;
    private double cantidadenAlmacen;
    private double precioporUnidad;
    private double valorTotalenAlmacen;

    public ProductoAlmacen(String codigodelProducto, String nombredelProducto, double cantidadenAlmacen, double precioporUnidad) {
        this.codigodelProducto = codigodelProducto;
        this.nombredelProducto = nombredelProducto;
        this.cantidadenAlmacen = cantidadenAlmacen;
        this.precioporUnidad = precioporUnidad;
        this.valorTotalenAlmacen = cantidadenAlmacen * precioporUnidad;
    }

    public String getCodigodelProducto() {
        return codigodelProducto;
    }

    public void setCodigodelProducto(String codigodelProducto) {
        this.codigodelProducto = codigodelProducto;
    }

    public String getNombredelProducto() {
        return nombredelProducto;
    }

    public void setNombredelProducto(String nombredelProducto) {
        this.nombredelProducto = nombredelProducto;
    }

    public double getCantidadenAlmacen() {
        return cantidadenAlmacen;
    }

    public void setCantidadenAlmacen(double cantidadenAlmacen) {
        this.cantidadenAlmacen = cantidadenAlmacen;
        this.valorTotalenAlmacen = this.cantidadenAlmacen * precioporUnidad;
    }

    public double getPrecioporUnidad() {
        return precioporUnidad;
    }

    public void setPrecioporUnidad(double precioporUnidad) {
        this.precioporUnidad = precioporUnidad;
        this.valorTotalenAlmacen = this.precioporUnidad * cantidadenAlmacen;
    }

    public double getValorTotalenAlmacen() {
        return valorTotalenAlmacen;
    }
    
    

    
}
