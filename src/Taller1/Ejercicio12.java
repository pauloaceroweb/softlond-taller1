package Taller1;

import javax.swing.*;

public class Ejercicio12 {
    /*Realiza un programa que pida al usuario un número entero y determine si es un número primo o no.*/

    public void primo() {
        String input = JOptionPane.showInputDialog("Ingrese un número entero positivo:");
        int numero = Integer.parseInt(input);

        boolean esPrimo = esNumeroPrimo(numero);

        String mensaje = "El número " + numero + (esPrimo ? " ES primo." : " NO es primo.");
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public boolean esNumeroPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i < numero/2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}