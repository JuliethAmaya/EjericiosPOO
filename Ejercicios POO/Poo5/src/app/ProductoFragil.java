
package app;

public class ProductoFragil extends ProductoAlmacen{
    private String nivelFragilidad;
    private double costoAdicionalporManejo;

    public ProductoFragil(String codigodelProducto, String nombredelProducto, double cantidadenAlmacen, double precioporUnidad,String nivelFragilidad) {
        super(codigodelProducto, nombredelProducto, cantidadenAlmacen, precioporUnidad);
        this.nivelFragilidad = nivelFragilidad;
        this.costoAdicionalporManejo = calcularCostoAdicional();   
    }
    
    private double calcularCostoAdicional(){
        double valorTotal = getValorTotalenAlmacen();
        if("alto".equalsIgnoreCase(nivelFragilidad)){
            return valorTotal * 0.10;
        }
        return 0;
    }
    
    @Override
    public String toString() {
        return """
               Producto Fragil
               Codigo del Producto: """ + getCodigodelProducto()+"\n"+
               "Nombre del Producto: " + getNombredelProducto() + "\n" +
               "Cantidad en Almacen: " + getCantidadenAlmacen() + "\n" +
               "Precio Por Unidad: " + getPrecioporUnidad() + "\n"+
               "Valor Total Almacen: " + getValorTotalenAlmacen() +"\n"+
               "nivel Fragilidad: " + nivelFragilidad +"\n" +
               "costo Adicional Manejo: " + costoAdicionalporManejo + "\n";
    }
    


    
    
}
