/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo13bucles;
import java.util.Scanner;
/**
 *
 * @author adrvic
 */
public class Ejemplo13Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
    boolean seguir=true;
    int max=100, min=1, analitzat=0;
    int num;
    char respuesta;
    
    while(seguir){
        num=(max+min)/2;
        System.out.println("El numero que has pensat es <, > o = que "+ num + " ?");
        respuesta = entrada.next().charAt(0);
        
        switch (respuesta) {
            case '<':
                max=num;
                analitzat=num;
            case '=':
                seguir=false;
            case '>':
                min=num;
                analitzat=num;           
        }       
    }
  }
}
