
package app;

public class ClienteFrecuente extends Cliente {
    private double descuento;
    private int numeroCompras;

    // Constructor
    public ClienteFrecuente(String nombre, String direccion, String telefono, double descuento, int numeroCompras) {
        super(nombre, direccion, telefono);
        this.descuento = descuento;
        this.numeroCompras = numeroCompras;
    }

    // Métodos setter y getter
    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getNumeroCompras() {
        return numeroCompras;
    }

    public void setNumeroCompras(int numeroCompras) {
        this.numeroCompras = numeroCompras;
    }

    @Override
    public String toString() {
        return "Cliente Frecuente: " + getNombre() + "\n"+
               "Direccion: " + getDireccion() + "\n"+
               "Telefono: " + getTelefono() + "\n"+
               "Descuento: " + (descuento * 100) + "%" + "\n"+
               "Numero de Compras: " + numeroCompras +"\n";
    }
    
}
