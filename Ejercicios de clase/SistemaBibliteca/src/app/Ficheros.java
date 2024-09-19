
package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Ficheros {
    //*********************GUARDA EN EL ARCHIVO TXT*****************************//
    public static void guardarEnArchivo(String nombreArchivo, String contenido){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo,true))){
            bw.write(contenido);
            bw.newLine();
        } catch (IOException e) {
            registrarError("Error al escribir en el archivo " + nombreArchivo,e);
        }
    }
    
    //*********************************LEER*************************************//
    public List<String> Leer(String nombreArchivo) {
        List<String> lineas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            registrarError("Error al leer el archivo: " + nombreArchivo,e);
        }

        return lineas;
    }
    
    //***********************CREA COPIA DE SEGURIDAD DE USUARIOS****************************// 
    public static void crearCopiaDeSeguridad(String nombreArchivo){
        try {
            String nombreRespaldo = "temp_usuarios.txt" + nombreArchivo + "_" + obtenerFechaActual() + ".bak";
            Files.copy(Paths.get(nombreArchivo), Paths.get(nombreRespaldo), StandardCopyOption.REPLACE_EXISTING);
            JOptionPane.showMessageDialog(null,"Copia de seguridad creada: " + nombreRespaldo);
        } catch (IOException e) {
            registrarError("Error al crear la copia de seguridad para el archivo: " + nombreArchivo,e);
        }
    }
    
    //******************************REGISTRAR EN CATALOGOLOG*******************************//
    public void registrarLibroEnLog(String operacion,Libro libro){
        String nombreArchivoLog = "catalogoLog.txt";
        
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaHora = fechaHoraActual.format(formato);
        
        String logEntrada = fechaHora + "| Operacion: " + operacion + "| libro: " + libro.toString();
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivoLog,true))){
            writer.write(logEntrada);
            writer.newLine();
        } catch (IOException e) {
            registrarError("Error al registrar la operación en el log." + nombreArchivoLog,e);
        }
    }
    
    //******************************REGISTRAR USUARIO EN LOG*********************************//
    public void registrarUsuarioEnLog(String operacion,Usuario usuario){
        String nombreArchivoLog = "usuariosLog.txt";
        
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaHora = fechaHoraActual.format(formato);
        
        String logEntrada = fechaHora + "| Operacion: " + operacion + "| Usuario: " + usuario.toString();
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivoLog,true))){
            writer.write(logEntrada);
            writer.newLine();
        } catch (IOException e) {
            registrarError("Error al registrar la operación en el log: " + nombreArchivoLog, e);
        }
        
    }
    
    //**********************************REGISTRAR PRESTAMO EN LOG********************************//
    public void registrarPrestamosEnLog(String operacion,Prestamo prestamo){
        String nombreArchivoLog = "prestamosLog.txt";
        
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaHora = fechaHoraActual.format(formato);
        
        String logEntrada = fechaHora + "| Operacion: " + operacion + "| Usuario: " + prestamo.toString();
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivoLog))){
            writer.write(logEntrada);
            writer.newLine();
        } catch (IOException e) {
            registrarError("Error al registrar la operación en el log: " + nombreArchivoLog, e);
        }
    }
    
    
    //Restaura los archivos desde la copia de seguridad
    public static void restaurarDesdeCopiasDeSeguridad(String archivoRespaldo, String archivoDestino){
        try {
            Files.copy(Paths.get(archivoRespaldo),Paths.get(archivoDestino),StandardCopyOption.REPLACE_EXISTING);
            JOptionPane.showMessageDialog(null,"Archivo restaurado desde: " + archivoRespaldo);
        } catch (IOException e) {
            registrarError("Error al restaurar el archivo desde el respaldo: " + archivoRespaldo, e);
        }
        
    }
    
    //Este registra los errores que tenga los metodos anteriores
    public static void registrarError(String mensaje,Exception e){
        String error = obtenerFechaActual() + " - " + mensaje + " - " + e.getMessage();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("errores.txt",true))){
            bw.write(error);
            bw.newLine();
        } catch (IOException ioException) {
        }
    }

    //Envia la fecha actual para guaradarla y ademas compararla
    private static LocalDate obtenerFechaActual() {
        return LocalDate.now();
    }
    
    public void respaldarUsuario(Usuario usuario) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("usuarios_respaldo.txt", true))) { // El archivo se abre en modo append
            pw.println(usuario.getIdentificacion() + "," + usuario.getNombre() + "," + usuario.getCorreoElectronico() + "," + usuario.getTipoUsuario() + "," + usuario.getClave());
        } catch (IOException e) {
            registrarError("Error al realizar el respaldo del usuario: " + usuario,e);
        }
    }
    
    
    //********************************GUARDAR LISTA EN ARCHIVO USUARIO************************************//
    public void guardarUsuariosEnArchivo(List<Usuario> usuarios) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("usuarios.txt"))) {
        for (Usuario usuario : usuarios) {
            writer.write(usuario.getNombre() + "," +
                         usuario.getIdentificacion() + "," +
                         usuario.getTipoUsuario() + "," +
                         usuario.getCorreoElectronico() + "," +
                         usuario.getClave());
            writer.newLine(); // Agregar nueva línea después de cada usuario
        }
    } catch (IOException e) {
        registrarError("Error al guardar los usuarios en el archivo: " + usuarios,e);
        }
    }
    
    //**************************GUARDAR EN ARCHIVO LIBROS************************************//
    public void guardarLibrosEnArchivo(List<Libro> catalogos){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("catalogo.txt"))){
            for (Libro catalogo : catalogos) {
                writer.write(catalogo.getTitulo() + "," +
                             catalogo.getAutor() + "," +
                             catalogo.getIsbn() + "," +
                             catalogo.getGenero() + "," +
                             catalogo.getNumeroCopias()+"," +
                             catalogo.isDisponible());
                writer.newLine();
            }
            
        } catch (IOException e) {
            registrarError("Error al guardar los libros en el archivo: " ,e);
        }
    }
    
    
    //*************************GUARDAR EN ARCHIVO PRESTAMOS*******************************//
    public void guardarPrestamosEnArchivo(List<Prestamo> prestamos){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("prestamos.txt"))){
            for (Prestamo prestamo : prestamos) {
                writer.write(prestamo.getLibro().getTitulo() + "," +
                             prestamo.getUsuario().getNombre() + "," +
                             prestamo.getFechaInicio() + "," +
                             prestamo.getFechaDevolucion() + "," +
                             prestamo.getEstado());
                writer.newLine();
            }
            
        } catch (IOException e) {
            registrarError("Error al guardar los libros en el archivo: " ,e);
        }
    }
    
    
    public void repaldarUsuario(Usuario usuario){
        File directorio = new File("respaldo");
        if (!directorio.exists()) {
            if (!directorio.mkdirs()) {
                JOptionPane.showMessageDialog(null, "Error al crear el directorio de respaldo","Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        String nombreArchivoRespaldo = "respaldo/" + usuario.getIdentificacion() + "_respaldo.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivoRespaldo, true))) {
        writer.write(usuario.toString());
        writer.newLine();
    } catch (IOException e) {
        registrarError("Error al crear el respaldo del usuario.",e);
        }
    }
    
    
    //***************************RESPALDAR USUARIO*********************************//
    public void respaldarUsuarioEnTemp(Usuario usuario) {
    String nombreArchivoRespaldo = "temp_usuario.txt";  // Archivo temporal
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivoRespaldo, true))) {
        writer.write(usuario.getNombre() + "," + usuario.getIdentificacion() + "," +
                     usuario.getTipoUsuario() + "," + usuario.getCorreoElectronico() + "," + 
                     usuario.getClave());
        writer.newLine();
        } catch (IOException e) {
        registrarError("Error al crear el respaldo temporal del usuario.",e);
        }
    }
    
    public void respaldarLibroEnTemp(Libro libro){
        String nombreArchivoRespaldo = "temp_catalogo.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivoRespaldo,true))){
            writer.write(libro.getTitulo() + "," + libro.getAutor() + "," +
                    libro.getIsbn() + "," + libro.getGenero() + "," + libro.getNumeroCopias() + "," + libro.isDisponible());
            writer.newLine();
        } catch (IOException e) {
            registrarError("Error al crear el respaldo temporal del usuario."+ nombreArchivoRespaldo,e);
        }
    }
    
    

    
    

    
    
}



    //**********************LEE EL ARCHIVO********************************//
//    public static String leerArchivo(String nombreArchivo){
//        StringBuilder contenido = new StringBuilder();
//        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))){
//            String linea;
//            while ((linea = br.readLine()) != null) {                
//                contenido.append(linea).append(System.lineSeparator());
//            }
//        } catch (IOException e) {
//            registrarError("Error al leer el archivo: " + nombreArchivo, e);
//        }
//        return contenido.toString();
//    }