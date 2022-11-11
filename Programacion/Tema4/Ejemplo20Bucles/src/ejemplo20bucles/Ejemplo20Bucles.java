/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo20bucles;
import java.util.Scanner;
/**
 *
 * @author adrvic
 */
public class Ejemplo20Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int n20,cont20=1,i=1;
        
       
        
            
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce un numero");
            
            n20=entrada.nextInt();
            
        if (n20<=20 || n20>=0) {
            
            for (i = 1; n20>=i; i++){
                for (cont20=1;cont20<=i;cont20++){
                    System.out.print(i);
                }
            }
            System.out.println();
            
                
                    
                    
            
            
                
         
        }
         else {
            System.err.println("Numero superior a 20 o menor que 0");
        }
        
        
        
        
            
        
    }
}
