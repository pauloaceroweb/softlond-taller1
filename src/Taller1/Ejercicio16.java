package Taller1;

import javax.swing.*;

public class Ejercicio16 {
    /*Realiza un programa que calcule e imprima la serie de Fibonacci hasta un
    número dado ingresado por el usuario.*/

    public void run() {
        String input = JOptionPane.showInputDialog("Ingrese el número máximo para la serie de Fibonacci:");
        int numeroMaximo = Integer.parseInt(input);

        if (numeroMaximo < 0) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número entero positivo o cero.");
        } else {
            System.out.println("Serie de Fibonacci hasta " + numeroMaximo + ":");
            for (int i = 0; fibonacci(i) <= numeroMaximo; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }
    }

    // Función para calcular el número de Fibonacci en la posición n
    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
