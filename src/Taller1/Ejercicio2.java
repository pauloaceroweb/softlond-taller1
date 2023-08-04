package Taller1;

import javax.swing.*;

public class Ejercicio2 {

    /*Escribe un programa que pida al usuario un número entero y determine si es par o impar.*/

    public void parImpar() {
        String input = JOptionPane.showInputDialog("Ingrese un número entero:");
        int numero = Integer.parseInt(input);

       if(esPar(numero)) {
               JOptionPane.showMessageDialog(null, "El número " + numero + " es Par");
       } else {
        JOptionPane.showMessageDialog(null, "El número " + numero + " es Impar");
       }
    }

    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
