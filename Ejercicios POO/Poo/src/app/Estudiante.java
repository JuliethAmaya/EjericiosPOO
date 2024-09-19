
package app;


public class Estudiante {
    private String Nombre;
    private String Edad;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public double getPromedio() {
        return Promedio;
    }

    public void setPromedio(double Promedio) {
        this.Promedio = Promedio;
    }
    private String Carrera;
    private double Promedio;
    
    public void mostrarE(String _Nombre,String _Edad,String _Carrera,double _Promedio){
        Nombre = _Nombre;
        Edad =_Edad;
        Carrera = _Carrera;
        Promedio = _Promedio;
    }
    
    
}
