package Taller1;

import javax.swing.*;

public class Ejercicio17 {
    /*Pide al usuario dos números enteros y muestra todos los números primos
    que se encuentran en ese rango.*/

    public void run() {
        int numeroInicial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número inicial del rango:"));
        int numeroFinal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número final del rango:"));

        JOptionPane.showMessageDialog(null, "Números primos en el rango [" + numeroInicial + ", "
                + numeroFinal + "]:\n" + obtenerPrimosEnRango(numeroInicial, numeroFinal));
    }

    // Función para obtener los números primos en un rango dado
    public String obtenerPrimosEnRango(int numeroInicial, int numeroFinal) {
        StringBuilder primos = new StringBuilder();

        for (int numero = numeroInicial; numero <= numeroFinal; numero++) {
            if (esNumeroPrimo(numero)) {
                primos.append(numero).append(" ");
            }
        }

        return primos.toString();
    }

    // Función para verificar si un número es primo
    public boolean esNumeroPrimo(int numero) {
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
