
package app;

import java.util.List;

public class Tarea {
    private String id;
    private String descripcion;
    private String estado; /*pendiente/completada*/
    private String empleadoAsignado;

    public Tarea(String id, String descripcion, String estado,String empleadoAsignado) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = estado;
        this.empleadoAsignado = empleadoAsignado;
    }

    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEmpleadoAsignado() {
        return empleadoAsignado;
    }

    public void setEmpleadoAsignado(String empleadoAsignado) {
        this.empleadoAsignado = empleadoAsignado;
    }
    

    



    @Override
    public String toString() {
        return  id + "," + descripcion + "," + estado + "," + empleadoAsignado;
    }
    

    
    
}
