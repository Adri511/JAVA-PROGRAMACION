/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2;
import java.util.Scanner;
/**
 *
 * @author adrvic
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num1;
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce un numero negativo o positivo");
        num1=entrada.nextFloat();
        
        if (num1>=0){
            System.out.println("Tu numero es positivo");
    }
        else{
            System.out.println("Tu numero es negativo");
    }
       
        
    }
    
}
