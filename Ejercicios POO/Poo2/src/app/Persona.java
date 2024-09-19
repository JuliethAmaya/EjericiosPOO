
package app;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public Persona(String nombre, String apellido, int edad, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
        return """
               Persona
               Nombre: """ + nombre + "\n" +
               "Apellido: " + apellido + "\n" +
               "Edad: " + edad +
               "Direccion: " + direccion + "\n";
    }
    
}
