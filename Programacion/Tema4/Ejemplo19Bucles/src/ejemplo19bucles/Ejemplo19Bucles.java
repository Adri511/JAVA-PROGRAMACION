/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo19bucles;
import java.util.Scanner;
/**
 *
 * @author adrvic
 */
public class Ejemplo19Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int num1;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Introduce un numero");
    num1=entrada.nextInt();
    
    if (num1<=0){
            System.out.println("*");}
        else{
            
            for (int i=0;num1>i;i++){
        
                System.out.print("*");
            }
        }
       
    }
}
