
package app;

import javax.swing.*;

public class Funcion_6 {
    public static void main(String[] args) {
        double capitalInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el capital inicial de la inversion: "));
        double tasaInteresAnual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tasa de interés anual (en %): "))/100;
        int numAnios = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de años de la inversión: "));
        
        double valorFuturo = calcularValorFuturo(capitalInicial, tasaInteresAnual, numAnios);
        
        JOptionPane.showMessageDialog(null, "El valor futuro de la inversión es: $" + valorFuturo);
        
    }
    
//    6. Un asesor financiero necesita un programa en Java para calcular la 
//    rentabilidad de una inversión, con una función que recibe el capital inicial, la 
//    tasa de interés anual y el número de años, y devuelve el valor futuro de la 
//    inversión utilizando interés compuesto.
    
    private static double calcularValorFuturo (double capitalInicial,double tasaInteres, int numAnios){
        return capitalInicial * Math.pow(1 + tasaInteres, numAnios);
        
    }
    
}
