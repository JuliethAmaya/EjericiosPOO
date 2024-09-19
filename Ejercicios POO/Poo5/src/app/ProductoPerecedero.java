
package app;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto{
    private LocalDate fechaCaducidad;
    private double descuento;

    // Constructor
    public ProductoPerecedero(String codigo, String nombre, double precioPorUnidad, LocalDate fechaCaducidad) {
        super(codigo, nombre, precioPorUnidad);
        this.fechaCaducidad = fechaCaducidad;
        this.descuento = calcularDescuento();
    }

    // Métodos setter y getter
    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
        this.descuento = calcularDescuento();
    }

    public double getDescuento() {
        return descuento;
    }

    private double calcularDescuento() {
        LocalDate hoy = LocalDate.now();
        if (fechaCaducidad.isBefore(hoy.plusDays(5))) {
            return 0.20; // 20% de descuento si está próximo a caducar (menos de 5 días)
        } else {
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return "Producto Perecedero: " + getNombre()+"\n"+ 
               "Codigo: " + getCodigo()+"\n"+ 
               "Precio por Unidad: " + getPrecioPorUnidad()+"\n"+ 
               "Fecha de Caducidad: " + fechaCaducidad+"\n"+ 
               "Descuento: " + (descuento * 100) + "\n";
    }
    
}
