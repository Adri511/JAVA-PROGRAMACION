/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones.pkg3;

import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class Funciones3 {

    public static int minimo(int a, int b){
       if(a<=b){
       return a;
       }else return b;
        
        //return  Math.min(a, b);
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        a=entrada.nextInt();
        System.out.println("Introduce el segundo numero");
        b=entrada.nextInt();
        
        System.out.println("El minimo es = "+minimo(a,b));
    }
    
}
