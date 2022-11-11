/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo16bucles;
import java.util.Scanner;
/**
 *
 * @author adrvic
 */
public class Ejemplo16Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int num1;
        boolean primo=false;
        
        System.out.println("Introduce un numero positivo");
        num1 = entrada.nextInt();
        
        while(primo)
            
            if (num1<0) {
                System.out.println("");
                System.out.println("Introduce un numero positivo");
                num1 = entrada.nextInt();
                
            }
            if (num1%num1==0) {
                System.out.println("Es primo");
            } else {
                System.out.println("No es primo");
        }
     
    }           
                
}
        
