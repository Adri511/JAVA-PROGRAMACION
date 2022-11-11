/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo.pkg14;

import java.util.Scanner;

public class Ejemplo14 {

    
    public static void main(String[] args) {
        
    int num1, num2;
    
    Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        num1=entrada.nextInt();
        System.out.println("Introduce el segundo numero");
        num2=entrada.nextInt();
        
        if (num1==num2)
            System.out.println("Son iguales");
        
        else if (num1<num2)
            System.out.println("El numero " + num2 + " es mayor que "+ num1);
            System.out.println("El numero " + num1 + " es menor que "+ num2);
            
          
            
    }
    
}
