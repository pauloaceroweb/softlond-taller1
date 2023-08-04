package com.softlond.Taller1;

import javax.swing.*;
import java.util.Arrays;

public class Ejercicio27 {

    /*Crea un programa que solicite al usuario una frase y luego muestre las
    palabras ordenadas alfabéticamente*/

    public void run() {
        String frase = JOptionPane.showInputDialog("Ingrese una frase:");

        String[] palabras = obtenerPalabras(frase);
        Arrays.sort(palabras);

        StringBuilder resultado = new StringBuilder();
        for (String palabra : palabras) {
            resultado.append(palabra).append("\n");
        }
        JOptionPane.showMessageDialog(null, "Palabras ordenadas alfabéticamente de la frase: \n"
                + "( " + frase + " )\n" + resultado
        );
    }

    public String[] obtenerPalabras(String frase) {
        frase = frase.trim();

        return frase.split("\\s+");
    }

}
