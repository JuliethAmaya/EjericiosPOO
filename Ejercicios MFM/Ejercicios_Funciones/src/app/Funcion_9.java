
package app;

import javax.swing.JOptionPane;

public class Funcion_9 {
    public static void main(String[] args) {
        try {
            int numEmpleados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de empleados:"));
            
            String[] nombres = new String[numEmpleados];
            double[] horasTrabajadas = new double[numEmpleados];
            double[] salarioPorHora = new double[numEmpleados];
            
            for (int i = 0; i < numEmpleados; i++) {
                nombres[i] = JOptionPane.showInputDialog("Ingrese el nombre del empleado "+(i + 1)+":");
                horasTrabajadas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las horas trabajadas por " + nombres[i] + " en la semana:"));
                salarioPorHora[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario por hora de " + nombres[i] + ":"));
                
            }
            double nominaTotal = calcularNominaTotal(horasTrabajadas, salarioPorHora);
            
            JOptionPane.showMessageDialog(null, "La nómina total de la semana es: $" + nominaTotal);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
//    9. Una empresa de manufactura necesita un programa en Java para calcular
//    la nómina semanal de los empleados, con una función que recibe las horas
//    trabajadas y el salario por hora de varios empleados, y devuelve la nómina
//    total de la semana.
    private static double calcularNominaTotal(double[] horasTrabajadas, double[] salarioPorHora){
        double nominaTotal = 0;
        for (int i = 0; i < horasTrabajadas.length; i++) {
            nominaTotal += horasTrabajadas[i] * salarioPorHora[i];
        }

        return nominaTotal;
    }
    
}
