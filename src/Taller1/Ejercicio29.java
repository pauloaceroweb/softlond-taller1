package Taller1;

import javax.swing.*;

public class Ejercicio29 {

    /*Encontrar el número más grande: Crea un programa que encuentre el número
    más grande en un arreglo de enteros.*/

    public void run() {
        int[] arreglo = leerArreglo();
        int masGrande = encontrarNumeroMasGrande(arreglo);

        JOptionPane.showMessageDialog(null, "El número más grande en el arreglo es: " + masGrande);
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

    // Función para encontrar el número más grande en un arreglo
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
