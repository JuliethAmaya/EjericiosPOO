
package app;

public class Paciente {
    private String Nombre;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getEnfermedad() {
        return Enfermedad;
    }

    public void setEnfermedad(String Enfermedad) {
        this.Enfermedad = Enfermedad;
    }

    public String getDoctor() {
        return Doctor;
    }

    public void setDoctor(String Doctor) {
        this.Doctor = Doctor;
    }
    private int Edad;
    private String Enfermedad;
    private String Doctor;
    
    public void mostrorP(String _Nombre,int _Edad,String _Enfermedad,String _Doctor){
        Nombre = _Nombre;
        Edad = _Edad;
        Enfermedad = _Enfermedad;
        Doctor = _Doctor;
    }
 
 
   
}
