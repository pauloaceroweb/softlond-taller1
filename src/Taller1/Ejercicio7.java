package Taller1;

import javax.swing.*;

public class Ejercicio7 {
    /*Crea un programa que pida al usuario un número entero positivo y muestre su tabla de multiplicar hasta el 10.
     */

    private int numTabla;

    public void setNumTabla() {
        this.numTabla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la tabla"));
    }

    public void tablaMulti() {
        setNumTabla();
        if (numTabla > 0) {
            String aux = "";
            for (int i = 1; i <= 10; i++){
                aux+=i + " X " + numTabla + " = " + numTabla * i + "\n";
            }
            JOptionPane.showMessageDialog(null, "La tabla de Multiplicar del " + numTabla + " es: \n" + aux);
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un número entero positivo");
        }
    }

}
