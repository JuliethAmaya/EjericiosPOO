
package app;

import javax.swing.JOptionPane;

public class Funcion_12 {
    public static void main(String[] args) {
        int numEquipos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de equipos en la liga:"));
        String[] nombre = new String[numEquipos];
        int[] puntosEquipo = new int[numEquipos];
        
        for (int i = 0; i < numEquipos; i++) {
            nombre[i] = JOptionPane.showInputDialog("Ingrese el nombre del equipo" + (i + 1) + ":");
            puntosEquipo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los puntos del equipo " + nombre[i] + " :"));
            
        }
        String equiposconMayorPun = determinarEquipoConMasPuntos(nombre, puntosEquipo);
        
        JOptionPane.showMessageDialog(null, "El equipo con más puntos es: " + equiposconMayorPun);

        
    }
//    12.Una liga deportiva necesita un programa en Java para determinar el equipo 
//    con más puntos en una liga, con una función que recibe los puntos de 
//    varios equipos y determina cuál tiene la mayor cantidad de puntos.
    
    public static String determinarEquipoConMasPuntos(String[] nombre,int[] puntosE){
        int indiceMejor = 0;
        for (int i = 1; i < puntosE.length; i++) {
            if(puntosE[i] > puntosE[indiceMejor]){
                indiceMejor = i;
            }
        }
        return nombre[indiceMejor];
    }
    

}
