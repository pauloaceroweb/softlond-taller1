package com.softlond.Taller1;

import javax.swing.*;
import java.text.Normalizer;

public class Ejercicio24 {
    /*Realiza un programa que solicite al usuario una cadena y reemplace todas
    las apariciones de una letra específica por otra*/

    public void run() {
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena:");
        String letraOriginal = JOptionPane.showInputDialog("Ingrese la letra que desea reemplazar:");
        String letraReemplazo = JOptionPane.showInputDialog("Ingrese la letra de reemplazo:");

        char original = letraOriginal.charAt(0);
        char reemplazo = letraReemplazo.charAt(0);

        String cadenaReemplazada = reemplazarLetra(cadena, original, reemplazo);

        JOptionPane.showMessageDialog(null, "Cadena original: " + cadena + "\n"
                + "Cadena con reemplazo: " + cadenaReemplazada
        );
    }

    public String reemplazarLetra(String cadena, char original, char reemplazo) {
        String cadenaSinAcentos = Normalizer.normalize(cadena, Normalizer.Form.NFD);
        return cadenaSinAcentos.replace(original, reemplazo);
    }
}
