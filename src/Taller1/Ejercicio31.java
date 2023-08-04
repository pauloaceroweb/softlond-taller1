package Taller1;

import javax.swing.*;

public class Ejercicio31 {

    /*Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo,
    el algoritmo de burbuja o el de selección) para ordenar un arreglo de enteros
    de manera ascendente.*/

    public void run() {
        int[] arreglo = leerArreglo();
        ordenarArregloSeleccion(arreglo);

        JOptionPane.showMessageDialog(null, "Arreglo ordenado: " + arrayToString(arreglo));
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

    // Función para ordenar un arreglo utilizando el algoritmo de selección
    public void ordenarArregloSeleccion(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambiar el elemento mínimo encontrado con el elemento en la posición i
            int temp = arreglo[i];
            arreglo[i] = arreglo[minIndex];
            arreglo[minIndex] = temp;
        }
    }

    // Función para convertir un arreglo de enteros a una cadena de texto
    public String arrayToString(int[] arreglo) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arreglo.length; i++) {
            sb.append(arreglo[i]);
            if (i < arreglo.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

}
