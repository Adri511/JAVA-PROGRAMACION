/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collatz;

import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class Collatz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int num1=0,i=0;
       
        
        System.out.println("Introduce un numero");
        num1=entrada.nextInt();
        
        int tamañoarray=num1*2;
        
        int array1[]=new int[tamañoarray];
        
        do{
            
            System.err.println("El numero introducido es menor que 1 vuelve a introducir el numero");
            num1=entrada.nextInt();
            
        }while(num1<=1);
       
        for (i=0; i < array1.length; i++) {
                
                 if(num1%2==0){
                     array1[i]=num1/2;
                     System.out.println(array1[i]);
                 }else{
                     num1=num1*3+1;
                     array1[i]=num1;
                     System.out.println(array1[i]);
                 }
                 
            
        }
        
    }
    
}