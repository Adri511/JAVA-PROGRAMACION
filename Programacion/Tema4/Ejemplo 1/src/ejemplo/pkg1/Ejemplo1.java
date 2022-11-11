/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo.pkg1;
import java.util.Scanner;
/**
 *
 * @author adrvic
 */
public class Ejemplo1 {


    public static void main(String[] args) {
        
        int num1, num2, division, multiplicacion, resta, suma;
        
    Scanner entrada = new Scanner (System.in);
       System.out.println("Introduce un numero");
        num1=entrada.nextInt();
               
       System.out.println("Introduce un otro numero");
        num2=entrada.nextInt();
       
       suma=num1+num2;
       resta=num1-num2;
       multiplicacion=num1*num2;
       division=num1/num2;
       
        System.out.println("la suma es " + suma);
        System.out.println("la resta es " + resta);
        System.out.println("la multiplicacion es " + multiplicacion);
        System.out.println("la division es " + division);
    }
    
}
