package Taller1;

import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio33 {

    /*Frecuencia de elementos: Escribe un programa que cuente la frecuencia de
    cada elemento en un arreglo*/

    public void run() {
        int[] arreglo = leerArreglo();
        Map<Integer, Integer> frecuencia = contarFrecuencia(arreglo);

        JOptionPane.showMessageDialog(null, "Frecuencia de cada elemento:");
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            int elemento = entry.getKey();
            int frecuenciaElemento = entry.getValue();
            JOptionPane.showMessageDialog(null, "Elemento " + elemento + ": " + frecuenciaElemento + " veces.");
        }
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

    // Función para contar la frecuencia de cada elemento en el arreglo
    public Map<Integer, Integer> contarFrecuencia(int[] arreglo) {
        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int elemento : arreglo) {
            frecuencia.put(elemento, frecuencia.getOrDefault(elemento, 0) + 1);
        }
        return frecuencia;
    }
}
