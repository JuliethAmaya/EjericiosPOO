
package app;

public class Factura {
    public String numero;
    public String cliente;
    public double subtotal;

    public Factura(String numero, String cliente, double subtotal) {
        this.numero = numero;
        this.cliente = cliente;
        this.subtotal = subtotal;
    }

    private double calcularIVA() {
        return subtotal * 0.19;
    }

    private double calcularTotal() {
        return subtotal + calcularIVA();
    }

    public double getTotal() {
        return calcularTotal();
    }

}
