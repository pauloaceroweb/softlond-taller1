package Taller1;

import javax.swing.*;

public class Ejercicio5 {

    /*Realiza un programa que solicite al usuario dos números enteros y determine cuál es el mayor de ellos.*/

    private int num1;
    private int num2;

    public void setNumeros() {
        this.num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
        this.num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));
    }

    public void numeroMayor() {
        setNumeros();
        if(num1 > num2) {
            JOptionPane.showMessageDialog(null, "El número mayor es el: " + num1);
        }else {
            JOptionPane.showMessageDialog(null, "El número mayor es el: " + num2);
        }
    }
}
