package Taller1;

import javax.swing.*;

public class Ejercicio13 {

    /*Pide al usuario un número decimal y muestra su valor redondeado a un número específico de decimales*/
    public void decimales() {
        String input = JOptionPane.showInputDialog("Ingrese un número decimal:");
        double numero = Double.parseDouble(input);

        String decimalesStr = JOptionPane.showInputDialog("Ingrese el número de decimales a redondear:");
        int decimales = Integer.parseInt(decimalesStr);

        double numeroRedondeado = redondearDecimales(numero, decimales);

        String mensaje = "El número redondeado a " + decimales + " decimales es: " + numeroRedondeado;
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public double redondearDecimales(double numero, int numDecimales) {
        return Math.round(numero * Math.pow(10, numDecimales)) / Math.pow(10, numDecimales);
    }
}
