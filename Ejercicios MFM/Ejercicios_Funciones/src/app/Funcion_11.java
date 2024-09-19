
package app;

import javax.swing.JOptionPane;

public class Funcion_11 {
    public static void main(String[] args) {
        int numvehiculos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de vehículos en la flota:"));
        
        double[] distancia = new double[numvehiculos];
        double[] combustible = new double[numvehiculos];
        
        for (int i = 0; i < numvehiculos; i++) {
            distancia[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la distancia recorrida por el vehículo" + (i + 1) + " (en kilómetros):"));
            combustible[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el combustible consumido por el vehículo" + (i + 1) + " (en litros):"));
        }
        
        double promedio = promedioCombustibleFlota(distancia,combustible);
        
        JOptionPane.showMessageDialog(null,"El consumo promedio de combustible de la flota es: " + promedio + " km/l");
         
    }
//    11.Una empresa de transporte necesita un programa en Java para calcular el 
//    consumo de combustible de una flota de vehículos, con una función que 
//    recibe la distancia recorrida y el combustible consumido por varios 
//    vehículos, y devuelve el consumo promedio de combustible de la flota
    
    private static double promedioCombustibleFlota(double[] distancia, double[] combustible){
        double combustibleTotal = 0;
        for (int i = 0; i < distancia.length; i++) {
            combustibleTotal += distancia[i] / combustible[i];
        }
        return combustibleTotal / distancia.length;
        
        
    }
}
