
package app;

public class Hotel {
    private String nombre;
    private String direccion;
    private int numeroDeHabitaciones;
    private int estrellas;

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

    public int getNumeroDeHabitaciones() {
        return numeroDeHabitaciones;
    }

    public void setNumeroDeHabitaciones(int numeroDeHabitaciones) {
        this.numeroDeHabitaciones = numeroDeHabitaciones;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

   
    public Hotel(String nombre, String direccion, int numeroDeHabitaciones, int estrellas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroDeHabitaciones = numeroDeHabitaciones;
        this.estrellas = estrellas;
    }
    
    @Override
    public String toString() {
        return """
               Hotel 
               Nombre: """ + nombre + "\n" +
               "Direccion: " + direccion + "\n" +
               "Numero de Habitaciones: " + numeroDeHabitaciones + "\n" +
               "Estrellas: " + estrellas + "\n";
    }
    
}
