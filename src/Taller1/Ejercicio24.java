package Taller1;

import javax.swing.*;

public class Ejercicio24 {
    /*Realiza un programa que solicite al usuario una cadena y reemplace todas
    las apariciones de una letra específica por otra*/

    public void run() {
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena:");
        String letraOriginal = JOptionPane.showInputDialog("Ingrese la letra que desea reemplazar:");
        String letraReemplazo = JOptionPane.showInputDialog("Ingrese la letra de reemplazo:");

        char original = letraOriginal.charAt(0); // Obtener el primer carácter de la letra original
        char reemplazo = letraReemplazo.charAt(0); // Obtener el primer carácter de la letra de reemplazo

        String cadenaReemplazada = reemplazarLetra(cadena, original, reemplazo);

        JOptionPane.showMessageDialog(null, "Cadena original: " + cadena);
        JOptionPane.showMessageDialog(null, "Cadena con reemplazo: " + cadenaReemplazada);
    }

    // Función para reemplazar todas las apariciones de una letra por otra en una cadena
    public String reemplazarLetra(String cadena, char original, char reemplazo) {
        return cadena.replace(original, reemplazo);
    }
}
