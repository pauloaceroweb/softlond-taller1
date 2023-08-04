import com.softlond.Taller1.*;

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
                case 0 -> JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa. ¡Hasta luego!");

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
                    JOptionPane.showMessageDialog(null, "Ejercicio 10 \n" + "Serie de Fibonacci de 20 elementos");
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
                case 14 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 14 \n" + "Número Perfecto");
                    Ejercicio14 ejercicio14 = new Ejercicio14();
                    ejercicio14.run();
                }
                case 15 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 15 \n" + "Número Capicúa");
                    Ejercicio15 ejercicio15 = new Ejercicio15();
                    ejercicio15.run();
                }
                case 16 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 16 \n" + "Fibonacci de número dado");
                    Ejercicio16 ejercicio16 = new Ejercicio16();
                    ejercicio16.run();
                }
                case 17 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 17 \n" + "Números primos de un rango");
                    Ejercicio17 ejercicio17 = new Ejercicio17();
                    ejercicio17.run();
                }
                case 18 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 18 \n" + "Generar Contraseña");
                    Ejercicio18 ejercicio18 = new Ejercicio18();
                    ejercicio18.run();
                }
                case 19 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 19 \n" + "Nombre en Mayúsculas y Minúsculas");
                    Ejercicio19 ejercicio19 = new Ejercicio19();
                    ejercicio19.run();
                }
                case 20 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 20 \n" + "Cadena Invertida");
                    Ejercicio20 ejercicio20 = new Ejercicio20();
                    ejercicio20.run();
                }
                case 21 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 21 \n" + "Cuenta caracteres en una cadena");
                    Ejercicio21 ejercicio21 = new Ejercicio21();
                    ejercicio21.run();
                }
                case 22 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 22 \n" + "Palíndromo");
                    Ejercicio22 ejercicio22 = new Ejercicio22();
                    ejercicio22.run();
                }
                case 23 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 23 \n" + "Palabras de una oración");
                    Ejercicio23 ejercicio23 = new Ejercicio23();
                    ejercicio23.run();
                }
                case 24 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 24 \n" + "Reemplazar letra en Oración");
                    Ejercicio24 ejercicio24 = new Ejercicio24();
                    ejercicio24.run();
                }
                case 25 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 25 \n" + "Palabras separadas");
                    Ejercicio25 ejercicio25 = new Ejercicio25();
                    ejercicio25.run();
                }
                case 26 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 26 \n" + "Contar caracteres de una cadena");
                    Ejercicio26 ejercicio26 = new Ejercicio26();
                    ejercicio26.run();
                }
                case 27 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 27 \n" + "Palabras ordenadas alfabéticamente de una frase");
                    Ejercicio27 ejercicio27 = new Ejercicio27();
                    ejercicio27.run();
                }

                case 28 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 28 \n" + "Suma de arreglo de enteros");
                    Ejercicio28 ejercicio28 = new Ejercicio28();
                    ejercicio28.run();
                }
                case 29 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 29 \n" + "Número más grande de un arreglo");
                    Ejercicio29 ejercicio29 = new Ejercicio29();
                    ejercicio29.run();
                }
                case 30 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 30 \n" + "Eliminar elementos duplicados de un arreglo");
                    Ejercicio30 ejercicio30 = new Ejercicio30();
                    ejercicio30.run();
                }

                case 31 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 31 \n" + "Ordenar elementos por el algoritmo de selección");
                    Ejercicio31 ejercicio31 = new Ejercicio31();
                    ejercicio31.run();
                }

                case 32 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 32 \n" + "Buscar elemento en un arreglo");
                    Ejercicio32 ejercicio32 = new Ejercicio32();
                    ejercicio32.run();
                }

                case 33 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 33 \n" + "Frecuencia de elementos en un arreglo");
                    Ejercicio33 ejercicio33 = new Ejercicio33();
                    ejercicio33.run();
                }

                case 34 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 34 \n" + "Rotación de elementos en un arreglo");
                    Ejercicio34 ejercicio34 = new Ejercicio34();
                    ejercicio34.run();
                }

                case 35 -> {
                    JOptionPane.showMessageDialog(null, "Ejercicio 35 \n" + "Tablas de Multiplicar");
                    Ejercicio35 ejercicio35 = new Ejercicio35();
                    ejercicio35.run();
                }
                default ->
                    JOptionPane.showMessageDialog(null, "Ingrese un número válido!!!" );
            }
        } while (opcion != 0);
    }
}