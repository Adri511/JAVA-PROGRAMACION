/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplostrings1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class EjemploStrings1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Introduce una frase");
        String palabra[]=entrada.nextLine();
        
        String textoseparado [] = palabra.split("");
        for(i=0;i<palabra.length;i++){
        System.out.println(Arrays.toString(textoseparado));
        }
        
        
        
        
        
        
        
        
    }
    
}
