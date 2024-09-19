
package app;

public class Pedido {
    private int numeroPedido;
    private String cliente;
    private int cantidadArticulos;
    private double precioPorArticulo;
    private double precioTotal;

    // Constructor
    public Pedido(int numeroPedido, String cliente, int cantidadArticulos, double precioPorArticulo) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.cantidadArticulos = cantidadArticulos;
        this.precioPorArticulo = precioPorArticulo;
        this.precioTotal = cantidadArticulos * precioPorArticulo;
    }

    // Getters y Setters
    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
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

    
    
    
//    // Método toString
//    @Override
//    public String toString() {
//        return "Pedido{" +
//                "numeroPedido=" + numeroPedido +
//                ", cliente='" + cliente + '\'' +
//                ", cantidadArticulos=" + cantidadArticulos +
//                ", precioPorArticulo=" + precioPorArticulo +
//                ", precioTotal=" + precioTotal +
//                '}';
//    }
    
}
