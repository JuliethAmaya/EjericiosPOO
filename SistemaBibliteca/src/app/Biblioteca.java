package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class Biblioteca {

    private List<Libro> libros;
    private List<Usuario> usuarios;
    private List<Prestamo> prestamos;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    //AGREGAR USUARIO 
    public void agregarUsuario() {
        String nombre = JOptionPane.showInputDialog("Digite su nombre: ");
        String identificacion = JOptionPane.showInputDialog("Digite su numero de Identificacion: ");
        String[] opciones = {"lector", "Bibliotecario"};
        int selecciontipoUsuario = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opción",
                "Menú Principal",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]);
        String tipoUsuario = opciones[selecciontipoUsuario];

        String correoElectronico = JOptionPane.showInputDialog("Ingrese correo electrónico del usuario:");
        String clave = JOptionPane.showInputDialog("Ingrese contraseña del usuario:");

        Usuario nuevoUsuario = new Usuario(nombre, identificacion, tipoUsuario, correoElectronico, clave);
        usuarios.add(nuevoUsuario);

        Ficheros.guardarEnArchivo("usuarios.txt", nuevoUsuario.toString());
        JOptionPane.showMessageDialog(null, "Usuario registrado Exitosamente");
    }

    //MODIFICACION USUARIO
    public void modificarUsuario() {
        String id = JOptionPane.showInputDialog("Ingrese la identificación del usuario a modificar:");
        Ficheros fichero = new Ficheros();
                
        
        List<String> lineas = fichero.leerArchivo("catalogo.txt");
        List<Usuario> listUsuario = new ArrayList<>();
        
//        Libro libroAEliminar = null; 
        for (String Linea : lineas) {
            Usuario usuario = convertirLineaAUsuario(Linea);
            
            if (usuario.getIdentificacion().equals(id)){
                listUsuario.add(usuario);
                break;
            }   
        }
        JOptionPane.showMessageDialog(null, listUsuario.toString());
        
        if (listUsuario != null) {
            String[] opciones = {"Nombre", "Correo Electrónico", "Tipo de Usuario", "Clave"};
            String seleccion = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione el dato a modificar:",
                    "Modificar Usuario",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

//            switch (seleccion) {
//               
//                case "Nombre" -> {
//                    String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:");
//                    
//                    
//                    for (String item : listUsuario){
//                        
//                    }
//                    
//                    JOptionPane.showMessageDialog(null, "Nombre actualizado correctamente.");
//                }
//                case "Correo Electrónico" -> {
//                    String nuevoCorreo = JOptionPane.showInputDialog("Ingrese el nuevo correo electrónico:");
//                    usuario.setCorreoElectronico(nuevoCorreo);
//                    JOptionPane.showMessageDialog(null, "Correo electrónico actualizado correctamente.");
//                }
//                case "Tipo de Usuario" -> {
//                    String nuevoTipo = JOptionPane.showInputDialog("Ingrese el nuevo tipo de usuario (lector/bibliotecario):");
//                    if (nuevoTipo.equalsIgnoreCase("lector") || nuevoTipo.equalsIgnoreCase("bibliotecario")) {
//                        usuario.setTipoUsuario(nuevoTipo);
//                        JOptionPane.showMessageDialog(null, "Tipo de usuario actualizado correctamente.");
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Tipo de usuario inválido. No se realizaron cambios.", "Error", JOptionPane.ERROR_MESSAGE);
//                    }
//                }
//                case "Clave" -> {
//                    String nuevaClave = JOptionPane.showInputDialog("Ingrese la nueva clave:");
//                    usuario.setClave(nuevaClave);
//                    JOptionPane.showMessageDialog(null, "Clave actualizada correctamente.");
//                }
//                default ->
//                    JOptionPane.showMessageDialog(null, "Opción inválida.", "Error", JOptionPane.ERROR_MESSAGE);
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Usuario no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
//        }
    }
    }

    // *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** *** //
    //Metodo crear objeto aprtir de txt
    
    private Usuario convertirLineaAUsuario(String linea) {
        String[] datos = linea.split(";");
        return new Usuario(datos[0], datos[1], datos[2], datos[3], datos[4]);
    }

    private Usuario buscarUsuarioPorIdentificacion(String id) {

        for (Usuario usuario : usuarios) {
            if (usuario.getIdentificacion().equals(id)) {
                return usuario;
            }
        }
        return null;
    }

    public void eliminarUsuario() {
        String nombreArchivo = JOptionPane.showInputDialog("Digite el nombre del Archivo del cual desea eliminar una línea: ");
        File archivo = new File(nombreArchivo);

        if (!archivo.exists()) {
            JOptionPane.showMessageDialog(null, "El archivo no existe");
            return;
        }

        String identificacion = JOptionPane.showInputDialog("Digite el número de identificación del usuario a eliminar: ");

        File archivoTemporal = new File("temp_" + nombreArchivo);

        try (BufferedReader lector = new BufferedReader(new FileReader(archivo)); BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoTemporal))) {

            String linea;
            boolean lineaEliminada = false;

            while ((linea = lector.readLine()) != null) {
                if (linea.contains(identificacion) && !lineaEliminada) {
                    lineaEliminada = true;
                    continue; // Salta la línea que contiene la identificación
                }
                escritor.write(linea);
                escritor.newLine();
            }

            if (!lineaEliminada) {
                JOptionPane.showMessageDialog(null, "No se encontró ninguna línea con la identificación especificada.");
            } else {
                archivo.delete(); // Elimina el archivo original
                archivoTemporal.renameTo(archivo); // Renombra el archivo temporal al nombre original
                JOptionPane.showMessageDialog(null, "Línea eliminada exitosamente.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al procesar el archivo: " + e.getMessage());
            archivoTemporal.delete(); // Elimina el archivo temporal en caso de error
        }

    }

    public void guardarUsuarios() {
        try (PrintWriter pw = new PrintWriter(new FileWriter("usuarios.txt"))) {
            for (Usuario usuario : usuarios) {
                pw.println(usuario.getIdentificacion() + "," + usuario.getNombre() + "," + usuario.getCorreoElectronico() + "," + usuario.getTipoUsuario() + "," + usuario.getClave());
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el archivo de usuarios: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    //REGISTRAR LIBRO
    public void registarLibro() {
        String titulo = JOptionPane.showInputDialog("Ingrese el titulo del libro:");
        String autor = JOptionPane.showInputDialog("Ingrese autor del libro:");
        String ISBN = JOptionPane.showInputDialog("Ingrese ISBN del libro:");
        String genero = JOptionPane.showInputDialog("Ingrese genero del libro:");
        int numeroCopias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de copias del libro:"));

        Libro nuevoLibro = new Libro(titulo, autor, ISBN, genero, numeroCopias);
        libros.add(nuevoLibro);

        Ficheros.guardarEnArchivo("catalogo.txt", nuevoLibro.toString());
        JOptionPane.showMessageDialog(null, "Libro registrado con exitosamente.");
    }

    //REALIZAR PRESTAMO
    public void realizarPrestamo() {
        String nombreP = JOptionPane.showInputDialog("Ingrese nombre del lector a prestar Libro:");
        String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del linbro a prestar: ");

        Libro libroSolicitado = null;

        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombreP)) {
                for (Libro libro : libros) {
                    if (libro.getIsbn().equals(isbn) && libro.isDisponible()) {
                        libroSolicitado = libro;
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Libro No encontrado");
                    }

                }

                if (libroSolicitado != null) {
                    LocalDate fechaInicio = LocalDate.now();
                    LocalDate fechaDevolucion = fechaInicio.plusWeeks(2);

                    Prestamo prestamo = new Prestamo(libroSolicitado, usuario, fechaInicio, fechaDevolucion, isbn);
                    prestamos.add(prestamo);

                    libroSolicitado.setNumeroCopias(libroSolicitado.getNumeroCopias() - 1);
                    libroSolicitado.setDisponibilidad(libroSolicitado.getNumeroCopias() > 0);

                    Ficheros.guardarEnArchivo("prestamos.txt", prestamo.toString());

                    JOptionPane.showMessageDialog(null, "Préstamo realizado exitosamente");
                    JOptionPane.showMessageDialog(null, "Detalles Prestamo" + prestamo);

                }

            } else {
                JOptionPane.showMessageDialog(null, "Usuario No encontrado");
            }
        }

    }

    public void eliminarLibro() {
        Ficheros fichero = new Ficheros();
        String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del libro que desea eliminar: ");

        List<String> lineas = fichero.leerArchivo("catalogo.txt");
        List<Libro> Libros = new ArrayList<>();
        Libro libroEliminar = null;

        for (String linea : lineas) {
            Libro libro = convertirLibro(linea);
            Libros.add(libro);
            if (libro.getIsbn().equals(isbn)) {
                libroEliminar = libro;
            }
        }
       
        

    }

    public Libro convertirLibro(String linea) {
        String[] datos = linea.split(",");
        return new Libro(datos[0], datos[1], datos[2], datos[3], Integer.parseInt(datos[4]));
    }

    public void generarReporte() {

        Map<String, Integer> frecuenciaPrestamos = new HashMap<>();
        for (Prestamo prestamo : prestamos) {
            String titulo = prestamo.getLibro().getTitulo();
            frecuenciaPrestamos.put(titulo, frecuenciaPrestamos.getOrDefault(titulo, 0) + 1);
        }

    }

}

