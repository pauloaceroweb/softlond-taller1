package Taller1;

import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio8 {
    /*
    Realiza un programa que simule un juego de adivinar un número.
    El programa debe generar un número aleatorio entre 1 y 100, y el usuario debe adivinarlo.
    El programa debe indicar si el número ingresado es mayor o menor que el número a adivinar.
    */

    int numeroAdivinar = ThreadLocalRandom.current().nextInt(1,101);

    private int numUsuario;

    public void setNumUsuario() {
        this.numUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a adivinar"));
    }

    public void adivinarNumero() {
        do {
            setNumUsuario();
            if (numUsuario > 0) {
                if (numeroAdivinar > numUsuario) {
                    JOptionPane.showMessageDialog(null,
                            "El número " + numUsuario
                                    + "\nEs MENOR que el número a adivinar\n"
                                    + "Aumenta!!!"
                    );
                } else if (numeroAdivinar < numUsuario){
                    JOptionPane.showMessageDialog(null,
                            "El número " + numUsuario
                                    + "\nEs MAYOR que el número a adivinar\n"
                                    + "Disminuye!!!"
                    );
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingresa un número entero positivo");
            }

        }while (numeroAdivinar != numUsuario);
        JOptionPane.showMessageDialog(null, "Felicitaciones!!! \n"
                + "Has acertado el número es: \n"
                + numeroAdivinar
        );
    }
}
