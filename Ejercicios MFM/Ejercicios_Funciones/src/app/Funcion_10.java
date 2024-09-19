
package app;

import javax.swing.*;

public class Funcion_10 {
    public static void main(String[] args) {
        try {
            double distancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la distancia (kilometros): "));
        double velocidadP = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad promedio del vehiculo (en km/h):"));
        
        double tiempoEn = calcularTiempoDePaquete(distancia,velocidadP);
        
        JOptionPane.showMessageDialog(null, "La distancia estimada de producto es: "+ tiempoEn);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
//    10.Una empresa de mensajería necesita un programa en Java para calcular el 
//    tiempo estimado de entrega de un paquete, con una función que recibe la 
//    distancia y la velocidad promedio del vehículo de entrega, y devuelve el 
//    tiempo estimado de entrega
    
    private static double calcularTiempoDePaquete(double distancia, double velocidad){
        return distancia / velocidad;
    }
}
