/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int [] array1 = new int [10];
        Scanner entrada= new Scanner(System.in);
        
        for (int i = 0; i < array1.length; i++) {
               System.out.println("Introduce 10 valores "+(i+1)+ " de 10");
               array1[i]=entrada.nextInt();
               
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
    }
    
}
