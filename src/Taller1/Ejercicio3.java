package Taller1;

import javax.swing.*;

public class Ejercicio3 {

    /*Crea un programa que calcule y muestre el área y el perímetro de un círculo.
    El usuario debe proporcionar el radio del círculo.*/

    public void areaPerimetro() {
        String input = JOptionPane.showInputDialog("Ingrese el radio del círculo:");
        double radio = Double.parseDouble(input);

        if (radio <= 0) {
            JOptionPane.showMessageDialog(null, "El radio debe ser un valor positivo.");
        } else {
            double area = areaCirculo(radio);
            double perimetro = perimetroCirculo(radio);

            String mensaje = "Área del círculo: " + area + "\n";
            mensaje += "Perímetro del círculo: " + perimetro;

            JOptionPane.showMessageDialog(null, mensaje);
        }
    }

    public double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    public double perimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }
}
