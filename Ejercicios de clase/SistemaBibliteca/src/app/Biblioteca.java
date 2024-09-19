
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
    
    //**************************AUTENTICAR USUARIO*******************//
    public Usuario autenticarUsuario(){
        Ficheros fichero = new Ficheros();
        
        String identificacion = JOptionPane.showInputDialog("Ingrese su identificación:");
        String clave = JOptionPane.showInputDialog("Ingrese su clave:");
        
        List<String> lineas = fichero.Leer("usuarios.txt");
        
        for (String linea : lineas) {
            
            Usuario usuario = convertirLineaAUsuario(linea);
            System.out.println("Usuario ID: " + usuario.getIdentificacion() + " Clave: " + usuario.getClave());
            
            if(usuario.getIdentificacion().equals(identificacion) && usuario.getClave().equals(clave)){
                //JOptionPane.showMessageDialog(null, "Ingreso concedido");
                return usuario;
            }
        }
        JOptionPane.showMessageDialog(null, "Identificación o clave incorrectas.", "Error", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    
    
    //**************************CONVERTIR EN PARTES USUARIO*************************//
    private Usuario convertirLineaAUsuario(String linea) {
        String[] partes = linea.split(",");
        return new Usuario(partes[0], partes[1], partes[2], partes[3], partes[4]);
    }
    
     //**************************CONVERTIR PRESTAMO EN PARTES*************************//
//    private Prestamo convertirLineaAPrestamo(String linea){
//        try {
//        String[] partes = linea.split(",");
//
//        // Verificar que haya el número correcto de partes
//        if (partes.length != 5) {
//            System.out.println("Error: Línea mal formateada o con partes faltantes: " + linea);
//            return null;  // Retorna null si la línea no es válida
//        }
//
//        // Convertir las partes correctamente
//        String isbn = partes[0].trim();
//        String nombreLector = partes[1].trim();
//        LocalDate fechaInicio = LocalDate.parse(partes[2].trim());
//        LocalDate fechaDevolucion = LocalDate.parse(partes[3].trim());
//        String estado = partes[4].trim();
//
//        // Imprimir para depuración
//        System.out.println("Línea convertida correctamente: ISBN=" + isbn + ", Lector=" + nombreLector);
//
//        // Crear y retornar el préstamo
//        //return new Prestamo(isbn, nombreLector, fechaInicio, fechaDevolucion, estado);
//
//        } catch (Exception e) {
//        System.out.println("Error al convertir la línea: " + linea +  e.getMessage());
//        e.printStackTrace();
//        return null;  // Si algo falla, retorna null
//        }
//    }
//    
    
    
    
    //***************************CONVERTIR EN PARTES lIBRO***********************//
    private Libro convertirLineaALibro(String linea){
         String[] partes = linea.split(",");
    
    // Manejar tanto líneas con 5 como con 6 partes
    if (partes.length < 5 || partes.length > 6) {
        throw new IllegalArgumentException("Formato de línea incorrecto: " + linea);
    }
    
    String titulo = partes[0];
    String autor = partes[1];
    String isbn = partes[2];
    String genero = partes[3];
    int numeroCopias = Integer.parseInt(partes[4]);

    boolean disponible = true; // Asume que disponible si no se proporciona esta información

    // Si hay una sexta parte, la usamos para definir la disponibilidad
    if (partes.length == 6) {
        disponible = Boolean.parseBoolean(partes[5]);
    }
    return new Libro(titulo, autor, isbn, genero, numeroCopias, disponible);
    }
    
    
    //*************************BUSCAR LIBRO POR TITULO*********************************//
    public Libro buscarLibroPorIsbn(String isbn){
        Ficheros fichero = new Ficheros();
        
        List<String> lineasCatalogo = fichero.Leer("catalogo.txt");
        for (String linea : lineasCatalogo) {
            Libro libro = convertirLineaALibro(linea);
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return libro;
            }
        }
        return null;
    }
    
    //****************************BUSCAR USUARIO POR NOMBRE********************************//
    public Usuario buscarUsuarioPorNombre(String nombre){
        Ficheros fichero = new Ficheros();
        
        List<String> lineasUsuario = fichero.Leer("usuarios.txt");
        for (String linea : lineasUsuario) {
            Usuario usuario = convertirLineaAUsuario(linea);
            if (usuario.getNombre().equalsIgnoreCase(nombre)) {
                return usuario;
            }
        }
        return null;
    }
    
   
    
    //***************************INICIAR SISTEMA****************************//
    
    public void iniciarSistema(){
        Usuario usuario = autenticarUsuario();
    if (usuario != null) {
        if (usuario.getTipoUsuario().equals("Bibliotecario")) {
            JOptionPane.showMessageDialog(null, "Bienvenido Bibliotecario");
            mostrarMenuBibliotecario();
        }else if (usuario.getTipoUsuario().equals("Lector")) {
            JOptionPane.showMessageDialog(null, "Bienvenido Lector");
            mostrarMenuLector();
        } 
        else {
            JOptionPane.showMessageDialog(null, "Tipo de usuario no reconocido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Acceso denegado.Identificación o clave incorrectas.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }
    
    
    //***************************MENU BIBLIOTECARIO*************************//
    public void mostrarMenuBibliotecario(){
        while (true) {
            String[] opciones = {
                "Agregar Usuario",
                "Eliminar Usuario",
                "Modificar Usuario",
                "Gestionar Catalogo",
                "Realizar Prestamo",
                "Registrar Devolucion de Libro",
                "Salir"
            };
            String seleccion = (String) JOptionPane.showInputDialog(null,"Seleccione una Opcion",
                    "Menu Bibliotecario",
                    JOptionPane.QUESTION_MESSAGE,null,
                    opciones,opciones[0]);
            
            if(seleccion == null || seleccion.equals("Salir")){
                break;
            }
            switch (seleccion) {
                case "Agregar Usuario":
                    agregarUsuario();
                    break;
                case "Eliminar Usuario":
                    eliminarUsuario();
                    break;
                case "Modificar Usuario":
                    modificarUsuario();
                    break;
                case "Gestionar Catalogo":
                    gestionarCatalogo();
                    break;
                case "Realizar Prestamo":
                    realizarPrestamo();
                    break;
                case "Registrar Devolucion de Libro":
                    registrarDevolucion();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion NO valida");
            }
            
        }
        
        JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema");
    }
    
    
    //****************************MENU LECTOR*********************************//
    public void mostrarMenuLector(){
        while (true) {
            String[] opciones = {
                "Salir"
            };
            String seleccion = (String) JOptionPane.showInputDialog(null,"Seleccione una Opcion",
                    "Menu Lector",
                    JOptionPane.QUESTION_MESSAGE,null,
                    opciones,opciones[0]);
            
            if(seleccion == null || seleccion.equals("Salir")){
                break;
            }
            switch (seleccion) {
                case "Modificar Usuario":
                    modificarUsuario();
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Opcion NO valida");
            }
            
        }
        
        JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema");
    }
    
    
    //***************************AGREGAR USUARIO****************************// 
    
    public void agregarUsuario(){
        Ficheros fichero = new Ficheros();
        String nombre = JOptionPane.showInputDialog("Digite su nombre: ");
        String identificacion = JOptionPane.showInputDialog("Digite su numero de Identificacion: ");
        String[] opciones = {"Lector","Bibliotecario"}; 
        int selecciontipoUsuario  = JOptionPane.showOptionDialog(
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
        //Agregar Libro(Alta)
        fichero.registrarUsuarioEnLog("Alta", nuevoUsuario);
        JOptionPane.showMessageDialog(null, "Usuario registrado Exitosamente");
        
    }
    
    //****************************MODIFICAR USUARIO**************************//
    
    public void modificarUsuario(){
        Ficheros fichero = new Ficheros();
        
        String id = JOptionPane.showInputDialog("Ingrese la identificación del usuario a modificar:");
        
        List<String> lineas = fichero.Leer("usuarios.txt");
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuarioAModificar = null;
        
        for (String linea : lineas) {
            Usuario usuario = convertirLineaAUsuario(linea);
            usuarios.add(usuario);
            if (usuario.getIdentificacion().equals(id)) {
                usuarioAModificar = usuario;
            }
        }
        if(usuarioAModificar != null){
            //fichero.repaldarUsuario(usuarioAModificar);
            
            String[] opciones = {"Nombre", "Correo Electrónico", "Clave"};
            String seleccion = (String)JOptionPane.showInputDialog(null,"¿Qué desea modificar?","Modificar Usuario",
                    JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
            switch (seleccion) {
                case "Nombre":
                    usuarioAModificar.setNombre(JOptionPane.showInputDialog("Modificar nombre: ",usuarioAModificar.getNombre()));
                    break;
                case "Correo Electrónico":
                    usuarioAModificar.setCorreoElectronico(JOptionPane.showInputDialog("Modificar correo electronico: ",usuarioAModificar.getCorreoElectronico()));
                    break;
                case "Clave":
                    usuarioAModificar.setClave(JOptionPane.showInputDialog("Modificar clave: ",usuarioAModificar.getClave()));
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opcion NO Valida");
                    return;
            }
            
            JOptionPane.showMessageDialog(null, "Usuario modificado correctamente.");
            
            fichero.guardarUsuariosEnArchivo(usuarios);
            fichero.registrarUsuarioEnLog("Modificar",usuarioAModificar);
            
        }else{
            JOptionPane.showMessageDialog(null, "Usuario no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    //****************************ELIMINAR USUARIO**************************//

    public void eliminarUsuario(){
        Ficheros fichero = new Ficheros();
        
        String id = JOptionPane.showInputDialog("Ingrese la identificación del usuario a Eliminar:");
        
        List<String> lineas = fichero.Leer("usuarios.txt");
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuarioAEliminar = null;
        
        for (String linea : lineas) {
            Usuario usuario = convertirLineaAUsuario(linea);
            usuarios.add(usuario);
            if (usuario.getIdentificacion().equals(id)) {
                usuarioAEliminar = usuario;
            }
        }
        
        if (usuarioAEliminar != null) {
            
        fichero.respaldarUsuarioEnTemp(usuarioAEliminar);
        
        usuarios.remove(usuarioAEliminar);
        JOptionPane.showMessageDialog(null,"Usuario eliminado correctamente.");
        

        fichero.guardarUsuariosEnArchivo(usuarios);
        //Eliminar libro(Baja)
        fichero.registrarUsuarioEnLog("Baja", usuarioAEliminar);
        } else {
        JOptionPane.showMessageDialog(null, "Usuario no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    //********************************MENU DEL CATALOGO****************************//
    public void gestionarCatalogo(){
        while (true) {
            String[] opciones = {
            "Agregar Libro", 
            "Eliminar Libro",
            "Modificar Libro",
            "Salir"
            };
        
        String seleccion = (String) JOptionPane.showInputDialog(null,"Seleccione una Opcion",
                "Gestion de Catalogo",JOptionPane.QUESTION_MESSAGE,null,
                opciones,opciones[0]);
        
        if (seleccion == null || seleccion.equalsIgnoreCase("Salir")) {
            break;
        }
        switch (seleccion) {
            case "Agregar Libro" -> agregarLibro();
            case "Eliminar Libro" -> eliminarLibro();
            case "Modificar Libro" -> modificarLibro();
            default -> JOptionPane.showMessageDialog(null,"Opcion NO Valida");
        }
            //JOptionPane.showMessageDialog(null,"Gracias por Utilizar el sistema");
        }
       
    }
    
    //*******************************AGREGAR LIBRO***************************//
    
    public void agregarLibro(){
        
        String titulo = JOptionPane.showInputDialog("Ingrese el título del libro:");
        String autor = JOptionPane.showInputDialog("Ingrese el autor del libro:");
        String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del libro:");
        String genero = JOptionPane.showInputDialog("Ingrese el genero del libro:");
        int numeroCopias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de copias del libro:"));
        boolean disponible= true;
        
        Libro nuevoLibro = new Libro(titulo, autor, isbn, genero, numeroCopias,disponible);
        libros.add(nuevoLibro);
        
        Ficheros.guardarEnArchivo("catalogo.txt", nuevoLibro.toString());
        JOptionPane.showMessageDialog(null,"Libro registrado con exitosamente.");
        
        Ficheros fichero = new Ficheros();
        //Agregar Libro(Alta)
        fichero.registrarLibroEnLog("Alta", nuevoLibro);
    }
    
    //*******************************MODIFICAR LIBRO**********************************//
    public void modificarLibro(){
        Ficheros fichero = new Ficheros();
        String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del libro a modificar:");
    
        // Leer el catálogo de libros desde el archivo
        List<String> lineas = fichero.Leer("catalogo.txt");
        List<Libro> catalogo = new ArrayList<>();
        boolean libroEncontrado = false;

        for (String linea : lineas) {
            Libro libro = convertirLineaALibro(linea);
            catalogo.add(libro);
        
            if (libro.getIsbn().equals(isbn)) {
                libroEncontrado = true;

                // Pedir los nuevos datos del libro
                String nuevoTitulo = JOptionPane.showInputDialog("Ingrese el nuevo título (actual: " + libro.getTitulo() + "):", libro.getTitulo());
                String nuevoAutor = JOptionPane.showInputDialog("Ingrese el nuevo autor (actual: " + libro.getAutor() + "):", libro.getAutor());
                String nuevoGenero = JOptionPane.showInputDialog("Ingrese el nuevo género (actual: " + libro.getGenero() + "):", libro.getGenero());
                int nuevoNumeroCopias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo número de copias (actual: " + libro.getNumeroCopias() + "):", libro.getNumeroCopias()));
            
                // Actualizar los datos del libro
                libro.setTitulo(nuevoTitulo);
                libro.setAutor(nuevoAutor);
                libro.setGenero(nuevoGenero);
                libro.setNumeroCopias(nuevoNumeroCopias);
            
                JOptionPane.showMessageDialog(null, "Libro modificado correctamente.");
                
                // Registrar la operación en el log
                fichero.registrarLibroEnLog("Modificación", libro);
                break;
        }
    }
        if (!libroEncontrado) {
            JOptionPane.showMessageDialog(null, "No se encontró un libro con el ISBN proporcionado.");
        }else{
            fichero.guardarLibrosEnArchivo(catalogo);
        }
    
    }
    
    //********************************ELIMINAR LIBRO*******************************//
    
    public void eliminarLibro(){
        Ficheros fichero = new Ficheros();
        
        String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del libro a modificar:");
        
        List<String> lineas = fichero.Leer("catalogo.txt");
        List<Libro> catalogo = new ArrayList<>();
        Libro libroAEliminar = null;
        
        for (String linea : lineas) {
            Libro libro = convertirLineaALibro(linea);
            catalogo.add(libro);
            if (libro.getIsbn().equals(isbn)) {
                libroAEliminar= libro;
            }
        }
        if (libroAEliminar != null) {
            fichero.respaldarLibroEnTemp(libroAEliminar);
            catalogo.remove(libroAEliminar);
            JOptionPane.showMessageDialog(null,"Libro eliminado correctamente.");
            fichero.guardarLibrosEnArchivo(catalogo);
            
            //Eliminar libro(Baja)
            fichero.registrarLibroEnLog("Baja", libroAEliminar);
        } else{
            JOptionPane.showMessageDialog(null, "No se encontró un libro con el ISBN especificado.");
        }
    }
    
    //************************************REGISTRAR PRESTAMO**********************************//
    public void realizarPrestamo(){
        Ficheros fichero = new Ficheros();
        String nombreP = JOptionPane.showInputDialog("Ingrese el nombre del lector:");
        String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del libro a prestar:");
    
        List<String> lineasU = fichero.Leer("usuarios.txt");
        List<String> lineasL = fichero.Leer("catalogo.txt");
        boolean usuarioEncontrado = false;
        boolean libroEncontrado = false;
        Usuario u = null;
        Libro libroSolicitado = null;
        
    // Encontrar usuario
        for (String linea : lineasU) {
            Usuario usuario = convertirLineaAUsuario(linea);
            if (usuario.getNombre().equalsIgnoreCase(nombreP)) {
                usuarioEncontrado = true;
                u = usuario;
                break;
            }
        }
    // Encontrar libro
        for (String linea : lineasL) {
            Libro libro = convertirLineaALibro(linea);
            if (libro.getIsbn().equals(isbn) && libro.isDisponible()) {
                libroEncontrado = true;
                libroSolicitado = libro;
                break;
            }
        }
        
        List<Libro> librosActualizados = new ArrayList<>();
        for (String linea : lineasL) {
            Libro libro = convertirLineaALibro(linea);
            if (libro.getIsbn().equals(isbn)) {
                if (libro.isDisponible()) {
                    libroEncontrado = true;
                    libroSolicitado = libro;
                    libroSolicitado.setNumeroCopias(libroSolicitado.getNumeroCopias() - 1);
                }else{
                    JOptionPane.showMessageDialog(null,"No hay libros Disponibles");
                }
            }
            librosActualizados.add(libro);
        }
        
        
    if (usuarioEncontrado && libroEncontrado) {
        LocalDate fechaInicio = LocalDate.now();
        LocalDate fechaDevolucion = fechaInicio.plusWeeks(2);
        String estado = "pendiente";  // Estado inicial
        
        Prestamo prestamo = new Prestamo(libroSolicitado, u, fechaInicio, fechaDevolucion, estado);
        prestamos.add(prestamo);
           
        
        
        fichero.guardarLibrosEnArchivo(librosActualizados);  // Guardar el catálogo actualizado

        JOptionPane.showMessageDialog(null, "Préstamo realizado exitosamente.");
        
        if (LocalDate.now().isAfter(fechaDevolucion)) {
            prestamo.setEstado("atrasado");
            JOptionPane.showMessageDialog(null, "El préstamo está atrasado.");
        }
        // Guardar préstamo en el archivo
        Ficheros.guardarEnArchivo("prestamos.txt", prestamo.toString());
         
        fichero.registrarPrestamosEnLog("Prestamo", prestamo);
        } else {
        if (!libroEncontrado) {
            JOptionPane.showMessageDialog(null, "No se encontró un libro con el ISBN proporcionado.");
        }
        if (!usuarioEncontrado) {
            JOptionPane.showMessageDialog(null, "No se encontró un usuario con el nombre proporcionado.");
        }
    }
        
    }
    
    //**********************************REGISTRAR DEVOLUCION************************************************//
    
    public void registrarDevolucion(){
        Ficheros fichero = new Ficheros();
        String nombreLector = JOptionPane.showInputDialog("Ingrese el nombre del lector:");
        String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del libro:");
        
        List<String> P = fichero.Leer("prestamos.txt");
        
        for (String lineas : P) {
           //System.out.println("linea leida: " + lineas);
           // Prestamo prestamo = convertirLineaAPrestamo(lineas);
           // System.out.println("prestamos: " + prestamo);
            
            
        } 
    }
        
        
    

        
    
}


