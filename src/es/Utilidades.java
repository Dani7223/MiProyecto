package es;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Scanner;

/**
 * Clase no ejecutable con todos los métodos que hacen las operaciones que iran al main
 * @author Daniel Tajuelo <danieltajuelo@gmail.com>
 */
public class Utilidades {

    /**
     * Método que pide las filas y columnas de las matrices
     * @return fxc
     */
    public static int pedirValor() {
        Scanner teclado = new Scanner(System.in);
        int fxc;
        //Pedimos el valor de las filas y las columnas 
        do {
            System.out.print("Cuántas FILAS y COLUMNAS quieres para tus dos matrices? ");
            fxc = teclado.nextInt();
        } while (fxc <= 0);
        System.out.println("Nº de FILAS de la matriz: " +fxc);
        System.out.println("Nº de COLUMNAS de la matriz: " +fxc);
        return fxc;
    }

    /**
     * Método que nos suma las dos matrices y nos devuelve la matriz resultado
     * @param matriz1
     * @param matriz2
     * @param resultado
     * @return resultado
     */
    public static int[][] sumaMatrices(int matriz1[][], int matriz2[][], int resultado[][]) {
        int valor1,valor2;
        for (int i = 0; i < matriz1.length; i++) {
            // bucle que recorre las columnas
            for (int j = 0; j < matriz1[0].length; j++) {
                valor1=matriz1[i][j];
                valor2=matriz2[i][j];
                resultado[i][j] = valor1 + valor2;
            }
        }

        return resultado;
    }

    /**
     * Método que muestra la primera matriz
     * @param matriz1 
     */
    public static void mostrarMatriz1(int[][] matriz1) {
        // bucle que recorre las filas
        for (int i = 0; i < matriz1.length; i++) {
            System.out.print("[\t");
            // bucle que recorre las columnas
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println("]");
        }
    }
    
    /**
     * Método que muestra la segunda matriz
     * @param matriz2 
     */
    public static void mostrarMatriz2(int[][] matriz2) {
        // bucle que recorre las filas
        for (int i = 0; i < matriz2.length; i++) {
            System.out.print("[\t");
            // bucle que recorre las columnas
            for (int j = 0; j < matriz2[0].length; j++) {
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println("]");
        }
    }

    /**
     * Método que muestra el resultado de las dos matrices sumadas
     * @param resultado 
     */
    public static void mostrarResultado(int[][] resultado) {
        // bucle que recorre las filas
        for (int i = 0; i < resultado.length; i++) {
            System.out.print("[\t");
            // bucle que recorre las columnas
            for (int j = 0; j < resultado[0].length; j++) {
                System.out.print(resultado[i][j] + "\t");
            }
            System.out.println("]");
        }
    }

    /**
     * Método que nos rellena la primera matriz
     * @param matriz1 
     */
    public static void rellenarMatriz1(int[][] matriz1) {
        Scanner teclado = new Scanner(System.in);
        int valor;
        // bucle que recorre las filas 
        for (int i = 0; i < matriz1.length; i++) {
            // bucle que recorre las columnas
            for (int j = 0; j < matriz1[0].length; j++) {
                System.out.println("Dime el valor de la fila "+i+ " columna "+j+ " de la primera matriz");
                valor=teclado.nextInt();
                matriz1[i][j] = valor;
                
            }
        }
        System.out.println("Primera matriz rellenada");
    }

    /**
     * Método que nos rellena la segunda matriz
     * @param matriz2 
     */
    public static void rellenarMatriz2(int[][] matriz2) {
        Scanner teclado = new Scanner(System.in);
        int valor;
        // bucle que recorre las filas 
        for (int i = 0; i < matriz2.length; i++) {
            // bucle que recorre las columnas
            for (int j = 0; j < matriz2[0].length; j++) {
                 System.out.println("Dime el valor de la fila "+i+ " columna "+j+ " de la segunda matriz");
                valor=teclado.nextInt();
                matriz2[i][j] = valor;
            }
        }
        System.out.println("Segunda matriz rellenada");
    }
    
    
    /**
     *  Método para limpiar la consola
     */
    public static void LimpiarConsola() {
        try {
            Robot pressbot = new Robot();
            pressbot.keyPress(17); // Holds CTRL key.
            pressbot.keyPress(76); // Holds L key.
            pressbot.keyRelease(17); // Releases CTRL key.
            pressbot.keyRelease(76); // Releases L key.
        } catch (AWTException ex) {
            System.out.println(ex);
        }
    }

}
