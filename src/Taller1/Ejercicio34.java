package Taller1;

import javax.swing.*;

public class Ejercicio34 {

    /*Rotación de elementos: Implementa un programa que rote los elementos de
    un arreglo hacia la izquierda o la derecha una cierta cantidad de posiciones.*/

    public void run() {
        int[] arreglo = leerArreglo();
        int cantidadRotaciones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de posiciones para rotar:"));
        char direccion = JOptionPane.showInputDialog("Ingrese la dirección de rotación (L: izquierda, R: derecha):").toUpperCase().charAt(0);

        rotarArreglo(arreglo, cantidadRotaciones, direccion);

        JOptionPane.showMessageDialog(null, "Arreglo rotado: " + arrayToString(arreglo));
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

    // Función para rotar un arreglo hacia la izquierda o derecha una cierta cantidad de posiciones
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

    // Función para rotar un arreglo hacia la izquierda
    private void rotarIzquierda(int[] arreglo, int cantidadRotaciones) {
        int n = arreglo.length;
        reverse(arreglo, 0, cantidadRotaciones - 1);
        reverse(arreglo, cantidadRotaciones, n - 1);
        reverse(arreglo, 0, n - 1);
    }

    // Función para rotar un arreglo hacia la derecha
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
