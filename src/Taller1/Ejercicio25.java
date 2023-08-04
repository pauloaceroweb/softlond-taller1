package Taller1;

import javax.swing.*;

public class Ejercicio25 {
    /*Pide al usuario una frase y muestra cada palabra por separado*/

    public void run() {
        String frase = JOptionPane.showInputDialog("Ingrese una frase:");

        String[] palabras = obtenerPalabras(frase);

        JOptionPane.showMessageDialog(null, "Palabras en la frase:");
        for (String palabra : palabras) {
            JOptionPane.showMessageDialog(null, palabra);
        }
    }

    // Función para obtener las palabras de una frase
    public String[] obtenerPalabras(String frase) {
        // Eliminamos los espacios en blanco al inicio y final de la frase
        frase = frase.trim();

        // Dividimos la frase en palabras utilizando los espacios en blanco como separadores
        return frase.split("\\s+" + "\n");
    }
}
