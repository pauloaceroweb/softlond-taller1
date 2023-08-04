package Taller1;

import javax.swing.*;

public class Ejercicio17 {
    /*Pide al usuario dos números enteros y muestra todos los números primos
    que se encuentran en ese rango.*/

    public void run() {
        String input1 = JOptionPane.showInputDialog("Ingrese el primer número entero:");
        int numero1 = Integer.parseInt(input1);

        String input2 = JOptionPane.showInputDialog("Ingrese el segundo número entero:");
        int numero2 = Integer.parseInt(input2);

        if (numero1 <= numero2) {
            System.out.println("Números primos en el rango de " + numero1 + " a " + numero2 + ":");
            for (int i = numero1; i <= numero2; i++) {
                if (esPrimo(i)) {
                    System.out.print(i + " ");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "El primer número debe ser menor o igual al segundo número.");
        }
    }

    // Función para verificar si un número es primo
    public boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
