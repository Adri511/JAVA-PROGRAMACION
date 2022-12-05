/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices4;

import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class Matrices4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matriz1= new int [4][5];
        int nota=0;
        Scanner entrada = new Scanner(System.in);
    
        for (int i = 0; i < matriz1.length; i++) {
            
            System.out.println("\n Estudiante "+(i+1));
            
           
            for (int j = 0; j < matriz1[0].length; j++) {
                
                System.out.println("Introduce la nota del estudiante "+(i+1));
                nota=entrada.nextInt();
                
                matriz1[i][j]=nota;
                System.out.println("");
                System.out.printf(matriz1[i][j]+"");
                 
            }
            
            System.out.println("");
            
        }
    }
}

