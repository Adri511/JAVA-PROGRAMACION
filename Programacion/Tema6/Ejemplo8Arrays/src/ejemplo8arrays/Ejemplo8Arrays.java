/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo8arrays;

import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class Ejemplo8Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num1;
        int contadornum=0;
        System.out.println("Introduce un numero");
        num1=entrada.nextInt();
        
        System.out.println(".......");
        
        int[] A= new int[100];
        
        for (int pos = 0; pos < 100; pos++){
        
            A[pos] = (int)(Math.random()*9+1);
        
            System.out.println(A[pos]);
        
            if(A[pos]==num1){
                contadornum++;
                
                    
            }
    }
        System.out.println("Hay repetidos"+contadornum);
}
}
        
    
    

