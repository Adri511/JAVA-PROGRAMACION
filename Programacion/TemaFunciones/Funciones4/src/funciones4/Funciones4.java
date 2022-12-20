/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones4;

import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class Funciones4 {

    public static int dimesigne(int a) {
        if (a == 0) {
            return 1;
        }

        if (a > 0) {
            return 2;

        } else {
            return 3;
        }
    }


/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
        // TODO code application logic here
        int a;
        
        Scanner entrada=new Scanner(System.in);
        System.out.println("Dime un numero");
        a=entrada.nextInt();
        
        System.out.println("El numero es "+a);
        
       switch(dimesigne(a)){
           case 1:
               System.out.println("Es igual a 0");
               break;
           case 2:
               System.out.println("Es mayor que 0");
               break;
           case 3:
               System.out.println("Es menor que 0");        
               break;
       }
       
        
    }
    
}
