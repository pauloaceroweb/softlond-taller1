package com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio10 {

    /*Ejercicio 10: Crea un programa que muestre los primeros 20 números de la serie Fibonacci.
    La serie Fibonacci se forma sumando los dos números anteriores para obtener el siguiente
    número: 0, 1, 1, 2, 3, 5, 8, 13, …
     */

    public void fibonacci() {
        int numero = 20;
        int num1 = 0;
        int num2 = 1;
        StringBuilder serie = new StringBuilder();
        for (int i = 0; i < numero; i++) {
            serie.append(num1).append(", ");
            int siguiente = num1 + num2;
            num1 = num2;
            num2 = siguiente;
        }
        JOptionPane.showMessageDialog(null, "La serie Fibonacci de " + numero + " elementos es: \n" + serie);
    }

}
