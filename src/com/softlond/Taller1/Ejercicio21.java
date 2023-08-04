package com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio21 {
    /*Pide al usuario una cadena y muestra cuántas veces aparece una letra
    específica en ella*/

    public void run() {
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena:");
        String letraInput = JOptionPane.showInputDialog("Ingrese la letra que desea contar:");

        char letra = letraInput.charAt(0);

        int cantidad = contarLetra(cadena, letra);


        JOptionPane.showMessageDialog(null, "Cadena original: " + cadena + "\n"
                + "La letra '" + letra + "' aparece " + cantidad + " veces en la cadena.");
    }

    public int contarLetra(String cadena, char letra) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }
}
