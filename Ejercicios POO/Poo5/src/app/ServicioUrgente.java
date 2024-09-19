
package app;

public class ServicioUrgente extends Servicio{
    private double recargoUrgencia;
    private double precioTotalRecargo;

    public ServicioUrgente(String codigoServicio, String descripcion, double precioporHora, double horasTrabajadas,double recargoUrgencia) {
        super(codigoServicio, descripcion, precioporHora, horasTrabajadas);
        this.recargoUrgencia = recargoUrgencia;
        this.precioTotalRecargo = getPrecioTotal() + recargoUrgencia;
    }

    public double getRecargoUrgencia() {
        return recargoUrgencia;
    }

    public void setRecargoUrgencia(double recargoUrgencia) {
        this.recargoUrgencia = recargoUrgencia;
        this.precioTotalRecargo = calcularPrcioTotalconRecargo();
    }

    public double getPrecioTotalRecargo() {
        return precioTotalRecargo;
    }
    
    
    private double calcularPrcioTotalconRecargo(){
        double precioTotal = getPrecioTotal();
        return precioTotal + (precioTotal * recargoUrgencia);
    }
    
    @Override
    public String toString() {
        return """
               ServicioUrgente
               Codigo Servicio: """+ getCodigoServicio() + "\n" +
               "Descripcion: " + getDescripcion() + "\n" +
               "Precio por Hora: " + getPrecioporHora() +"\n" +
               "Horas Trabajada: " + getHorasTrabajadas() +"\n" +
               "Precio Total: " + getPrecioTotal() +"\n" +
               "Recargo Urgencia: " + recargoUrgencia +"\n" +
               "Precio Total con Recargo: " + precioTotalRecargo +"\n";
    }
    
   

    
    
    
}
