package Taller1;

import javax.swing.*;

public class Ejercicio18 {
    /*Crea un programa que genere una contraseña aleatoria de 8 caracteres que
    contenga letras mayúsculas, letras minúsculas y dígitos. Puedes utilizar la
    clase Math para generar números aleatorios y la clase String para manipular
    la contraseña.*/

    public void run() {
        String contraseña = generarContraseñaAleatoria();
        JOptionPane.showMessageDialog(null, "Contraseña generada: " + contraseña);
    }

    // Función para generar una contraseña aleatoria
    public String generarContraseñaAleatoria() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder contraseñaAleatoria = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int index = (int) (Math.random() * caracteres.length());
            contraseñaAleatoria.append(caracteres.charAt(index));
        }

        return contraseñaAleatoria.toString();
    }

}
