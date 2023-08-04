package com.softlond.Taller1;

import javax.swing.*;
import java.util.Arrays;

public class Ejercicio34 {

    /*Rotación de elementos: Implementa un programa que rote los elementos de
    un arreglo hacia la izquierda o la derecha una cierta cantidad de posiciones.*/

    public void run() {
        int[] arreglo = leerArreglo();
        int cantidadRotaciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de posiciones para rotar:"));
        char direccion = JOptionPane.showInputDialog("Ingrese la dirección de rotación (L: izquierda, R: derecha):").toUpperCase().charAt(0);

        rotarArreglo(arreglo, cantidadRotaciones, direccion);

        JOptionPane.showMessageDialog(null, "Arreglo rotado: " + Arrays.toString(arreglo));
    }

    public int[] leerArreglo() {
        String input = JOptionPane.showInputDialog("Ingrese los elementos del arreglo separados por espacios:");
        String[] elementos = input.split("\\s+");
        int[] arreglo = new int[elementos.length];

        for (int i = 0; i < elementos.length; i++) {
            arreglo[i] = Integer.parseInt(elementos[i]);
        }

        return arreglo;
    }

    public void rotarArreglo(int[] arreglo, int cantidadRotaciones, char direccion) {
        int n = arreglo.length;
        cantidadRotaciones %= n; // Para evitar rotaciones innecesarias

        if (direccion == 'L') {
            rotarIzquierda(arreglo, cantidadRotaciones);
        } else if (direccion == 'R') {
            rotarDerecha(arreglo, cantidadRotaciones);
        } else {
            JOptionPane.showMessageDialog(null, "Dirección de rotación inválida. Use L para izquierda o R para derecha.");
        }
    }

    private void rotarIzquierda(int[] arreglo, int cantidadRotaciones) {
        int n = arreglo.length;
        reverse(arreglo, 0, cantidadRotaciones - 1);
        reverse(arreglo, cantidadRotaciones, n - 1);
        reverse(arreglo, 0, n - 1);
    }

    private void rotarDerecha(int[] arreglo, int cantidadRotaciones) {
        int n = arreglo.length;
        reverse(arreglo, 0, n - 1);
        reverse(arreglo, 0, cantidadRotaciones - 1);
        reverse(arreglo, cantidadRotaciones, n - 1);
    }

    // Función para invertir un subarreglo en el arreglo
    private void reverse(int[] arreglo, int inicio, int fin) {
        while (inicio < fin) {
            int temp = arreglo[inicio];
            arreglo[inicio] = arreglo[fin];
            arreglo[fin] = temp;
            inicio++;
            fin--;
        }
    }

}
