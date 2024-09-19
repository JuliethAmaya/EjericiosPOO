
package app;

import javax.swing.*;

public class Funcion_5 {
    public static void main(String[] args) {
        double valorInicial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor inicial del activo: "));
        double valorResidual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor residual del activo: "));
        int vidaUtil = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la vida util del activo(en anios): "));
        
        double depreciacionAnual = calcularDepreciacionAnual(valorInicial, valorResidual, vidaUtil);
        
        JOptionPane.showMessageDialog(null, "la depreciacion anual del activo: $"+ depreciacionAnual);
        
    }
//    5. Una empresa de tecnología necesita un programa en Java para calcular la
//    depreciación anual de un activo, con una función que recibe el valor inicial,
//    el valor residual y la vida útil de un activo, y devuelve la depreciación anual
//    utilizando el método de línea recta.
    
    private static double calcularDepreciacionAnual(double valorInicial,double valorResidual, int vidaUtil){
        return (valorInicial - valorResidual) / vidaUtil;
    }
}
