package Taller1;

import javax.swing.*;

public class Ejercicio15 {
    /*Crea un programa que pida al usuario un número entero y determine si es un
    número capicúa. Un número capicúa es aquel que se lee igual de izquierda a
    derecha que de derecha a izquierda*/

    public void run() {
        String input = JOptionPane.showInputDialog("Ingrese un número entero:");
        int numero = Integer.parseInt(input);

        if (esNumeroCapicua(numero)) {
            JOptionPane.showMessageDialog(null, numero + " es un número capicúa.");
        } else {
            JOptionPane.showMessageDialog(null, numero + " no es un número capicúa.");
        }
    }

    // Función para verificar si un número es capicúa
    public boolean esNumeroCapicua(int numero) {
        int numeroReverso = 0;
        int original = numero;

        while (numero != 0) {
            int digito = numero % 10;
            numeroReverso = numeroReverso * 10 + digito;
            numero /= 10;
        }

        return original == numeroReverso;
    }
}
