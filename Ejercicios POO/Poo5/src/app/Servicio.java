
package app;

public class Servicio {
    private String codigoServicio;
    private String descripcion;
    private double precioporHora;
    private double horasTrabajadas;
    private double precioTotal;

    public Servicio(String codigoServicio, String descripcion, double precioporHora, double horasTrabajadas) {
        this.codigoServicio = codigoServicio;
        this.descripcion = descripcion;
        this.precioporHora = precioporHora;
        this.horasTrabajadas = horasTrabajadas;
        this.precioTotal = precioporHora * horasTrabajadas;
    }

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

    public double getPrecioporHora() {
        return precioporHora;
    }

    public void setPrecioporHora(double precioporHora) {
        this.precioporHora = precioporHora;
        this.precioTotal = precioporHora * horasTrabajadas;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
        this.precioTotal = horasTrabajadas * precioporHora;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }


    
    
    
    
    
    
}
