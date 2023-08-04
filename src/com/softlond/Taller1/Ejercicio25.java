package com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio25 {
    /*Pide al usuario una frase y muestra cada palabra por separado*/

    public void run() {
        String frase = JOptionPane.showInputDialog("Ingrese una frase:");

        String[] palabras = obtenerPalabras(frase);

        StringBuilder resultado = new StringBuilder();
        for (String palabra : palabras) {
            resultado.append(palabra).append("\n");
        }
        JOptionPane.showMessageDialog(null, "Palabras Separadas: \n" + resultado);
    }

    public String[] obtenerPalabras(String frase) {
        frase = frase.trim();

        return frase.split("\\s+");
    }
}
