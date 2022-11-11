/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo15bucles;
import java.util.Scanner;
/**
 *
 * @author adrvic
 */
public class Ejemplo15Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada = new Scanner(System.in);
       
        int n, multiplos=0 ;
        
        System.out.println("Introduce un numero");
        n = entrada.nextInt();
        
        for(int i = 3; i<= n; i = i+3){
            multiplos++;
        }
        System.out.println(multiplos);
                
        }                   
}
