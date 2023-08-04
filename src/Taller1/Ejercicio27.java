package Taller1;

import javax.swing.*;
import java.util.Arrays;

public class Ejercicio27 {

    /*Crea un programa que solicite al usuario una frase y luego muestre las
    palabras ordenadas alfabéticamente*/

    public void run() {
        String frase = JOptionPane.showInputDialog("Ingrese una frase:");

        String[] palabras = obtenerPalabras(frase);
        Arrays.sort(palabras);

        JOptionPane.showMessageDialog(null, "Palabras ordenadas alfabéticamente:");
        for (String palabra : palabras) {
            JOptionPane.showMessageDialog(null, palabra);
        }
    }

    // Función para obtener las palabras de una frase
    public String[] obtenerPalabras(String frase) {
        // Eliminamos los espacios en blanco al inicio y final de la frase
        frase = frase.trim();

        // Dividimos la frase en palabras utilizando los espacios en blanco como separadores
        return frase.split("\\s+");
    }

}
