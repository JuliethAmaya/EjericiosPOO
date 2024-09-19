
package app;

public class Orden {
    private int numeroDeOrden;
    private String fecha;
    private String cliente;
    private double montoTotal;

    public int getNumeroDeOrden() {
        return numeroDeOrden;
    }

    public void setNumeroDeOrden(int numeroDeOrden) {
        this.numeroDeOrden = numeroDeOrden;
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

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    
    public Orden(int numeroDeOrden, String fecha, String cliente, double montoTotal) {
        this.numeroDeOrden = numeroDeOrden;
        this.fecha = fecha;
        this.cliente = cliente;
        this.montoTotal = montoTotal;
    }
    
    @Override
    public String toString() {
        return """
               Orden 
               Numero de orden: """ + numeroDeOrden + "\n" +
               "Fecha: " + fecha + "\n" +
               "Cliente: " + cliente + "\n" +
               "Monto total: " + montoTotal + "\n";
    }
       
    
}
