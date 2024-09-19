
package app;

import javax.swing.*;

public class Funcion_3 {
    public static void main(String[] args) {
        double costoMateriales = Double.parseDouble(JOptionPane.showInputDialog("Ingrese costo de los materiales: "));
        double costoManoDeObra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo de la mano de obra: "));
        double gastosGenerales = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el costo de los gastos generales: "));
        
        double costoTotal = calcularCostoTotalProduccion(costoMateriales, costoManoDeObra, gastosGenerales);
                
        JOptionPane.showMessageDialog(null, "EL costo total de produccion es: $"+ costoTotal);
    }
//    3. Una fábrica necesita un programa en Java para calcular el costo total de 
//    producción, con una función que recibe los costos de materiales, mano de 
//    obra y gastos generales, y devuelve el costo total de producción.
    
    public static double calcularCostoTotalProduccion(double materiales,double manodeObra,double gastosGenerales){
        return materiales + manodeObra + gastosGenerales;
    }  
    
}
