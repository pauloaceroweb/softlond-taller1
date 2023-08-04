package com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio19 {
    /*Escribe un programa que solicite al usuario su nombre y luego lo imprima en
    mayúsculas y minúsculas*/

    public void run() {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");

        String nombreMayusculas = nombre.toUpperCase();
        String nombreMinusculas = nombre.toLowerCase();

        JOptionPane.showMessageDialog(null, "Nombre en Mayúsculas: " + nombreMayusculas + "\n"
                + "Nombre en Minúsculas: " + nombreMinusculas
        );
    }
}
