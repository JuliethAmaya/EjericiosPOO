
package app;

import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
        
        Empresa empresa = new Empresa();
        
        while (true) {
            String[] opciones = {
                    "Agregar Empleado",
                    "Agregar Proyecto",
                    "Asignar Tarea",
                    "Mostrar Proyectos",
                    "Completar Tarea",
                    "Salir"};
            
            String seleccion = (String) JOptionPane.showInputDialog(null,"Seleccione una Opcion",
                    "Menu Principal",JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
            
            if (seleccion == null || seleccion.equals("Salir")) {
                break;
            }
            switch (seleccion) {
            case "Agregar Empleado":
                empresa.crearEmpleado();
                break; 
            case "Agregar Proyecto":
                empresa.crearProyecto();
                break;
            case "Asignar Tarea":
                empresa.asignarTarea();
                break;
            case "Mostrar Proyectos":
                empresa.mostrarProyectos();
                break;
            case "Completar Tarea":
                empresa.completarTarea();
                break;
            default:
                throw new AssertionError();
            }
            
        }
        
        JOptionPane.showMessageDialog(null,"Gracias por Utilizar El sistema");
        
    }
    
}
