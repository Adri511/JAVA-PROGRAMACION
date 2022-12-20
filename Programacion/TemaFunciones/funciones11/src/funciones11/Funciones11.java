/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones11;

import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class Funciones11 {
public static void tablademultiplicar(int a){
    for (int i = 1; i <= 10; i++) {
        int multiplicado = i*a;
        System.out.println(a+" x "+i+" = "+multiplicado);
    }
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Que numero quieres multiplicar?");
        a=entrada.nextInt();
        System.out.println("");
        System.out.println("TABLA DEL "+a);
        System.out.println("");

        tablademultiplicar(a);
    }
    
}
