
package app;

import javax.swing.*;

public class Funcion_14 {
    public static void main(String[] args) {
        int numProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de productos:"));
        String[] nombresProductos = new String[numProductos];
        double[][] calificacionesProductos = new double[numProductos][];

        for (int i = 0; i < numProductos; i++) {
            nombresProductos[i] = JOptionPane.showInputDialog("Ingrese el nombre del producto " + (i + 1) + ":");
            int numCalificaciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de calificaciones para el producto " + nombresProductos[i] + ":"));
            calificacionesProductos[i] = new double[numCalificaciones];

            for (int j = 0; j < numCalificaciones; j++) {
                calificacionesProductos[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación " + (j + 1) + " del producto " + nombresProductos[i] + ":"));
            }
        }

        String mejorProducto = determinarMejorProducto(nombresProductos, calificacionesProductos);
        JOptionPane.showMessageDialog(null, "El producto con mejor calificación promedio es: " + mejorProducto);
    }
        
//    14.Una tienda en línea necesita un programa en Java para determinar el mejor 
//    producto basado en las opiniones de los clientes, con una función que 
//    recibe las calificaciones de varios productos y determina cuál tiene la mejor 
//    calificación promedio.

    private static String determinarMejorProducto(String[] nombresProductos, double[][] calificacionesProductos) {
        double mejorPromedio = -1;
        int indiceMejorProducto = -1;

        for (int i = 0; i < calificacionesProductos.length; i++) {
            double suma = 0;
            for (double calificacion : calificacionesProductos[i]) {
                suma += calificacion;
            }
            double promedio = suma / calificacionesProductos[i].length;
            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                indiceMejorProducto = i;
            }
        }
        return nombresProductos[indiceMejorProducto];
    }
    
}
