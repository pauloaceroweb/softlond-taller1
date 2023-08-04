package com.softlond.Taller1;

import javax.swing.*;

public class Ejercicio26 {

    /*Escribe un programa que pida al usuario una cadena y muestre cuántos
    caracteres tiene sin contar los espacios en blanco*/

    public void run() {
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena:");

        int caracteresSinEspacios = contarCaracteresSinEspacios(cadena);

        JOptionPane.showMessageDialog(null, "La cadena: " + "( " +cadena + " )\n" +
                "Tiene: " + caracteresSinEspacios + " caracteres sin contar los espacios en blanco.");
    }

    public int contarCaracteresSinEspacios(String cadena) {
        String cadenaSinEspacios = cadena.replaceAll("\\s+", "");

        return cadenaSinEspacios.length();
    }
}
