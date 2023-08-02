import Taller1.Ejercicio1;
import Taller1.Ejercicio2;
import Taller1.Ejercicio3;

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
            }

        } while (opcion != 0);
    }
}