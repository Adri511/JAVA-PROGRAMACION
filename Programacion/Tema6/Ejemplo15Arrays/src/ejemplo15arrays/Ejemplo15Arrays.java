/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo15arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class Ejemplo15Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int num;
        
        int array1[] = new int[10];
       
        System.out.println("Introduce un numero: ");
        num=entrada.nextInt();
        
        
        
        for (int i=1;i<array1.length;i++){
            
            System.out.println("Introduce un numero: ");
            array1[i]=entrada.nextInt();
            
        }
        System.out.println("");
        
        int array2[] = new int[11];
        
        for (int i=1;i<array2.length;i++){
            System.out.println("Introduce un numero: ");
            array2[i]=entrada.nextInt();
            System.out.print(" ");
        }
        
        if(Arrays.equals(array1, array2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son diferentes");
        }
   
    }
    
}
