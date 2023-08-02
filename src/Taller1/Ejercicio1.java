package Taller1;

import javax.swing.*;

public class Ejercicio1 {

    /* Realiza un programa que solicite al usuario dos números enteros y muestre su suma, resta, multiplicación y división */

    private String num1;
    private String num2;
    private String opc1;
    private String opc2 = "1";

    public void setNumeros() {
        this.num1 = JOptionPane.showInputDialog("Ingrese el primer número");
        this.num2 = JOptionPane.showInputDialog("Ingrese el segundo número");
    }

    public void operaciones() {
        while (Integer.parseInt(opc2) == 1) {
            opc1 = JOptionPane.showInputDialog(
                    """
                            Menu Operaciones
                            1. Suma
                            2. Resta
                            3. Multiplicación
                            4. División
                            Elija una Opción"""
            );
            setNumeros();
            menu();
            opc2 = JOptionPane.showInputDialog(null,
                    """
                            Desea Continuar:\s
                            1. Si
                            2. No"""
            );
        }
    }

    public void menu() {
        switch (Integer.parseInt(opc1)) {
            case 1:
                suma();
                break;
            case 2:
                resta();
                break;
            case 3:
                multiplicacion();
                break;
            case 4:
                division();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Por favor ingrese una opción correcta.");
                break;
        }
    }

    public void suma() {
        int res = Integer.parseInt(num1) + Integer.parseInt(num2);
        JOptionPane.showMessageDialog(null, "La suma es: " + res);
    }

    public void resta() {
        if(Integer.parseInt(num1) > Integer.parseInt(num2)) {
            int res = Integer.parseInt(num1) - Integer.parseInt(num2);
            JOptionPane.showMessageDialog(null, "La resta es: " + res);
        } else {
            int res = Integer.parseInt(num2) - Integer.parseInt(num1);
            JOptionPane.showMessageDialog(null,
                    "En este caso al número mayor se le resta el menor\n"
                            + "La resta es: " + res);
        }
    }

    public void multiplicacion() {
        int res = Integer.parseInt(num1) * Integer.parseInt(num2);
        JOptionPane.showMessageDialog(null, "La multiplicación es: " + res);
    }

    public void division() {
        if(Integer.parseInt(num2) != 0) {
            int res = Integer.parseInt(num1) / Integer.parseInt(num2);
            JOptionPane.showMessageDialog(null, "La división es: " + res);
        } else {
            JOptionPane.showMessageDialog(null, "No es posible dividir por cero");
        }
    }
}

