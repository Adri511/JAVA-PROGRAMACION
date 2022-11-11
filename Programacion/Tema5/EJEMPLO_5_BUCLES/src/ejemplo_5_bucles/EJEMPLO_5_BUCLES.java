/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_5_bucles;
import java.util.Scanner;
/**
 *
 * @author adrvic
 */
public class EJEMPLO_5_BUCLES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1;
        int fact=1;
        
        System.out.println("Introduce un numero: ");
        
        
        Scanner entrada = new Scanner(System.in);
        num1=entrada.nextInt();
        
        while (num1>1){
             fact = fact*num1;
                num1 = num1-1;
        }
        
        System.out.println("El factorial es " +fact);
    }
}
