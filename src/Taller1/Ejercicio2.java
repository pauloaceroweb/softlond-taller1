package Taller1;

import javax.swing.*;

public class Ejercicio2 {

    /*Escribe un programa que pida al usuario un número entero y determine si es par o impar.*/

    private int numero;

    public void setNumero() {
        this.numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número entero"));
    }

    public void parImpar() {
        setNumero();
       if(numero > 0) {
           if (numero % 2 == 0) {
               JOptionPane.showMessageDialog(null, "El número " + numero + " es Par");
           } else {
               JOptionPane.showMessageDialog(null, "El número " + numero + " es Impar");
           }
       } else {
           JOptionPane.showMessageDialog(null, "Ingrese un número entero positivo");
       }
    }
}
