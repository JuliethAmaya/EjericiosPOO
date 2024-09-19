
package app;

public class Factura {
    private int numeroDeFactura;
    private String fecha;
    private String cliente;
    private double importeTotal;

    public int getNumeroDeFactura() {
        return numeroDeFactura;
    }

    public void setNumeroDeFactura(int numeroDeFactura) {
        this.numeroDeFactura = numeroDeFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    
    public Factura(int numeroDeFactura, String fecha, String cliente, double importeTotal) {
        this.numeroDeFactura = numeroDeFactura;
        this.fecha = fecha;
        this.cliente = cliente;
        this.importeTotal = importeTotal;
    }
    
    @Override
    public String toString() {
        return """
               Factura 
               Numero de Factura: """ + numeroDeFactura + "\n" +
               "Fecha: " + fecha + "\n" +
               "Cliente: " + cliente + "\n" +
               "Importe Total: " + importeTotal + "\n";
    }
}
