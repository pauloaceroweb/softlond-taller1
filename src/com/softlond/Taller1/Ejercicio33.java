package com.softlond.Taller1;

import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio33 {

    /*Frecuencia de elementos: Escribe un programa que cuente la frecuencia de
    cada elemento en un arreglo*/

    public void run() {
        int[] arreglo = leerArreglo();
        Map<Integer, Integer> frecuencia = contarFrecuencia(arreglo);

        StringBuilder resultado = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            int elemento = entry.getKey();
            int frecuenciaElemento = entry.getValue();
            resultado.append("Elemento: ").append(elemento).append(" aparece ").append(frecuenciaElemento).append(" veces, \n");
        }
        JOptionPane.showMessageDialog(null, "Arreglo = " + Arrays.toString(arreglo) + "\n"
                + "Frecuencia de elementos: \n" + resultado);
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

    public Map<Integer, Integer> contarFrecuencia(int[] arreglo) {
        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int elemento : arreglo) {
            frecuencia.put(elemento, frecuencia.getOrDefault(elemento, 0) + 1);
        }
        return frecuencia;
    }
}
