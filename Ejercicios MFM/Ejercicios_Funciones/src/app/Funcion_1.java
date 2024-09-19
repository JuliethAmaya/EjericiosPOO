
package app;

import javax.swing.*;

public class Funcion_1{
    public static void main(String[] args) {
         try {
           
            double salarioMensual = Double.parseDouble(JOptionPane.showInputDialog("Digite el salario mensual: "));
            double porcentajeRetencion = Double.parseDouble(JOptionPane.showInputDialog("Digite el porcentaje de retención en la fuente: "));
            
            double[] resultados = calcularSalarioAnualYRetencion(salarioMensual, porcentajeRetencion);
            double salarioAnual = resultados[0];
            double deduccionRetencion = resultados[1];
            
            
            JOptionPane.showMessageDialog(null, "El salario anual total es: " + salarioAnual + "\nLa deducción de retención en la fuente es: " + deduccionRetencion);
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Entrada inválida, por favor ingrese números válidos.");
        }
    }
    /*1.La empresa GlobalTech necesita un programa en Java para calcular el
    salario anual y la deducción de retención en la fuente de un empleado. El
    programa debe incluir una función que reciba el salario mensual de un
    empleado y el porcentaje de retención en la fuente, y devuelva el salario
    anual total y el monto de la deducción de retención en la fuente.
    */
    public static double[] calcularSalarioAnualYRetencion(double salarioMensual, double porcentajeRetencion) {
        double salarioAnual = salarioMensual * 12;
        double deduccionRetencion = salarioAnual * (porcentajeRetencion / 100);
        return new double[] {salarioAnual, deduccionRetencion};
    }       
        
}
    
   

