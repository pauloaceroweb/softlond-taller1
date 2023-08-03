package Taller1;

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

    private int a;
    private int b;
    private int c;

    public void setLados() {
        this.a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del lado A: "));
        this.b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del lado B: "));
        this.c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del lado C: "));
    }

    public void areaHeron() {
        setLados();
        double s = (double) (a + b + c) /2; // s es el Semiperímetro
        double area = Math.sqrt(s * ((s-a)*(s-b)*(s-c)));
        DecimalFormat df = new DecimalFormat("#.##");
        String roundedArea = df.format(area);
        JOptionPane.showMessageDialog(null, "El área del triángulo de lados ("+a+", "+b+", "+c+") es: " + roundedArea);
    }
}
