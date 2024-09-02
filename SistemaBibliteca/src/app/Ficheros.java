
package app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Ficheros {
    
    //Crea y guarda la informacion en el txt
    public static void guardarEnArchivo(String nombreArchivo, String contenido){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo,true))){
            bw.write(contenido);
            bw.newLine();
        } catch (IOException e) {
            registrarError("Error al escribir en el archivo " + nombreArchivo,e);
        }
    }
    
    
    //lee el archivo creado 
    public List<String> leerArchivo(String nombreArchivo){
        List<String> lineas = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))){
            String linea;
            while ((linea = br.readLine()) != null) {                
                lineas.add(linea);
            }
        } catch (IOException e) {
            registrarError("Error al leer el archivo: " + nombreArchivo, e);
        }
        return lineas;
    }
    
    public List<String> mostrarParaEdiatar(String nombreArchivo) {
        List<String> lineas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return lineas;
    }
    
    //crea una copia de seguridad 
    public static void crearCopiaDeSeguridad(String nombreArchivo){
        try {
            String nombreRespaldo = "respaldos/" + nombreArchivo + "_" + obtenerFechaActual() + ".bak";
            Files.copy(Paths.get(nombreArchivo), Paths.get(nombreRespaldo), StandardCopyOption.REPLACE_EXISTING);
            JOptionPane.showMessageDialog(null,"Copia de seguridad creada: " + nombreRespaldo);
        } catch (IOException e) {
            registrarError("Error al crear la copia de seguridad para el archivo: " + nombreArchivo,e);
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
            JOptionPane.showMessageDialog(null, "Error al realizar el respaldo del usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
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
        System.err.println("Error al guardar los usuarios en el archivo: " + e.getMessage());
    }
}
    
    public void respaldarLibro(Libro libro) {
    String nombreArchivo = "respaldos/" + libro.getIsbn() + "_respaldo.txt";
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
        writer.write(libro.toString());
        writer.newLine();
        JOptionPane.showMessageDialog(null, "Libro respaldado en: " + nombreArchivo);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error al respaldar el libro.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    public void guardarLibrosEnArchivo(List<Libro> libros) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("catalogo.txt"))) {
        for (Libro libro : libros) {
            writer.write(libro.toString());
            writer.newLine();
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Error al guardar el catálogo de libros.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    
}
