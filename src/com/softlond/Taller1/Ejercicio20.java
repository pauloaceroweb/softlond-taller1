package com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio20 {
    /*Realiza un programa que solicite al usuario una cadena y luego invierta su
    orden*/

    public void run() {
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena:");

        String cadenaInvertida = invertirCadena(cadena);

        JOptionPane.showMessageDialog(null, "Cadena invertida: " + cadenaInvertida);
    }

    public String invertirCadena(String cadena) {
        StringBuilder cadenaInvertida = new StringBuilder(cadena);
        cadenaInvertida.reverse();
        return cadenaInvertida.toString();
    }
}
