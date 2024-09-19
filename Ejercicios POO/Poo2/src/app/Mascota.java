
package app;

public class Mascota {
     private String nombre;
    private String tipo;
    private int edad;
    private String dueño;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    
    public Mascota(String nombre, String tipo, int edad, String dueño) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.dueño = dueño;
    }
    
    @Override
    public String toString() {
        return """
               Mascota 
               Nombre: """ + nombre + "\n" +
               "Tipo: " + tipo + "\n" +
               "Edad: " + edad + "\n" +
               "Duenio: " + dueño + "\n";
    }
    
}
