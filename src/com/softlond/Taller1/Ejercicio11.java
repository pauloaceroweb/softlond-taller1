package com.softlond.Taller1;

import javax.swing.*;
import java.text.DecimalFormat;

public class Ejercicio11 {

    /*Escribe un programa que calcule el área de un triángulo utilizando la fórmula
    de Herón. El usuario debe ingresar las longitudes de los tres lados.*/
    /*Lados a, b y c.
      fórmula Herón
      Semiperímetro fórmula: s = ((a+b+c)/2);
      El Area: area = raiz(s * ((s-a)*(s-b)*(s-c)))
    */

    public void areaHeron() {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del lado A: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del lado B: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud del lado C: "));

        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            double area = calcularAreaHeron(a, b, c);
            DecimalFormat df = new DecimalFormat("#.##");
            String roundedArea = df.format(area);
            JOptionPane.showMessageDialog(null, "El área del triángulo de lados ("+a+", "+b+", "+c+") es: " + roundedArea);
        } else {
            JOptionPane.showMessageDialog(null, "Lados del triángulo inválidos. " +
                    "\nLa suma de dos lados cualquiera debe ser mayor que la longitud del tercer lado.");
        }
    }

    public double calcularAreaHeron(double a, double b, double c) {
        double s = (a + b + c) /2; // s es el Semiperímetro
        return Math.sqrt(s * ((s-a)*(s-b)*(s-c)));
    }
}
