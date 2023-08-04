package com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio7 {
    /*Crea un programa que pida al usuario un número entero positivo y muestre su tabla de multiplicar hasta el 10.
     */

    public void tablaMultiplicar() {
        String input = JOptionPane.showInputDialog("Ingrese el número de la tabla");
        int numTabla = Integer.parseInt(input);

        if (numTabla <= 0) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número entero positivo.");
        } else {
            tabla(numTabla);
        }
    }

    public void tabla(int numTabla) {
        String tabla = "Tabla de multiplicar del " + numTabla + ":\n";
        for (int i = 1; i <= 10; i++) {
            tabla += numTabla + " x " + i + " = " + (numTabla * i) + "\n";
        }
        JOptionPane.showMessageDialog(null, tabla);
    }

}
