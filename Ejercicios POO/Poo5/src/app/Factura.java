
package app;

public class Factura {
     private String numeroFactura;
    private double subtotal;
    private double iva;
    private double total;

    // Constructor
    public Factura(String numeroFactura, double subtotal) {
        this.numeroFactura = numeroFactura;
        this.subtotal = subtotal;
        this.iva = calcularIVA();
        this.total = calcularTotal();
    }

    // Métodos setter y getter
    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
        this.iva = calcularIVA();
        this.total = calcularTotal();
    }

    public double getIVA() {
        return iva;
    }

    public double getTotal() {
        return total;
    }

    // Métodos para calcular IVA y total
    private double calcularIVA() {
        return subtotal * 0.19;
    }

    private double calcularTotal() {
        return subtotal + iva;
    }
    
    
}
