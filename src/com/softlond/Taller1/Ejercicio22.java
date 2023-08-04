package com.softlond.Taller1;

import javax.swing.*;
import java.text.Normalizer;

public class Ejercicio22 {
    /*Escribe un programa que solicite al usuario una frase y verifique si es un
    palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda)*/

    public void run() {
        String frase = JOptionPane.showInputDialog("Ingrese una frase:");
        String fraseSinAcentos = quitarAcentosEspacios(frase);

        boolean esPalindromo = esPalindromo(fraseSinAcentos);

        String resultado = "Frase original: " + frase + "\nFrase invertida: " + invertirFrase(frase) + "\n";
        if (esPalindromo) {
            resultado += "Es un palíndromo.";
        } else {
            resultado += "No es un palíndromo.";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }

    public String quitarAcentosEspacios(String cadena) {
        String cadenaSinAcentos = Normalizer.normalize(cadena, Normalizer.Form.NFD);
        cadenaSinAcentos = cadenaSinAcentos.replaceAll("\\p{M}", "");
        cadenaSinAcentos = cadenaSinAcentos.replaceAll("\\s", "");
        return cadenaSinAcentos.toLowerCase();
    }

    public String invertirFrase(String frase) {
        return new StringBuilder(frase).reverse().toString();
    }

    public boolean esPalindromo(String frase) {
        frase = frase.toLowerCase();
        return frase.equals(invertirFrase(frase));
    }
}
