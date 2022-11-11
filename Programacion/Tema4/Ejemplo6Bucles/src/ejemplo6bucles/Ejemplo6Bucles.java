/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo6bucles;
import java.util.Scanner;
/**
 *
 * @author adrvic
 */
public class Ejemplo6Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    float num1;
    boolean negativo;
    
    negativo=false;
    
    Scanner entrada = new Scanner(System.in);
                  
    for(int contador=1; contador<=10; contador++){
        System.out.println("Introduce un numero:");
        num1=entrada.nextFloat();
        if (num1<0)
            negativo=true;
            
        }
    if (negativo==true){
                System.out.println("hay un numero negativo");
        
            }   
        else 
            System.out.println("No hay numero negativo");
    }
        
}
