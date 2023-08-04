package com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio14 {
    /*Escribe un programa que solicite al usuario un número entero positivo y
    verifique si es un número perfecto. Un número perfecto es aquel cuya suma
    de sus divisores propios (excluyendo al propio número) es igual al número*/

    public void run() {
        String input = JOptionPane.showInputDialog("Ingrese un número entero positivo:");
        int numero = Integer.parseInt(input);

        if (numero <= 0) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número entero positivo.");
        } else {
            if (esNumeroPerfecto(numero)) {
                JOptionPane.showMessageDialog(null, numero + " es un número perfecto.");
            } else {
                JOptionPane.showMessageDialog(null, numero + " no es un número perfecto.");
            }
        }
    }

    // Función para verificar si un número es perfecto
    public boolean esNumeroPerfecto(int numero) {
        int sumaDivisores = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores == numero;
    }

}
