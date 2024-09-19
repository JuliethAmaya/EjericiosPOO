
package app;


public class Principal {
    public static void main(String[] args) {
        
        Evento objEvento = new Evento();
        objEvento.mostrarEve("Seminario de Medicina Avanzada","11-10-2024","Hotel Hilton, Bogota, Colombia", 200);
        System.out.println("Evento");
        System.out.println("Nombre: "+ objEvento.getNombre());
        System.out.println("Fecha: "+ objEvento.getFecha());
        System.out.println("Lugar: "+ objEvento.getLugar());
        System.out.println("Asistentes: "+ objEvento.getAsistentes());
        
        System.out.println("*************************************************************************");
        
        Pedido objPedido = new Pedido();
        objPedido.mostrarPed("D44556","Impresora HP LaserJet Pro","5",350);
        System.out.println("Pedido");
        System.out.println("Codigo del Pedido: "+ objPedido.getCodigoP());
        System.out.println("Producto: "+ objPedido.getProducto());
        System.out.println("Cantidad: "+ objPedido.getCantidad());
        System.out.println("Precio Total: $"+ objPedido.getPrecioTotal());
        
        System.out.println("*************************************************************************");
        
        Curso objCurso = new Curso();
        objCurso.mostrarCur("Literatura Inglesa",210,"3","Prof. Luis Gomez");
        System.out.println("Curso");
        System.out.println("Nombre: "+ objCurso.getNombre());
        System.out.println("Codigo: "+ objCurso.getCodigo());
        System.out.println("Creditos: "+ objCurso.getCreditos());
        System.out.println("Profesor: "+ objCurso.getProfesor());
        
        System.out.println("*************************************************************************");
        
        Paciente objPaciente = new Paciente();
        objPaciente.mostrorP("Lucia Morales",28,"Asma","Dra. Ana Lopez");
        System.out.println("Paciente");
        System.out.println("Nombre: "+ objPaciente.getNombre());
        System.out.println("Edad: "+ objPaciente.getEdad());
        System.out.println("Enfermedad: "+ objPaciente.getEnfermedad());
        System.out.println("Doctor: "+ objPaciente.getDoctor());

        System.out.println("*************************************************************************");
        
        Cliente objCliente = new Cliente();
        objCliente.mostrarCli("Juan Perez","Calle 123, Bogota, Colombia","3234567890", "juan.perez@gmail.com");
        System.out.println("Cliente");
        System.out.println("Nombre: "+ objCliente.getNombre());
        System.out.println("Direccion: "+ objCliente.getDireccion());
        System.out.println("Telefono: "+ objCliente.getTelefono());
        System.out.println("Email: "+ objCliente.getEmail());
        
        System.out.println("*************************************************************************");
        
        Coche objCoche = new Coche();
        objCoche.mostrarC("Toyota", "Corolla", "2020", 20000000);
        System.out.println("Coche");
        System.out.println("Marca: "+ objCoche.getMarca());
        System.out.println("Modelo: "+ objCoche.getModelo());
        System.out.println("Anio: "+ objCoche.getAño());
        System.out.println("Precio: "+ objCoche.getPrecio());
    
        System.out.println("*************************************************************************");
        
        Producto objProducto = new Producto();
        objProducto.mostrarP(456, "Azucar",2500,5);
        System.out.println("Producto");
        System.out.println("Codigo: "+ objProducto.getCódigo());
        System.out.println("Nombre: "+ objProducto.getNombre());
        System.out.println("Precio: $"+ objProducto.getPrecio());
        System.out.println("Stock: "+ objProducto.getStock());
  
        System.out.println("*************************************************************************");
        
        Empleado objEmpleado = new Empleado();
        objEmpleado.mostrarEmp("Marcos Castillo", "Presidente", 10000000, "Nuevo");
        System.out.println("Empleado");
        System.out.println("Nombre:"+ objEmpleado.getNombre());
        System.out.println("Puesto:"+ objEmpleado.getPuesto());
        System.out.println("Salario:"+ objEmpleado.getSalario());
        System.out.println("Antiguedad:"+ objEmpleado.getAntigüedad());
        
        System.out.println("*************************************************************************");
        
        Estudiante objEstudiante = new Estudiante();
        objEstudiante.mostrarE("Maria Perez", "18", "Medicina", 4.5);
        System.out.println("Estudiante");
        System.out.println("Nombre: "+ objEstudiante.getNombre());
        System.out.println("Edad: "+ objEstudiante.getEdad());
        System.out.println("Carrera: "+ objEstudiante.getCarrera());
        System.out.println("Promedio: "+ objEstudiante.getPromedio());
        
        System.out.println("*************************************************************************");
        
        Libro objLibro = new Libro();
        objLibro.MostrarL("978-3-16-148410-0", "El nombre del viento", "Patrick Rothfuss", "Si");
        System.out.println("Libro");
        System.out.println("ISBN: "+ objLibro.getISBN());
        System.out.println("Titulo: "+ objLibro.getTitulo());
        System.out.println("Autor: "+ objLibro.getAutor());
        System.out.println("Disponible: "+ objLibro.getDisponible());
        
    }
    
}
