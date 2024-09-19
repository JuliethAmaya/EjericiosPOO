
package app;

import javax.swing.*;

public class Funcion_13 {
    public static void main(String[] args) {
        try {
             int numAsignaturas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de asignaturas:"));
             
             String[] nombreAsignatura = new String[numAsignaturas];
             double[] calificacion = new double[numAsignaturas];
             
             for (int i = 0; i < numAsignaturas; i++) {
                 nombreAsignatura[i] = JOptionPane.showInputDialog("Ingrese el nombre de la Asignatura "+(i + 1)+":");
                 calificacion[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de "+ nombreAsignatura[i]+ ":"));
            }
            double promedio = calcularPromedio(calificacion);
            
            JOptionPane.showMessageDialog(null, "El promedio de las notas es: "+ promedio);
             
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
//    13.Una universidad necesita un programa en Java para calcular el rendimiento 
//    académico de un estudiante, con una función que recibe las calificaciones 
//    de un estudiante en varias asignaturas y devuelve su promedio.

    private static double calcularPromedio(double[] calificaciones){
        double suma = 0;

        for (double calificacion : calificaciones) {
            suma += calificacion;
        }

        return suma / calificaciones.length;
    }
    
}
