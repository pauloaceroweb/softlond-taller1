package Taller1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio30 {

    /*Eliminar duplicados: Diseña un programa que elimine los elementos
    duplicados de un arreglo.*/

    public void run() {
        int[] arreglo = leerArreglo();
        int[] arregloSinDuplicados = eliminarDuplicados(arreglo);

        JOptionPane.showMessageDialog(null, "Arreglo sin duplicados: " + Arrays.toString(arregloSinDuplicados));
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

    // Función para eliminar elementos duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        List<Integer> listaSinDuplicados = new ArrayList<>();
        for (int elemento : arreglo) {
            if (!listaSinDuplicados.contains(elemento)) {
                listaSinDuplicados.add(elemento);
            }
        }

        int[] arregloSinDuplicados = new int[listaSinDuplicados.size()];
        for (int i = 0; i < listaSinDuplicados.size(); i++) {
            arregloSinDuplicados[i] = listaSinDuplicados.get(i);
        }

        return arregloSinDuplicados;
    }

}
