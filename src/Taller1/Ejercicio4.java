package Taller1;

import javax.swing.*;

public class Ejercicio4 {

    /*Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad o menor de edad.
     */
    public void edad() {
        String input = JOptionPane.showInputDialog("Ingrese su edad:");
        int edad = Integer.parseInt(input);

        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Usted tiene " + edad + " años y es mayor de edad");
        } else {
            JOptionPane.showMessageDialog(null, "Usted tiene " + edad + " años y es menor de edad");
        }
    }
}

