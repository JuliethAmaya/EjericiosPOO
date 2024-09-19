
package app;

import java.util.Date;

public class Factura {
    private String numeroFactura;
    private String fecha;
    private double subtotal;
    private double iva;
    private double total;

    public Factura(String numeroFactura, String fecha, double subtotal) {
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.iva = calcularIVA();
        this.total = calcularTotal();
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
        this.iva = calcularIVA();
        this.total = calcularTotal();
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    // Método para calcular el IVA
    private double calcularIVA() {
        return this.subtotal * 0.19;
    }

    // Método para calcular el total
    private double calcularTotal() {
        return this.subtotal + this.iva;
    }
    
    @Override
    public String toString() {
        return """
               Factura 
               Numero factura: """+ numeroFactura + "\n"+
               "Fecha: " + fecha +"\n"+
               "SubTotal: " + subtotal + "\n"+ 
               "Iva: " + iva + "\n"+
               "Total: " + total + "\n";
    }
    
    
    
}
