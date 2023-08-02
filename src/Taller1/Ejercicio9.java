package Taller1;

import javax.swing.*;

public class Ejercicio9 {
    /*Escribe un programa que solicite al usuario un número entero positivo y calcule su factorial.*/

    private int numero;

    public void setNumero() {
        this.numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número para calcular su factorial"));
    }

    public void factorial() {
        setNumero();
        if (numero > 0){
            int fact = 1;

            for (int i = 1; i <= numero; i++){
                fact *= i;
            }
            JOptionPane.showMessageDialog(null, "El factorial de: " + numero + " es igual a: " + fact);
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un número entero positivo");
        }
    }

}
