
package app;

public class Servicio {
    public String codigo;
    public String descripcion;
    public double precioPorHora;
    public int horasTrabajadas;

    public Servicio(String codigo, String descripcion, double precioPorHora, int horasTrabajadas) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioPorHora = precioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    protected double calcularCostoTotal() {
        return precioPorHora * horasTrabajadas;
    }

    public double getCostoTotal() {
        return calcularCostoTotal();
    }
    
}