//    public static void ingresar(){
//        Biblioteca biblioteca = new Biblioteca();
//
//        String identificacion = JOptionPane.showInputDialog("Ingrese su identificacion: ");
//        String clave = JOptionPane.showInputDialog("Ingrese su contraseña");
//        
//        Usuario usuarioActual = biblioteca.autenticar(identificacion, clave);
//        
//        if (usuarioActual != null) {
//        if (usuarioActual.getTipoUsuario().equalsIgnoreCase("Bibliotecario")) {
//            menuBibliotecario(usuarioActual);
//        } else if (usuarioActual.getTipoUsuario().equalsIgnoreCase("lector")) {
//            menuLector(usuarioActual);
//        }
//        } else {
//        JOptionPane.showMessageDialog(null, "Credenciales incorrectas. Intente de nuevo.");
//        }
//    }
//    }
//
//// Método para convertir una línea en un objeto Usuario
//private Usuario convertirLineaAUsuario(String linea) {
//    String[] partes = linea.split(",");
//    return new Usuario(partes[0], partes[1], partes[2], partes[3], partes[4]);
//}
//        
////    public void eliminarUsuario() {
////        // Solicitar la identificación del usuario a eliminar
////        Ficheros fichero = new Ficheros();
////        String id = JOptionPane.showInputDialog("Ingrese la identificación del usuario a eliminar:");
////        Usuario usuario = buscarUsuarioPorIdentificacion(id);
////
////        if (usuario != null) {
////            // Crear respaldo antes de eliminar
////            fichero.respaldarUsuario(usuario);
////
////            // Eliminar usuario de la lista
////            usuarios.remove(usuario);
////            JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente.");
////
////            // Guardar la lista actualizada en el archivo
////            guardarUsuarios();
////        } else {
////            JOptionPane.showMessageDialog(null, "Usuario no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
////        }
////    }
