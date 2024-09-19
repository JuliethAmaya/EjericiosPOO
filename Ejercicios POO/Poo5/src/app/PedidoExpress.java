
package app;

public class PedidoExpress extends Pedido{
    
    private double costoEnvio;
    private int tiempoEntrega;
    private double precioTotalConEnvio;

    // Constructor
    public PedidoExpress(int numeroPedido, String cliente, int cantidadArticulos, double precioPorArticulo, double costoEnvio, int tiempoEntrega) {
        super(numeroPedido, cliente, cantidadArticulos, precioPorArticulo);
        this.costoEnvio = costoEnvio;
        this.tiempoEntrega = tiempoEntrega;
        this.precioTotalConEnvio = super.getPrecioTotal() + costoEnvio;
    }

    // Getters y Setters
    public double getCostoEnvio() {
        return costoEnvio;
    }

    public void setCostoEnvio(double costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public int getTiempoEntrega() {
        return tiempoEntrega;
    }

    public void setTiempoEntrega(int tiempoEntrega) {
        this.tiempoEntrega = tiempoEntrega;
    }

    public double getPrecioTotalConEnvio() {
        return precioTotalConEnvio;
    }

    // Método toString
    @Override
    public String toString() {
        return """
               PedidoExpress
               Numero de Pedido : """ + getNumeroPedido() +"\n" +
                "Cliente: " + getCliente() +  "\n"+
                "Cantidad de Articulos: " + getCantidadArticulos()+ "\n" +
                "Precio Por Articulo: " + getPrecioPorArticulo()+ "\n" +
                "Precio Total: " + getPrecioTotal()+ "\n" +
                "Costo Envio: " + costoEnvio+ "\n" +
                "Tiempo Entrega: " + tiempoEntrega+ "\n" +
                "Precio Total Con Envio: " + precioTotalConEnvio+ "\n";
    }
}
