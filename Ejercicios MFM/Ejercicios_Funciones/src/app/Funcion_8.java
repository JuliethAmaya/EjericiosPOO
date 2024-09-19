
package app;

import javax.swing.*;

public class Funcion_8 {
    public static void main(String[] args) {
        try {
            double costoMateriales = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo de los Materiales:"));
            double costoManodeObra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo de la mano de obra:"));
            double costoEquipos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo de las maquinas:"));
        
            double costoTotal = costoTotalProyecto(costoMateriales, costoManodeObra, costoEquipos);
            
            JOptionPane.showMessageDialog(null, "El costo total del proyecto de construcción es: $"+ costoTotal);    
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            
        }
    }
//    8. Una constructora necesita un programa en Java para calcular el costo de 
//    un proyecto de construcción, con una función que recibe los costos de 
//    materiales, mano de obra y equipos, y devuelve el costo total del proyecto.

    
    private static double costoTotalProyecto(double costoMateriales, double costoManoObra,double costoEquipos){
        return costoMateriales + costoManoObra + costoEquipos;
    }
}
