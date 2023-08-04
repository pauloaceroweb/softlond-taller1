package com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio6 {

    /*Escribe un programa que pida al usuario un número y verifique si es positivo, negativo o cero.*/

    public void claseNumero() {
        String input = JOptionPane.showInputDialog("Ingrese un número");
        int numero = Integer.parseInt(input);

        if (numero == 0) {
            JOptionPane.showMessageDialog(null, "El número es el Cero " + numero);
        } else if (numero > 0){
            JOptionPane.showMessageDialog(null, "El número " + numero + " es positivo");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + numero + " es negativo");
        }
    }
}
