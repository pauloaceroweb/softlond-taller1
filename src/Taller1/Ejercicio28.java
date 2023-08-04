package Taller1;

import javax.swing.*;

public class Ejercicio28 {

    /*Suma de elementos: Escribe un programa que calcule la suma de todos los
    elementos en un arreglo de enteros. */

    public void run() {
        int[] arreglo = leerArreglo();
        int suma = calcularSuma(arreglo);

        JOptionPane.showMessageDialog(null, "La suma de los elementos del arreglo es: " + suma);
    }

    // Función para leer un arreglo de enteros desde la entrada del usuario
    public int[] leerArreglo() {
        String input = JOptionPane.showInputDialog("Ingrese los elementos del arreglo separados por espacios:");
        String[] elementos = input.split("\\s+");
        int[] arreglo = new int[elementos.length];

        for (int i = 0; i < elementos.length; i++) {
            arreglo[i] = Integer.parseInt(elementos[i]);
        }

        return arreglo;
    }

    // Función para calcular la suma de los elementos de un arreglo
    public int calcularSuma(int[] arreglo) {
        int suma = 0;
        for (int elemento : arreglo) {
            suma += elemento;
        }
        return suma;

    }
}