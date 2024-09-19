
package app;


public class Empleado {
    private String Nombre;
    private String Puesto;
    private int Salario;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public int getSalario() {
        return Salario;
    }

    public void setSalario(int Salario) {
        this.Salario = Salario;
    }

    public String getAntigüedad() {
        return Antigüedad;
    }

    public void setAntigüedad(String Antigüedad) {
        this.Antigüedad = Antigüedad;
    }
    private String Antigüedad;
    
    
    public void mostrarEmp(String _Nombre,String _Puesto,int _Salario,String _Antigüedad){
        Nombre = _Nombre;
        Puesto =_Puesto;
        Salario = _Salario;
        Antigüedad = _Antigüedad;
        
    }
    
    

 


    
}
