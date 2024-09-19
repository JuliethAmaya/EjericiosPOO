
package app;

public class Pedido {
    private String numero;
    private String cliente;
    private int cantidad;
    private double precioPorUnidad;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    public void setPrecioPorUnidad(double precioPorUnidad) {
        this.precioPorUnidad = precioPorUnidad;
    }

    public Pedido(String numero, String cliente, int cantidad, double percioPorUnidad) {
        this.numero = numero;
        this.cliente = cliente;
        this.cantidad = cantidad;
        this.precioPorUnidad = percioPorUnidad;
    }
    
}
