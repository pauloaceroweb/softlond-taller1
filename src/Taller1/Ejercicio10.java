package Taller1;

import javax.swing.*;

public class Ejercicio10 {

    /*Ejercicio 10: Crea un programa que muestre los primeros 20 números de la serie Fibonacci.
    La serie Fibonacci se forma sumando los dos números anteriores para obtener el siguiente
    número: 0, 1, 1, 2, 3, 5, 8, 13, …
     */

    public void fibonacci() {
        int numero = 20;
        int a = 0, b = 1, c;
        String aux = "";
        for (int i = 0; i < numero; i++) {
            aux += a + ", ";
            c = a + b;
            a = b;
            b = c;
        }
        JOptionPane.showMessageDialog(null, "La serie Fibonacci de " + numero + " elementos es: \n" + aux);
    }
}
