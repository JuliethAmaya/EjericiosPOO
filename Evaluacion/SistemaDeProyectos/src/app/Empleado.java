
package app;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String documento;
    private String nombre;
    private String rol;
    private List<Tarea> tareasAsignadas;

    public Empleado(String documento,String nombre, String rol) {
        this.documento = documento;
        this.nombre = nombre;
        this.rol = rol;        
        this.tareasAsignadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String Documento) {
        this.documento = Documento;
    }
    
    public void asignarTarea(Tarea tarea) {
        this.tareasAsignadas.add(tarea);
    }

    @Override
    public String toString() {
        return documento + ","+ nombre + "," + rol + "," + tareasAsignadas;
    }
  
}
