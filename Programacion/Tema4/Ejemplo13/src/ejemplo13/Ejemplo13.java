/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo13;
import java.util.Scanner;
/**
 *
 * @author adrvic
 */
public class Ejemplo13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double num1,num2;
    Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un numero");
        num1=entrada.nextDouble();
        System.out.println("Escribe otro numero");
        num2=entrada.nextDouble();
    
    if (num1>num2){
        System.out.println("El orden ascendente es igual a "+num1+","+num2);
    }
    else{
        System.out.println("El orden ascendente es igual a "+num2+","+num1);
    }
    
    }
    
}
