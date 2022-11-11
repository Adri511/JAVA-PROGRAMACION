/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo12bucles;
import java.util.Scanner;
/**
 *
 * @author adrvic
 */
public class Ejemplo12Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner entrada = new Scanner(System.in);
    
    double num1, num2,numerodeveces;
    
    double expo=1; 
    
    double cont=1;

    
        System.out.println("Dame el numero de la base de la potencia");
        num1=entrada.nextDouble();
        System.out.println("Numero elevador de la potencia");
        num2=entrada.nextDouble();
        
        if (num2<0) {
            numerodeveces = -num2;
            
        } else {
            numerodeveces = num2;
            }
            while(cont<=numerodeveces){ 
                expo = expo *num1;
                cont = cont + 1;
                if (num2<0){
                    expo=1/expo;
                    
    }
                System.out.println(num1+" Elevado a " +num2+ " es = "+expo);
            
    
}
}
}
