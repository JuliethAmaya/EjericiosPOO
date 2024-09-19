
package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;

public class Empresa {
    private List<Proyecto> listaProyectos;
    private List<Empleado> listaEmpleados;
    //private List<Tarea> listaTareas;

    public Empresa() {
        this.listaProyectos = new ArrayList<>();
        this.listaEmpleados = new ArrayList<>();
        //this.listaTareas = new ArrayList<>();
    }
    
    //*********************GUARDA EN EL ARCHIVO TXT*****************************//
    public static void guardarEnArchivo(String nombreArchivo, String contenido){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo,true))){
            bw.write(contenido);
            bw.newLine();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Error al escribir en el archivo " + e.getMessage());
        }
    }
    
    //*****************LEER  ARCHIVO TXT***************//
    public List<String> Leer(String nombreArchivo) {
        List<String> lineas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Error al leer el archivo: " + e.getMessage());
        }

        return lineas;
    }
    
    //***************PARTES DE EMPLEADO*****************//
    private Empleado lineaEmpleado(String linea){
        String[] parte = linea.split(",");
        return new Empleado(parte[0], parte[1],parte[2]);
    }
    
    
    //*****************CREAR EMPLEADO*******************//    
    public void crearEmpleado(){
        String docuemento = JOptionPane.showInputDialog("Ingrese el documento del empleado: ");
        String nombre = JOptionPane.showInputDialog("Ingrese nombre del empleado: ");
        String rol = JOptionPane.showInputDialog("Ingrese el rol del empleado: ");
        
        List<String> lineas = Leer("empleados.txt");
        
        for (String linea : lineas) {
            Empleado emple = lineaEmpleado(linea);
            if (emple.getDocumento().equals(docuemento)) {
                JOptionPane.showMessageDialog(null,"Ya existe el empleado");
                break;
            }else{
                Empleado empleado = new Empleado(docuemento,nombre,rol);
                listaEmpleados.add(empleado);
                guardarEnArchivo("empleados.txt",empleado.toString());
                JOptionPane.showMessageDialog(null,"Empleado Registrado");
                break;
            }
        }  
        
    }
    
    //******************PARTES DE PROYECTO*****************//
    public Proyecto lineaProyecto(String linea) {
        String[] partes = linea.split(",");

        String id = partes[0];
        String nombreProyecto = partes[1];
        String liderEquipo = partes[2];

        Proyecto proyecto = new Proyecto(id, nombreProyecto, liderEquipo);

        if (partes.length > 3) {
            String[] idsTareas = partes[3].split(";"); // Asumiendo que las tareas están separadas por ";"
        for (String idTarea : idsTareas) {
            if (!idTarea.trim().isEmpty()) { // Evitar problemas con cadenas vacías
                Tarea tarea = new Tarea(idTarea, "", "pendiente", "");
                proyecto.agregarTarea(tarea);
                }
            }
        }

        return proyecto;
    }

    //******************CREAR PROYECTO*********************//
    public void crearProyecto(){
        String id = JOptionPane.showInputDialog("Ingrese el ID del proyecto: ");
        String nombreProyecto = JOptionPane.showInputDialog("Ingrese el nombre del proyecto: ");
        String documentoLider = JOptionPane.showInputDialog("Ingrese el documento del líder del equipo: ");

        List<String> lineasEmpleado = Leer("empleados.txt");
        Empleado liderEquipo = lineasEmpleado.stream()
        .map(this::lineaEmpleado)
        .filter(e -> e.getDocumento().equals(documentoLider))
        .findFirst()
        .orElse(null);

        if (liderEquipo == null) {
            JOptionPane.showMessageDialog(null, "El líder del equipo no está registrado");
            return;
        }

        List<String> lineasProyectos = Leer("proyectos.txt");
        for (String linea : lineasProyectos) {
        Proyecto proyecto = lineaProyecto(linea);
        if (proyecto != null && proyecto.getId().equals(id)) {
            JOptionPane.showMessageDialog(null, "Ya existe un proyecto con ese ID.");
            return;
        }
    }

    Proyecto nuevoProyecto = new Proyecto(id, nombreProyecto, liderEquipo.getNombre());

    boolean agregarTareas = JOptionPane.showConfirmDialog(null, "¿Desea agregar tareas al proyecto?", "Agregar tareas", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    while (agregarTareas) {
        String tareaId = JOptionPane.showInputDialog("Ingrese el ID de la tarea: ");
        String tareaDescripcion = JOptionPane.showInputDialog("Ingrese la descripción de la tarea: ");
        Tarea tarea = new Tarea(tareaId, tareaDescripcion, "pendiente", "null");
        nuevoProyecto.agregarTarea(tarea);
        guardarEnArchivo("tareas.txt", tarea.toString());

        agregarTareas = JOptionPane.showConfirmDialog(null, "¿Desea agregar otra tarea?", "Agregar más tareas", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    }

    listaProyectos.add(nuevoProyecto);
    guardarEnArchivo("proyectos.txt", nuevoProyecto.toString());
    JOptionPane.showMessageDialog(null, "Proyecto y tareas registradas");
    }

    //*****************VERIFICAR EMPLEADO*******************//
    public boolean verificarEmpleado(String nombreEmpleado) {
        List<String> lineasEmpleados = Leer("empleados.txt");
        return lineasEmpleados.stream().anyMatch(linea -> linea.split(",")[1].equalsIgnoreCase(nombreEmpleado));
    }

    //*******************ASIGNAR TAREA*********************//
    public void asignarTarea(){
        String nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
    
        if (!verificarEmpleado(nombreEmpleado)) {
            JOptionPane.showMessageDialog(null, "El empleado no está registrado.");
            return;
        }
    
        String idTarea = JOptionPane.showInputDialog("Ingrese el ID de la tarea a asignar:");
        List<String> lineasTareas = Leer("tareas.txt");
        List<String> lineasActualizadas = new ArrayList<>();
    
        boolean tareaEncontrada = false;
    
    for (String linea : lineasTareas) {
        String[] partes = linea.split(",");
        String tareaId = partes[0];
        String empleadoAsignado = partes.length > 3 ? partes[3] : "";

        if (tareaId.equals(idTarea)) {
            partes[3] = nombreEmpleado;  // Actualiza el empleado asignado
            linea = String.join(",", partes); // Reconstruir la línea actualizada
            tareaEncontrada = true;
        }
        
        lineasActualizadas.add(linea);
    }
    
        if (tareaEncontrada) {
            guardar("tareas.txt", lineasActualizadas);
            JOptionPane.showMessageDialog(null, "Tarea asignada correctamente a " + nombreEmpleado);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró una tarea con ese ID.");
        }
    }
    
    //**********GUARDA LOS CAMBIOS DE SOLO UNA PARATE**********//
    public void guardar(String nombreArchivo, List<String> lineas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (String linea : lineas) {
                bw.write(linea);
                bw.newLine();
        }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //******************COMPLETAR TAREA***********************//
    public void completarTarea() {
        String idTarea = JOptionPane.showInputDialog("Ingrese el ID de la tarea que desea completar:");

        List<String> lineasTareas = Leer("tareas.txt");
        List<String> lineasActualizadas = new ArrayList<>();

        boolean tareaEncontrada = false;

        for (String linea : lineasTareas) {
            String[] partes = linea.split(",");
            
            if (partes.length >= 4) {
                String id = partes[0];
                String descripcion = partes[1];
                String estado = partes[2];
                String empleado = partes[3];

            if (id.equals(idTarea)) {
                tareaEncontrada = true;
                estado = "completada"; 
                JOptionPane.showMessageDialog(null, "La tarea con ID: " + idTarea + " ha sido completada.");
            }

            String nuevaLinea = id + "," + descripcion + "," + estado + "," + empleado;
            lineasActualizadas.add(nuevaLinea);
        } else {
           
            lineasActualizadas.add(linea);
            }
        }

        if (!tareaEncontrada) {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna tarea con el ID: " + idTarea);
        }
        guardar("tareas.txt", lineasActualizadas);
    }
    
    //*************PARTES DE TAREA***********//
    private Tarea lineaTarea(String linea) {
        String[] partes = linea.split(","); 
        if (partes.length >= 4) { 
            return new Tarea(partes[0], partes[1], partes[2], partes[3]);
        }
        return null;  // Si la línea no es válida
    }
    
    //*************MOSTRAR PROYECTOS********************//
    public void mostrarProyectos() {
        List<String> lineasProyectos = Leer("proyectos.txt");
        List<String> lineasTareas = Leer("tareas.txt"); 

        if (lineasProyectos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay proyectos registrados.");
            return;
        }

        StringBuilder sb = new StringBuilder("Proyectos Registrados:\n");
    
        for (String linea : lineasProyectos) {
            Proyecto proyecto = lineaProyecto(linea);
        
            if (proyecto != null) {
                sb.append("ID del Proyecto: ").append(proyecto.getId()).append("\n")
                  .append("Nombre del Proyecto: ").append(proyecto.getNombreProyecto()).append("\n")
                  .append("Líder del Proyecto: ").append(proyecto.getLiderEquipo()).append("\n")
                  .append("Tareas:\n");

                if (proyecto.getListaTareas().isEmpty()) {
                    sb.append("  No hay tareas asignadas a este proyecto.\n");
                } else {
                    for (Tarea tarea : proyecto.getListaTareas()) {
 
                        for (String lineaTarea : lineasTareas) {
                            Tarea tareaArchivo = lineaTarea(lineaTarea); 
                            if (tareaArchivo != null && tareaArchivo.getId().equals(tarea.getId())) {
                                tarea.setEstado(tareaArchivo.getEstado()); 
                                tarea.setEmpleadoAsignado(tareaArchivo.getEmpleadoAsignado());
                                break;
                            }
                        }

                    sb.append("  ID de la Tarea: ").append(tarea.getId()).append("\n")
                      .append("  Descripción: ").append(tarea.getDescripcion()).append("\n")
                      .append("  Estado: ").append(tarea.getEstado()).append("\n")  
                      .append("  Asignado a: ").append(tarea.getEmpleadoAsignado()).append("\n")
                      .append("  ------------------------\n");
                    }
                }
            
                sb.append("\n=============================\n");
            }
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
    
    
   
    
    
    
   
}
