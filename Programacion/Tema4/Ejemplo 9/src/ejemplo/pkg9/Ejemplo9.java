/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo.pkg9;
import java.util.Scanner;
/**
 *
 * @author adrvic
 */
public class Ejemplo9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int edad;
    
    Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        edad=entrada.nextInt();
    if (edad>=18)
            System.out.println("Eres mayor de edad");
    else
            System.out.println("Eres menor de edad");
          
    }
    
}
