/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysjava1;

import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class ArraysJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double guardar[]=new double[10];
        
        for(int i=0;i<guardar.length;i++){
        
        System.out.println("Introduce un valor");
        guardar[i] = entrada.nextInt();
            
        }
        for(int j=0;j<guardar.length;j++){
            
                System.out.println(guardar[j]);
        
        }
        
           
        
        
        
        
    }
    
}
