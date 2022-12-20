/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones8;

import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class Funciones8 {
public static int suma1aN(int n){
int suma = 1;

    for (int i = n; i < n; i++) {
        suma=suma+i;
    }
    return suma;
}
public static int producte1aN(int n){


    for (int i = n; i < n; i++) {
        n*=i;
    }
    return n;
    
}
public static int intermedi1aN(int n){
    double intermedio=(n+1)/2;
    return (int) intermedio;
    
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int n;
        System.out.println("Introduce un numero");
        n=entrada.nextInt();
        
        System.out.println("Sumatorio"+suma1aN(n));
        System.out.println("Productorio"+producte1aN(n));
        System.out.println("Intermedio"+intermedi1aN(n));
        
               
    }
    
}
