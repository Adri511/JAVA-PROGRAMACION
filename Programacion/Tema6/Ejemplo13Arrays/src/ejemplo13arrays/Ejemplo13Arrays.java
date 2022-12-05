/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo13arrays;

import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class Ejemplo13Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int x=0;
        
        
        int v,inc,i;
        
        
        System.out.println("Cuantos valores quieres meter en el array");
        x=entrada.nextInt();
        
        System.out.println("Valor inicial");
        v=entrada.nextInt();
        
        System.out.println("Cuanto quieres que incremente periodicamente");
        inc=entrada.nextInt();
        
        int array[]=new int [x];
        
        for (i=1;i<array.length;i++){
            array[i]=array[i-1]+inc;
        }
        
        System.out.println("Estos son los numeros");
        for(int j=1;j<array.length;j++){
        System.out.print(array[j]);
        }
        
        
    }
    
}
