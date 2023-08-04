package Taller1;

import javax.swing.*;

public class Ejercicio23 {
    /*Crea un programa que pida al usuario una oración y muestre cuántas
    palabras contiene*/

    public void run() {
        String oracion = JOptionPane.showInputDialog("Ingrese una oración:");

        int cantidadPalabras = contarPalabras(oracion);

        JOptionPane.showMessageDialog(null, "La oración contiene " + cantidadPalabras + " palabras.");
    }

    // Función para contar la cantidad de palabras en una oración
    public int contarPalabras(String oracion) {
        // Eliminamos los espacios en blanco al inicio y final de la oración
        oracion = oracion.trim();

        if (oracion.isEmpty()) {
            // Si la oración está vacía, no contiene palabras
            return 0;
        }

        // Contamos las palabras contando la cantidad de espacios en blanco
        // y sumando 1 para obtener el número total de palabras
        return oracion.split("\\s+").length;
    }

}
