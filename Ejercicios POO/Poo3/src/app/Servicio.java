
package app;

public class Servicio {
    private String codigoServicio;
    private String descripcion;
    private double precioPorHora;
    private int horasTrabajadas;
    private double precioTotal;

    public String getCodigoServicio() {
        return codigoServicio;
    }

    public void setCodigoServicio(String codigoServicio) {
        this.codigoServicio = codigoServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
        this.precioTotal = calcularPrecioTotal();
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
        this.precioTotal = calcularPrecioTotal();
    }
    

    public Servicio(String codigoServicio, String descripcion, double precioPorHora, int horasTrabajadas) {
        this.codigoServicio = codigoServicio;
        this.descripcion = descripcion;
        this.precioPorHora = precioPorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.precioTotal = calcularPrecioTotal();
    }
    
    private double calcularPrecioTotal() {
        return this.precioPorHora * this.horasTrabajadas;
    }
    
    @Override
    public String toString() {
    return """
           Servicio
           Codigo de servicio: """+ codigoServicio + "\n"+
           "Descripcion: " + descripcion +"\n"+
           "Precio por horas: " + precioPorHora + "\n"+
           "Horas trabajadas: " + horasTrabajadas + "\n"+
           "Precio total: " + precioTotal + "\n";
    }
    
}
