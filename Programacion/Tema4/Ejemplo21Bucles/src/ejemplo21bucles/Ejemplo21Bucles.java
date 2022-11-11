/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo21bucles;

import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class Ejemplo21Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1,num2,i;
        
        
         Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce un numero");
            num1=entrada.nextInt();
            
            System.out.println("Introduce el segundo numero tiene que ser mayor que el anterior");
            num2=entrada.nextInt();
            
            for(i=1;num1<num2;i++){
                System.out.println(i);
            }
            
            
    }
    
}
