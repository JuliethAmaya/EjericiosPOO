//
//package app;
//
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Scanner;
//
//public class GestionReservasHotel {
//    private static final int MAX_RESERVAS = 100;
//    private static String[][] reservas = new String[MAX_RESERVAS][6]; // Matriz para reservas
//    private static double[] costos = new double[MAX_RESERVAS]; // Array para costos
//    private static int contadorReservas = 0;
//    private static Scanner scanner = new Scanner(System.in);
//    private static SimpleDateFormat fechaFormato = new SimpleDateFormat("dd/MM/yyyy");
//
//    public static void main(String[] args) throws ParseException {
//        boolean continuar = true;
//
//        while (continuar) {
//            System.out.println("Seleccione una opción:");
//            System.out.println("1. Registrar nueva reserva");
//            System.out.println("2. Cancelar reserva");
//            System.out.println("3. Calcular y mostrar costos");
//            System.out.println("4. Mostrar información detallada de las reservas");
//            System.out.println("5. Salir");
//
//            int opcion = scanner.nextInt();
//            scanner.nextLine();  // Consumir la nueva línea
//
//            switch (opcion) {
//                case 1 -> registrarReserva();
//                case 2 -> cancelarReserva();
//                case 3 -> calcularYMostrarCostos();
//                case 4 -> mostrarInformacionReservas();
//                case 5 -> {
//                    continuar = false;
//                    System.out.println("Saliendo del programa...");
//                }
//                default -> System.out.println("Opción no válida. Intente nuevamente.");
//            }
//        }
//    }
//
//    private static void registrarReserva() throws ParseException {
//        if (contadorReservas >= MAX_RESERVAS) {
//            System.out.println("El sistema de reservas está lleno.");
//            return;
//        }
//
//        System.out.println("Ingrese la información del huésped:");
//        
//        System.out.print("Nombre: ");
//        String nombre = scanner.nextLine();
//        
//        System.out.print("Apellido: ");
//        String apellido = scanner.nextLine();
//        
//        System.out.print("Cédula: ");
//        String cedula = scanner.nextLine();
//        
//        System.out.print("Número de habitación: ");
//        String numeroHabitacion = scanner.nextLine();
//        
//        System.out.print("Fecha de entrada (dd/MM/yyyy): ");
//        String fechaEntradaStr = scanner.nextLine();
//        
//        System.out.print("Fecha de salida (dd/MM/yyyy): ");
//        String fechaSalidaStr = scanner.nextLine();
//
//        Date fechaEntrada = parseFecha(fechaEntradaStr);
//        Date fechaSalida = parseFecha(fechaSalidaStr);
//
//        if (fechaEntrada == null || fechaSalida == null || fechaEntrada.after(fechaSalida)) {
//            System.out.println("Fechas inválidas.");
//            return;
//        }
//
//        long diferencia = fechaSalida.getTime() - fechaEntrada.getTime();
//        int noches = (int) (diferencia / (1000 * 60 * 60 * 24));
//        
//        System.out.print("Precio por noche: ");
//        double precioPorNoche = scanner.nextDouble();
//        scanner.nextLine();  // Consumir la nueva línea
//
//        double costoTotal = noches * precioPorNoche;
//        
//        reservas[contadorReservas][0] = nombre;
//        reservas[contadorReservas][1] = apellido;
//        reservas[contadorReservas][2] = cedula;
//        reservas[contadorReservas][3] = numeroHabitacion;
//        reservas[contadorReservas][4] = fechaEntradaStr;
//        reservas[contadorReservas][5] = fechaSalidaStr;
//        costos[contadorReservas] = costoTotal;
//        contadorReservas++;
//
//        System.out.println("Reserva registrada exitosamente.");
//    }
//
//    private static void cancelarReserva() {
//        System.out.print("Ingrese la cédula del huésped cuya reserva desea cancelar: ");
//        String cedula = scanner.nextLine();
//
//        boolean reservaCancelada = false;
//        for (int i = 0; i < contadorReservas; i++) {
//            if (reservas[i][2].equals(cedula)) {
//                for (int j = i; j < contadorReservas - 1; j++) {
//                    reservas[j] = reservas[j + 1];
//                    costos[j] = costos[j + 1];
//                }
//                reservas[contadorReservas - 1] = new String[6];
//                costos[contadorReservas - 1] = 0;
//                contadorReservas--;
//                reservaCancelada = true;
//                System.out.println("Reserva cancelada exitosamente.");
//                break;
//            }
//        }
//
//        if (!reservaCancelada) {
//            System.out.println("Reserva no encontrada.");
//        }
//    }
//
//    private static void calcularYMostrarCostos() {
//        double costoTotal = 0;
//
//        for (int i = 0; i < contadorReservas; i++) {
//            costoTotal += costos[i];
//        }
//
//        System.out.println("El costo total de todas las reservas es: $" + costoTotal);
//    }
//
//    private static void mostrarInformacionReservas() {
//        if (contadorReservas == 0) {
//            System.out.println("No hay reservas en el sistema.");
//            return;
//        }
//
//        for (int i = 0; i < contadorReservas; i++) {
//            System.out.println("Reserva " + (i + 1) + ":");
//            System.out.println("Nombre: " + reservas[i][0] + " " + reservas[i][1]);
//            System.out.println("Cédula: " + reservas[i][2]);
//            System.out.println("Número de habitación: " + reservas[i][3]);
//            System.out.println("Fecha de entrada: " + reservas[i][4]);
//            System.out.println("Fecha de salida: " + reservas[i][5]);
//            System.out.println("Costo total: $" + costos[i]);
//            System.out.println();
//        }
//    }
//
//    private static Date parseFecha(String fechaStr) throws ParseException {
//        return fechaFormato.parse(fechaStr);
//    }
//    
//}
