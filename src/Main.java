import Taller1.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                Ingrese el número del ejercicio
                Disponibles del 1 al 35
                Ingrese cero para salir"""
            ));

            switch (opcion) {
                case 1 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 1 \n" + "Calculadora");
                    Ejercicio1 cal = new Ejercicio1();
                    cal.calculadora();
                }
                case 2 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 2 \n" + "Par o Impar");
                    Ejercicio2 parImpar = new Ejercicio2();
                    parImpar.parImpar();
                }
                case 3 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 3 \n" + "Área y Perímetro del Círculo");
                    Ejercicio3 areaPerimetro = new Ejercicio3();
                    areaPerimetro.areaPerimetro();
                }
                case 4 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 4 \n" + "Menor o Mayor de edad");
                    Ejercicio4 edad = new Ejercicio4();
                    edad.edad();
                }
                case 5 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 5 \n" + "Número Mayor");
                    Ejercicio5 numMayor = new Ejercicio5();
                    numMayor.numeroMayor();
                }
                case 6 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 6 \n" + "Positivo, Negativo o Cero");
                    Ejercicio6 claseNum = new Ejercicio6();
                    claseNum.claseNumero();
                }
                case 7 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 7 \n" + "Tabla de Multiplicar");
                    Ejercicio7 ejercicio7 = new Ejercicio7();
                    ejercicio7.tablaMultiplicar();
                }
                case 8 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 8 \n" + "Juego adivinar número");
                    Ejercicio8 ejercicio8 = new Ejercicio8();
                    ejercicio8.adivinarNumero();
                }
                case 9 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 9 \n" + "Factorial de un número dado");
                    Ejercicio9 ejercicio9 = new Ejercicio9();
                    ejercicio9.factorial();
                }
                case 10 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 10 \n" + "Serie de Fibonacci de un número dado");
                    Ejercicio10 ejercicio10 = new Ejercicio10();
                    ejercicio10.fibonacci();
                }
                case 11 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 11 \n" + "Área de un triángulo con la formula de Herón");
                    Ejercicio11 ejercicio11 = new Ejercicio11();
                    ejercicio11.areaHeron();
                }
                case 12 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 12 \n" + "Número Primo");
                    Ejercicio12 ejercicio12 = new Ejercicio12();
                    ejercicio12.primo();
                }
                case 13 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 13 \n" + "Redondear número en decimales dados");
                    Ejercicio13 ejercicio13 = new Ejercicio13();
                    ejercicio13.decimales();
                }

            }

        } while (opcion != 0);
    }
}