
package app;

import javax.swing.JOptionPane;

public class Funcion_4 {
    public static void main(String[] args) {
        int numeroDepartamentos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de departamentos: "));
        
        String[] nombres = new String[numeroDepartamentos];
        double[] ganancias = new double[numeroDepartamentos];
        
        for (int i = 0; i < numeroDepartamentos; i++) {
            nombres[i] = JOptionPane.showInputDialog("Ingrese el nombre del departamento "+ (i + 1)+ ":");
            ganancias[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese las ganancias trimestrales del departamento "+ nombres[i]+":"));
            
            
        }
        
        String mejorDepartamento = MejorRendimiento(nombres, ganancias);
        
        JOptionPane.showMessageDialog(null,"El departamento con mejor rendimiento es " + mejorDepartamento);
        
    }
//    4. La corporación FinTech necesita un programa en Java para evaluar el 
//    rendimiento trimestral de departamentos, con una función que recibe las 
//    ganancias trimestrales de varios departamentos y determina cuál tuvo el 
//    mejor rendimiento.
    
    public static String MejorRendimiento(String[] nombres,double[] ganancias ){
        int indiceMejor = 0;
        for (int i = 1; i < ganancias.length; i++) {
            if (ganancias[i] > ganancias[indiceMejor]) {
                indiceMejor = i;
            }
        }
        return nombres[indiceMejor];
    }

}
