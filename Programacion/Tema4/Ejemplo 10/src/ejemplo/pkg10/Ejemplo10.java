/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo.pkg10;
import java.util.Scanner;
/**
 *
 * @author adrvic
 */
public class Ejemplo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    double num1,num2,suma,resta,multi,divi;
    
    Scanner entrada = new Scanner(System.in);
       System.out.println("Introduce el primer numero");
       num1=entrada.nextDouble();
       System.out.println("Introduce el segundo numero");
       num2=entrada.nextDouble();
        
       suma=num1+num2;
       resta=num1-num2;
       multi=num1*num2;
       divi=num1/num2;
       
       if (num2==0){
           
            System.out.println(" La suma es " +suma+  "\n La resta es "+ resta+" \n La multiplicacion es "+ multi+ " \n Error en la division");
            
       }else{
           
            System.out.println("La suma es "+ suma+" \n la resta es"+ resta+" \n La multiplicacion es"+ multi+" \n La division es"+ divi);
       }
    }
    
}
