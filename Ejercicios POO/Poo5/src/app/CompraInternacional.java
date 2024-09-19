
package app;

public class CompraInternacional extends Compra {
    private double impuestoImportacion;
    private double precioTotalconImpuesto;

    public CompraInternacional(String numeroCompra, String proveedor, int cantidadProductos, double precioProducto, double impuestoImportacion) {
        super(numeroCompra, proveedor, cantidadProductos, precioProducto);
        this.impuestoImportacion = impuestoImportacion;
        this.precioTotalconImpuesto = calcularPrecioTotalcnImpuesto();
    }

    public double getImpuestoImportacion() {
        return impuestoImportacion;
    }

    public void setImpuestoImportacion(double impuestoImportacion) {
        this.impuestoImportacion = impuestoImportacion;
        this.precioTotalconImpuesto = calcularPrecioTotalcnImpuesto();
    }

    public double getPrecioTotalconImpuesto() {
        return precioTotalconImpuesto;
    }

    
    private double calcularPrecioTotalcnImpuesto(){
       double precioTotal = getPrecioTotal();
       return precioTotal + (precioTotal * impuestoImportacion);
    }
    
    @Override
    public String toString() {
    return "CompraInternacional{" +
                "numeroCompra='" + getNumeroCompra() + '\'' +
                ", proveedor='" + getProveedor() + '\'' +
                ", cantidadProductos=" + getCantidadProductos() +
                ", precioPorProducto=" + getPrecioProducto()+
                ", precioTotal=" + getPrecioTotal() +
                ", impuestoImportacion=" + impuestoImportacion +
                ", precioTotalConImpuesto=" + precioTotalconImpuesto +
                '}';
    }
    
    
   
         
    
    
    
}
