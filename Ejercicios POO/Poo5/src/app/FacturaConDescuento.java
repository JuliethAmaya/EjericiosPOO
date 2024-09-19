
package app;

public class FacturaConDescuento extends Factura{
    private double descuentoAplicado;
    private double totalConDescuento;

    // Constructor
    public FacturaConDescuento(String numeroFactura, double subtotal, double descuentoAplicado) {
        super(numeroFactura, subtotal);
        this.descuentoAplicado = descuentoAplicado;
        this.totalConDescuento = calcularTotalConDescuento();
    }

    // Métodos setter y getter
    public double getDescuentoAplicado() {
        return descuentoAplicado;
    }

    public void setDescuentoAplicado(double descuentoAplicado) {
        this.descuentoAplicado = descuentoAplicado;
        this.totalConDescuento = calcularTotalConDescuento();
    }

    public double getTotalConDescuento() {
        return totalConDescuento;
    }

    // Método para calcular el total con descuento
    private double calcularTotalConDescuento() {
        return getTotal() - descuentoAplicado;
    }

    @Override
    public String toString() {
        return "Factura con Descuento: " + getNumeroFactura() + ", Subtotal: " + getSubtotal() + 
               ", IVA: " + getIVA() + ", Total: " + getTotal() + 
               ", Descuento Aplicado: " + descuentoAplicado + ", Total con Descuento: " + totalConDescuento;
    }

    
    
    
}
