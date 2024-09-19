
package app;

public class Producto {
    private String codigo;
    private String nombre;
    private double precioPorUnidad;

    // Constructor
    public Producto(String codigo, String nombre, double precioPorUnidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioPorUnidad = precioPorUnidad;
    }

    // Métodos setter y getter
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    public void setPrecioPorUnidad(double precioPorUnidad) {
        this.precioPorUnidad = precioPorUnidad;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + ", Codigo: " + codigo + ", Precio por Unidad: " + precioPorUnidad;
    }

    
}
