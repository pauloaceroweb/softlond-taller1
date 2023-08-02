package Taller1;

import javax.swing.*;

public class Ejercicio3 {

    /*Crea un programa que calcule y muestre el área y el perímetro de un círculo.
    El usuario debe proporcionar el radio del círculo.*/

    private double radio;

    public void setNumero() {
        this.radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del círculo"));
    }

    public void areaPerimetro() {
        setNumero();
        if (radio > 0 ) {
            double pi = 3.1416;
            double area = 2 * radio * pi;
            double perimetro = pi * Math.pow(radio, 2);
            JOptionPane.showMessageDialog(null,
                    "El área del Círculo es: " + area + "\n"
                            + "El perímetro del Círculo es: " + perimetro
            );
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un valor entero positivo");
        }
    }
}
