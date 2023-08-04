package com.softlond.Taller1;

import javax.swing.*;
import java.util.Arrays;

public class Ejercicio32 {

    /*Buscar un elemento: Escribe un programa que busque un número específico
    en un arreglo y muestre su índice (o un mensaje si no se encuentra).*/

    public void run() {
        int[] arreglo = leerArreglo();
        int numeroBuscado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número que desea buscar:"));

        int indice = buscarElemento(arreglo, numeroBuscado);

        if (indice != -1) {
            JOptionPane.showMessageDialog(null, "Arreglo = "+ Arrays.toString(arreglo) + "\n"
                    + "El número " + numeroBuscado + " se encuentra en el índice " + indice + ".");
        } else {
            JOptionPane.showMessageDialog(null, "Arreglo = "+ Arrays.toString(arreglo) + "\n"
                    + "El número " + numeroBuscado + " no se encuentra en el arreglo.");
        }
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

    public int buscarElemento(int[] arreglo, int numeroBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == numeroBuscado) {
                return i;
            }
        }
        return -1;
    }
}
