package com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio16 {
    /*Realiza un programa que calcule e imprima la serie de Fibonacci hasta un
    número dado ingresado por el usuario.*/

    public void run() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número para la serie de Fibonacci:"));

        JOptionPane.showMessageDialog(null, "Serie de Fibonacci con " + numero + " elementos:\n"
                + obtenerSerieFibonacci(numero));
    }

    // Función para obtener la serie de Fibonacci con el número de elementos indicado
    public String obtenerSerieFibonacci(int numero) {
        StringBuilder serie = new StringBuilder();
        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < numero; i++) {
            serie.append(num1).append(", ");
            int siguiente = num1 + num2;
            num1 = num2;
            num2 = siguiente;
        }

        return serie.toString();
    }
}
