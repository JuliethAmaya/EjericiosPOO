
package app;

import java.util.ArrayList;
import java.util.Scanner;

class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private double precio;
    private int cantidadEnStock;

    public Libro(String titulo, String autor, String ISBN, double precio, int cantidadEnStock) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public double calcularValorTotal() {
        return precio * cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + ISBN + ", Precio: $" + precio + 
                ", Cantidad en stock: " + cantidadEnStock + ", Valor total: $" + calcularValorTotal();
    }
}

public class GestionInventarioLibreria {
    private static ArrayList<Libro> inventario = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar libro al inventario");
            System.out.println("2. Eliminar libro del inventario");
            System.out.println("3. Calcular valor total del inventario");
            System.out.println("4. Mostrar información detallada de los libros");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    agregarLibro();
                    break;
                case 2:
                    eliminarLibro();
                    break;
                case 3:
                    calcularValorTotalInventario();
                    break;
                case 4:
                    mostrarInformacionDetallada();
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

    private static void agregarLibro() {
        System.out.println("Ingrese la información del libro:");
        
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        
        System.out.print("ISBN: ");
        String ISBN = scanner.nextLine();
        
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        
        System.out.print("Cantidad en stock: ");
        int cantidadEnStock = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea

        Libro nuevoLibro = new Libro(titulo, autor, ISBN, precio, cantidadEnStock);
        inventario.add(nuevoLibro);

        System.out.println("Libro agregado al inventario.");
    }

    private static void eliminarLibro() {
        System.out.print("Ingrese el ISBN del libro que desea eliminar: ");
        String ISBN = scanner.nextLine();

        Libro libroAEliminar = null;

        for (Libro libro : inventario) {
            if (libro.getISBN().equals(ISBN)) {
                libroAEliminar = libro;
                break;
            }
        }

        if (libroAEliminar != null) {
            inventario.remove(libroAEliminar);
            System.out.println("Libro eliminado del inventario.");
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    private static void calcularValorTotalInventario() {
        double valorTotal = 0;

        for (Libro libro : inventario) {
            valorTotal += libro.calcularValorTotal();
        }

        System.out.println("El valor total del inventario es: $" + valorTotal);
    }

    private static void mostrarInformacionDetallada() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (Libro libro : inventario) {
                System.out.println(libro);
            }
        }
    }
}
    
