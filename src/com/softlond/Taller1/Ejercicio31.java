package com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio31 {

    /*Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo,
    el algoritmo de burbuja o el de selección) para ordenar un arreglo de enteros
    de manera ascendente.*/

    public void run() {
        int[] arreglo = leerArreglo();
        int[] arregloOrdenado = ordenarSeleccion(arreglo);

       StringBuilder resultadoOrdenado = new StringBuilder("Arreglo ordenado (selección): ");
        for (int i = 0; i < arregloOrdenado.length; i++) {
            resultadoOrdenado.append(arregloOrdenado[i]).append(" ");
        }

        JOptionPane.showMessageDialog(null, resultadoOrdenado);
    }

    public int[] leerArreglo() {
        String entrada = JOptionPane.showInputDialog("Ingrese los elementos separados por espacios:");
        String[] elementos = entrada.split("\\s+");
        int[] arreglo = new int[elementos.length];

        for (int i = 0; i < elementos.length; i++) {
            arreglo[i] = Integer.parseInt(elementos[i]);
        }

        return arreglo;
    }

    public int[] ordenarSeleccion(int[] arreglo) {
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int temp = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = temp;
        }

        return arreglo;
    }

}
