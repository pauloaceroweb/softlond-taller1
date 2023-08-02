package Taller1;

import javax.swing.*;

public class Ejercicio4 {

    /*Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad o menor de edad.
     */

    private int edad;

    public void setEdad() {
        this.edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
    }

    public void edad() {
        setEdad();
        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Usted tiene " + edad + " años y es mayor de edad");
        } else {
            JOptionPane.showMessageDialog(null, "Usted tiene " + edad + " años y es menor de edad");
        }
    }
}

