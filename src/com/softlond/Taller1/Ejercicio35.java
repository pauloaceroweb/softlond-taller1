package com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio35 {

    /*Tabla de multiplicar: Crea un programa que imprima las tablas de multiplicar
    del 1 al 10. Usa para esto una matriz */

    public void run() {
        int[][] tablas = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablas[i][j] = (i + 1) * (j + 1);
            }
        }

        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            mensaje.append("Tabla de multiplicar del ").append(i + 1).append(":\n");
            for (int j = 0; j < 10; j++) {
                mensaje.append(i + 1).append(" x ").append(j + 1).append(" = ").append(tablas[i][j]).append("\n");
            }
            mensaje.append("\n");

            if ((i + 1) % 2 == 0) {
                JOptionPane.showMessageDialog(null, mensaje.toString(), "Tablas de Multiplicar del "
                        + (i - 1) + " al " + (i + 1), JOptionPane.INFORMATION_MESSAGE);
                mensaje = new StringBuilder(); // Reiniciar el mensaje para las siguientes filas
            }
        }
    }
}
