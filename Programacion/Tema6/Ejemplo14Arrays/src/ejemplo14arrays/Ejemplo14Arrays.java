/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo14arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class Ejemplo14Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int n,m;
        
        System.out.println("Introduce N");
        n=entrada.nextInt();
        
        
        
        System.out.println("Introduce M");
        m=entrada.nextInt();
        
        int array[]=new int[n];
        
        Arrays.fill(array, m);
        System.out.println(Arrays.toString(array));
        
    }
    
}
