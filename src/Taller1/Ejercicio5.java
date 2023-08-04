package Taller1;

import javax.swing.*;

public class Ejercicio5 {

    /*Realiza un programa que solicite al usuario dos números enteros y determine cuál es el mayor de ellos.*/

    public void numeroMayor() {
        String input1 = JOptionPane.showInputDialog("Ingrese el primer número entero");
        int num1 = Integer.parseInt(input1);

        String input2 = JOptionPane.showInputDialog("Ingrese el segundo número entero");
        int num2 = Integer.parseInt(input2);

        if(num1 > num2) {
            JOptionPane.showMessageDialog(null, "El número mayor es el: " + num1);
        }else {
            JOptionPane.showMessageDialog(null, "El número mayor es el: " + num2);
        }
    }
}
