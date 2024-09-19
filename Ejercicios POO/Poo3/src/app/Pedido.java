
package app;

public class Pedido {
    private String numeroPedido;
    private String cliente;
    private int cantidadArticulos;
    private double precioPorArticulo;
    private double precioTotal;

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getCantidadArticulos() {
        return cantidadArticulos;
    }

    public void setCantidadArticulos(int cantidadArticulos) {
        this.cantidadArticulos = cantidadArticulos;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = precioPorArticulo;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
        this.precioTotal = calcularPrecioTotal();
    }

    public Pedido(String numeroPedido, String cliente, int cantidadArticulos, double precioPorArticulo) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.cantidadArticulos = cantidadArticulos;
        this.precioPorArticulo = precioPorArticulo;
        this.precioTotal = calcularPrecioTotal();
    }
    
    private double calcularPrecioTotal() {
        return this.cantidadArticulos * this.precioPorArticulo;
    }
    
    @Override
    public String toString() {
    return """
           Pedido
           Numero del Pedido: """+ numeroPedido + "\n"+
           "Cliente: " + cliente +"\n"+
           "Cantidad de articulos: " + cantidadArticulos + "\n"+
           "Precio por articulo: " + precioPorArticulo + "\n"+
           "Precio Total: " + precioTotal + "\n";
    }

    
}
