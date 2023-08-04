package Taller1;

import javax.swing.*;

public class Ejercicio35 {

    /*Tabla de multiplicar: Crea un programa que imprima las tablas de multiplicar
    del 1 al 10. Usa para esto una matriz */

    public void run() {
        int[][] tablaMultiplicar = new int[10][10];

        // Llenar la matriz con las tablas de multiplicar
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablaMultiplicar[i][j] = (i + 1) * (j + 1);
            }
        }

        // Mostrar las tablas de multiplicar utilizando JOptionPane
        for (int i = 0; i < 10; i++) {
            StringBuilder tabla = new StringBuilder();
            tabla.append("Tabla de multiplicar del ").append(i + 1).append(":\n");
            for (int j = 0; j < 10; j++) {
                tabla.append(i + 1).append(" x ").append(j + 1).append(" = ").append(tablaMultiplicar[i][j]).append("\n");
            }
            JOptionPane.showMessageDialog(null, tabla.toString());
        }
    }
}
