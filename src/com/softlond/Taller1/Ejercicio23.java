package com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio23 {
    /*Crea un programa que pida al usuario una oración y muestre cuántas
    palabras contiene*/

    public void run() {
        String oracion = JOptionPane.showInputDialog("Ingrese una oración:");

        int cantidadPalabras = contarPalabras(oracion);

        JOptionPane.showMessageDialog(null, "La oración: "+ oracion
                + "\nContiene " + cantidadPalabras + " palabras.");
    }

    public int contarPalabras(String oracion) {
        oracion = oracion.trim();

        if (oracion.isEmpty()) {
            return 0;
        }

        return oracion.split("\\s+").length;
    }

}
