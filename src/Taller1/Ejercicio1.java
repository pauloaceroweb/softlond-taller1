package Taller1;

import javax.swing.*;

public class Ejercicio1 {

    /* Realiza un programa que solicite al usuario dos números enteros y muestre su suma, resta, multiplicación y división */

    public void calculadora() {
        String input1 = JOptionPane.showInputDialog("Ingrese el primer número entero:");
        int numero1 = Integer.parseInt(input1);

        String input2;
        int numero2;
        do {
            input2 = JOptionPane.showInputDialog("Ingrese el segundo número entero:");
            numero2 = Integer.parseInt(input2);
            if (numero2 == 0) {
                JOptionPane.showMessageDialog(null, "El segundo número no puede ser cero. Intente nuevamente.");
            }
        } while (numero2 == 0);

        int suma = sumar(numero1, numero2);
        int resta = restar(numero1, numero2);
        int multiplicacion = multiplicar(numero1, numero2);
        double division = dividir(numero1, numero2);

        String mensaje = "Resultado de las operaciones:\n";
        mensaje += "La suma es: " + numero1 + " + " + numero2 + " = " + suma + "\n";
        mensaje += "La resta es: " + numero1 + " - " + numero2 + " = " + resta + "\n";
        mensaje += "La multiplicación es: " + numero1 + " * " + numero2 + " = " + multiplicacion + "\n";
        mensaje += "La división es: " + numero1 + " / " + numero2 + " = " + division;

        JOptionPane.showMessageDialog(null, mensaje);
    }

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero.");
        }
        return (double) a / b;
    }
}

