
package app;

import javax.swing.*;

public class Funcion_7 {
        public static void main(String[] args) {
            
            int numEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de empleados:"));
            
            String[] nombres = new String [numEmpleados];
            int[] horaExtras = new int [numEmpleados];
            
            for (int i = 0; i < numEmpleados; i++) {
                nombres[i] = JOptionPane.showInputDialog("Ingrese el nombre del empleado " + (i + 1)+":");
                horaExtras[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas extras trabajadas por " + nombres[i] + ":"));
                
            }
            
            String informe = generarInformeHorasExtras(nombres, horaExtras);
            
            JOptionPane.showMessageDialog(null, informe);
    }
//    7. La empresa WorkHours Inc. necesita un programa en Java para generar un 
//    informe de horas extras trabajadas por empleados, con una función que 
//    recibe los nombres de empleados y las horas extras trabajadas por cada 
//    uno, y genera un informe detallado de las horas extras.

        private static String generarInformeHorasExtras(String[] nombres,int[] horasEx){
            StringBuilder informe = new StringBuilder();
            informe.append("INFERME DE HORAS EXTRAS\n");
            informe.append("===========================\n");
            
            for (int i = 0; i < nombres.length; i++) {
                informe.append("Empleado: ").append(nombres[i]).append(" - Horas Extras: ").append(horasEx[i]).append("\n");
                
            }
            return informe.toString();
        }
    
}
