/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices.pkg3;

import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class Matrices3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int filas, columnas, num1 = 0;

        int mayores = 0, menores = 0, iguala0 = 0;

        System.out.println("Introduce el numero de filas");
        filas = entrada.nextInt();

        System.out.println("Introduce el numero de columnas");
        columnas = entrada.nextInt();

        int maximodenumeros = filas * columnas;
        int[][] matriz1 = new int[filas][columnas];

        for (int i = 0; i < maximodenumeros; i++) {
            System.out.println("Introduce " + maximodenumeros + " numeros " + (i + 1) + " de " + maximodenumeros);
            num1 = entrada.nextInt();
        }
        for (int i = 0; i < matriz1.length; i++) {

            System.out.printf("");

            for (int j = 0; j < matriz1[0].length; j++) {
                matriz1[i][j] = num1 + 0;

                System.out.printf(matriz1[i][j] + " ");

                if (num1 > 0) {
                    mayores++;
                }
                if (num1 < 0) {
                    menores++;
                }
                if (num1 == 0) {
                    iguala0++;
                }

            }
            System.out.println("");
        }

        System.out.println("Hay " + mayores + " mayores");
        System.out.println("Hay " + iguala0 + " igual a 0");
        System.out.println("Hay " + menores + " menores");
    }

}
