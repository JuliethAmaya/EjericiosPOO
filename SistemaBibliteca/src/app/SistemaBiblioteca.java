
package app;


import javax.swing.JOptionPane;

public class SistemaBiblioteca {
    
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        
        String identificacion = JOptionPane.showInputDialog("Ingrese su numero de ID:");
        String clave = JOptionPane.showInputDialog("Ingrese su contraseña: ");
        
        Usuario admin = new Usuario("Julieth Herera", "1055988087", "Administrador", "juliethxiomaraa@gmail.com ","admin123");
        
        if (admin.autenticar(identificacion, clave) && admin.esAdministrador()) {
            JOptionPane.showMessageDialog(null, "Bienvedio,Administrador");
                while (true) {                  
                  String[] opciones = {
                      "Agregar Usuario",
                      "Modificar Usuario",
                      "Eliminar Usuario",
                      "Registrar Libro",
                      "Realizar Prestamo",
                      "Salir"
                  };
                  String seleccion = (String) JOptionPane.showInputDialog(null,"Selecione una Opcion",
                          "Menu Bibliotecario",JOptionPane.QUESTION_MESSAGE,null,
                          opciones,opciones[0]);
                    if (seleccion == null || seleccion.equalsIgnoreCase("Salir")) {
                        break;
                    }
                    switch (seleccion) {
                        case "Agregar Usuario":
                            biblioteca.agregarUsuario();
                            break;
                        case "Modificar Usuario":
                            biblioteca.modificarUsuario();
                            break;
                        case "Eliminar Usuario":
                            biblioteca.eliminarUsuario();
                            break;
                        case "Registrar Libro":
                            biblioteca.registarLibro();
                            break;
                        case "Realizar Prestamo":
                            biblioteca.realizarPrestamo();
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opcion NO valida");
                    }
                
                }
                
                JOptionPane.showMessageDialog(null, "Gracias por utilizar el sitema de Biblioteca");
        }else {
            JOptionPane.showMessageDialog(null, "Identificacion o contraseña incorrectos");
        }
        
    }

}
    
    //        while (true) {
//            String[] opciones = {
//            "Agregar Usuario", 
//            "Ingresar", 
//            "Salir"
//        };
//        String seleccion = (String) JOptionPane.showInputDialog(null,
//                "Seleccione una Opcion",
//                "Menu Principal",
//                JOptionPane.QUESTION_MESSAGE,null,
//                opciones,opciones[0]);
//        if (seleccion == null || seleccion.equals("Salir")) {
//            break;
//        }
//            switch (seleccion) {
//                case "Agregar Usuario":
//                    biblioteca.agregarUsuario();
//                    break;
//                case "Ingresar":
//                    biblioteca.ingresar();
//                    break;
//                default:
//                    JOptionPane.showMessageDialog(null, "Opcion NO valida");
//            } 
//        }
//        
//        JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema"); 
    
