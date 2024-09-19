
package app;

import javax.swing.*;

public class Funcion_2 {
    public static void main(String[] args) {
        
        int numeroDeProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de productos:"));
        String[] nombres = new String[numeroDeProductos];
        int[] cantidades = new int[numeroDeProductos];
        int nivelMinimo = 5; // Nivel mínimo de stock
        
        for (int i = 0; i < numeroDeProductos; i++) {
            nombres[i] = JOptionPane.showInputDialog("Ingrese el nombre del producto " + (i + 1) + ":");
            cantidades[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto " + nombres[i] + ":"));
        }
        
        determinarNivelDeStock(nombres, cantidades, nivelMinimo);
    }
//    2. La tienda SuperMart necesita un programa en Java para determinar el nivel 
//    de stock de productos, con una función que recibe las cantidades de varios 
//    productos y el nivel mínimo requerido de stock, y determina si es necesario 
//    realizar un pedido para cada producto.
    
    public static void determinarNivelDeStock(String[] nombres, int[] cantidades, int nivelMinimo) {
        for (int i = 0; i < cantidades.length; i++) {
            if (cantidades[i] <= nivelMinimo) {
                JOptionPane.showMessageDialog(null, "El producto " + nombres[i] + " necesita hacer un pedido. Cantidad actual: " + cantidades[i]);
            } else {
                JOptionPane.showMessageDialog(null, "El producto " + nombres[i] + " tiene suficiente stock. Cantidad actual: " + cantidades[i]);
            }
        }
    }
    
}
