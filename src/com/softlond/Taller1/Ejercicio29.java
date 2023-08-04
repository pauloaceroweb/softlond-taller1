package com.softlond.Taller1;

import javax.swing.*;
import java.util.Arrays;

public class Ejercicio29 {

    /*Encontrar el número más grande: Crea un programa que encuentre el número
    más grande en un arreglo de enteros.*/

    public void run() {
        int[] arreglo = leerArreglo();
        Arrays.sort(arreglo);
        int masGrande = encontrarNumeroMasGrande(arreglo);

        JOptionPane.showMessageDialog(null, "Arreglo = "+ Arrays.toString(arreglo) + "\n"
                +"El número más grande en el arreglo es: " + masGrande);
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

    public int encontrarNumeroMasGrande(int[] arreglo) {
        int masGrande = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > masGrande) {
                masGrande = arreglo[i];
            }
        }
        return masGrande;
    }

}
