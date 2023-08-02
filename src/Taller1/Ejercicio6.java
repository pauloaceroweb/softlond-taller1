package Taller1;

import javax.swing.*;

public class Ejercicio6 {

    /*Escribe un programa que pida al usuario un número y verifique si es positivo, negativo o cero.*/

    private int numero;

    public void setNumero() {
        this.numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
    }

    public void claseNumero() {
        setNumero();
        if (numero == 0) {
            JOptionPane.showMessageDialog(null, "El número es el Cero" + numero);
        } else if (numero > 0){
            JOptionPane.showMessageDialog(null, "El número " + numero + " es positivo");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + numero + " es negativo");
        }
    }
}
