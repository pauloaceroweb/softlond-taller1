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
                case 1:
                    JOptionPane.showMessageDialog(null,"Ejercicio 1 \n" + "Calculadora");
                    Ejercicio1 cal = new Ejercicio1();
                    cal.operaciones();
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null,"Ejercicio 2 \n" + "Par o Impar");
                    Ejercicio2 parImpar = new Ejercicio2();
                    parImpar.parImpar();
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null,"Ejercicio 3 \n" + "Área y Perímetro del Círculo");
                    Ejercicio3 areaPerimetro = new Ejercicio3();
                    areaPerimetro.areaPerimetro();
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null,"Ejercicio 4 \n" + "Menor o Mayor de edad");
                    Ejercicio4 edad = new Ejercicio4();
                    edad.edad();
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null,"Ejercicio 5 \n" + "Número Mayor");
                    Ejercicio5 numMayor = new Ejercicio5();
                    numMayor.numeroMayor();
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null,"Ejercicio 6 \n" + "Positivo, Negativo o Cero");
                    Ejercicio6 claseNum = new Ejercicio6();
                    claseNum.claseNumero();
                    break;

                case 7:
                    JOptionPane.showMessageDialog(null,"Ejercicio 7 \n" + "Tabla de Multiplicar");
                    Ejercicio7 ejercicio7 = new Ejercicio7();
                    ejercicio7.tablaMulti();
                    break;

                case 8:
                    JOptionPane.showMessageDialog(null,"Ejercicio 8 \n" + "Juego adivinar número");
                    Ejercicio8 ejercicio8 = new Ejercicio8();
                    ejercicio8.adivinarNumero();
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null,"Ejercicio 9 \n" + "Factorial de un número dado");
                    Ejercicio9 ejercicio9 = new Ejercicio9();
                    ejercicio9.factorial();
                    break;
            }

        } while (opcion != 0);
    }
}