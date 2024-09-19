
package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;

public class Proyecto {
    private String id;
    private String nombreProyecto;
    private String liderEquipo;
    private List<Tarea> listaTareas;

    public Proyecto(String id, String nombreProyecto, String liderEquipo) {
        this.id = id;
        this.nombreProyecto = nombreProyecto;
        this.liderEquipo = liderEquipo;
        this.listaTareas = new ArrayList<>();
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getLiderEquipo() {
        return liderEquipo;
    }

    public void setLiderEquipo(String liderEquipo) {
        this.liderEquipo = liderEquipo;
    }

    public void agregarTarea(Tarea tarea){
        listaTareas.add(tarea);
    }

    public List<Tarea> getListaTareas() {
        return listaTareas;
    }

    
    
    public void setListaTarea(List<Tarea> listaTarea) {
        this.listaTareas = listaTarea;
    }

//    @Override
//    public String toString() {
//        return  id + "," + nombreProyecto + "," + liderEquipo + "," + listaTareas.toString();
//    } 
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(",").append(nombreProyecto).append(",").append(liderEquipo);
        if (!listaTareas.isEmpty()) {
            sb.append(",");
            for (int i = 0; i < listaTareas.size(); i++) {
                sb.append(listaTareas.get(i).getId());
                if (i < listaTareas.size() - 1) {
                    sb.append(";");
                }
            }
        }
        return sb.toString();
    }
    
}
