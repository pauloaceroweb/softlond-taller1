package com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio9 {
    /*Escribe un programa que solicite al usuario un número entero positivo y calcule su factorial.*/


    public void factorial() {
        String input = JOptionPane.showInputDialog("Ingrese un número entero positivo:");
        int numero = Integer.parseInt(input);

        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número entero positivo.");
        } else {
            long res = calcularFactorial(numero);
            JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + res);
        }
    }

    public long calcularFactorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            long fact = 1;
            for (int i = 1; i <= numero; i++){
                fact *= i;
            }
            return fact;
        }
    }

}
