/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo12arrays;

import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class Ejemplo12Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
       
       int array1[] = new int[10];
       int valor,posicion;
       int num1=0;
      
       
       boolean salir=true;
       
        do {            
            System.out.println("Dime una de las opciones");
            System.out.println("·MOSTRAR VALORS -> PRESIONA 0");
            System.out.println("·INTRODUCIR VALOR-> PRESIONA 1");
            System.out.println("·SALIR -> PRESIONA 2");
            valor=entrada.nextInt();
            
            
            
            if(valor==0){
                for (int i=0; i<array1.length;i++){
                System.out.println(array1[i]);
                }
            }
            if(valor==1){
                
                System.out.println("Introduce la posicion");
                
                
              
                
                
                
            }
            
        } while (salir);
  
        
}
}