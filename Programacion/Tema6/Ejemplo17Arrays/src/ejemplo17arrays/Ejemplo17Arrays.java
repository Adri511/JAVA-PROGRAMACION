/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo17arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class Ejemplo17Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
      
        double array1[] = new double[30];
        for (int i=0;i<array1.length;i++){
            array1[i]=1+Math.random()*10;
            System.out.println(array1[i]);
        }
            Arrays.sort(array1);
            System.out.println(Arrays.toString(array1));
    }
    
    
}
