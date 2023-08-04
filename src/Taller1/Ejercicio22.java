package Taller1;

import javax.swing.*;

public class Ejercicio22 {
    /*Escribe un programa que solicite al usuario una frase y verifique si es un
    palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda)*/

    public void run() {
        String frase = JOptionPane.showInputDialog("Ingrese una frase:");

        if (esPalindromo(frase)) {
            JOptionPane.showMessageDialog(null, "La frase es un palíndromo.");
        } else {
            JOptionPane.showMessageDialog(null, "La frase NO es un palíndromo.");
        }
    }

    // Función para verificar si una frase es un palíndromo
    public boolean esPalindromo(String frase) {
        // Eliminamos espacios y convertimos a minúsculas para ignorar mayúsculas y espacios
        String fraseLimpia = frase.replaceAll("\\s+", "").toLowerCase();

        int izquierda = 0;
        int derecha = fraseLimpia.length() - 1;

        while (izquierda < derecha) {
            if (fraseLimpia.charAt(izquierda) != fraseLimpia.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }

        return true;
    }
}
