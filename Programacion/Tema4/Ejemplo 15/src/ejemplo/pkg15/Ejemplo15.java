/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo.pkg15;

import java.util.Scanner;

public class Ejemplo15 {

    
    public static void main(String[] args) {
       float num1, num2, num3;
       
       Scanner entrada = new Scanner(System.in);
       System.out.println("Introduce el primer numero");
        num1=entrada.nextFloat();
       System.out.println("Introduce el segundo numero");
        num2=entrada.nextFloat();
       System.out.println("Introduce el tercer numero");
        num3=entrada.nextFloat();
        
       if (num1>=num2 && num1>=num3)
            System.out.println("El numero " + num1 + "es el mayor");
       else if (num2>=num1 && num2>=num3)
              System.out.println("El numero " + num2 + "es el mayor");
            else
            System.out.println("El numero " + num3 + "es el mayor");  
    }
    
}
