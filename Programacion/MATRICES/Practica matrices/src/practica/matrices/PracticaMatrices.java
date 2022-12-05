/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.matrices;

/**
 *
 * @author adrvic
 */
public class PracticaMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int notas[][] = {{5, 6, 4, 3, 5}, {2, 3, 4, 5, 7}, {5, 4, 3, 2, 3,}};

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Notes de l'almune " + i + ";");

            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + "");

            }

        }
    }

}
