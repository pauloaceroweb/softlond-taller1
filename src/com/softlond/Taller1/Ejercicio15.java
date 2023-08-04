package com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio15 {
    /*Crea un programa que pida al usuario un número entero y determine si es un
    número capicúa. Un número capicúa es aquel que se lee igual de izquierda a
    derecha que de derecha a izquierda*/

    public void run() {
        String input = JOptionPane.showInputDialog("Ingrese un número entero:");
        int numero = Integer.parseInt(input);

        if (esNumeroCapicua(numero)) {
            JOptionPane.showMessageDialog(null, "El número " + numero + ", ES Capicúa.");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + numero + ", NO es Capicúa.");
        }
    }

    public boolean esNumeroCapicua(int numero) {
        int numeroInverso = 0;
        int original = numero;

        while (numero != 0) {
            int digito = numero % 10;
            numeroInverso = (numeroInverso) * 10 + digito;
            numero /= 10;
        }

        return original == numeroInverso;
    }
}
