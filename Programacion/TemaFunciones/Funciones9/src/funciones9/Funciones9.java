/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones9;

import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class Funciones9 {
public static double mayor(double n1, double n2){
    
    if(n1>n2){
        return n1;
    }else{
        return n2;
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        int n1, n2, n3;
        
        System.out.println("Valor 1");
        n1=entrada.nextInt();
        
        System.out.println("Valor 2");
        n2=entrada.nextInt();
        
        System.out.println("Valor 3");
        n3=entrada.nextInt();
        
        System.out.println("El maximo es: "+mayor(mayor(n1,n2),n3));
    }
    
}
