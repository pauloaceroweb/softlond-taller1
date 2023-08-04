package Taller1;

import javax.swing.*;

public class Ejercicio26 {

    /*Escribe un programa que pida al usuario una cadena y muestre cuántos
    caracteres tiene sin contar los espacios en blanco*/

    public void run() {
        String cadena = JOptionPane.showInputDialog("Ingrese una cadena:");

        int cantidadCaracteresSinEspacios = contarCaracteresSinEspacios(cadena);

        JOptionPane.showMessageDialog(null, "La cadena tiene " + cantidadCaracteresSinEspacios + " caracteres sin contar los espacios en blanco.");
    }

    // Función para contar la cantidad de caracteres sin contar los espacios en blanco
    public int contarCaracteresSinEspacios(String cadena) {
        // Eliminamos los espacios en blanco utilizando el método replaceAll()
        String cadenaSinEspacios = cadena.replaceAll("\\s+", "");

        // Obtenemos la longitud de la cadena sin espacios
        return cadenaSinEspacios.length();
    }
}
