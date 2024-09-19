
package app;

public class Restaurante {
    private String nombre;
    private String direccion;
    private String tipoDeCocina;
    private double calificacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoDeCocina() {
        return tipoDeCocina;
    }

    public void setTipoDeCocina(String tipoDeCocina) {
        this.tipoDeCocina = tipoDeCocina;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    public Restaurante(String nombre, String direccion, String tipoDeCocina, double calificacion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoDeCocina = tipoDeCocina;
        this.calificacion = calificacion;
    }
    
    @Override
    public String toString() {
        return """
               Restaurante """ + "\n" +
               "Nombre: " + nombre + "\n" +
               "Direccion:" + direccion + "\n" +
               "Tipo de Cocina: " + tipoDeCocina + "\n"+
               "Calificacion: " + calificacion + "\n";
    }
    
}
