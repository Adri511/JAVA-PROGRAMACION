/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array50;

import java.util.Arrays;
import java.util.Scanner;




/**
 *
 * @author adrvic
 */
public class Array50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int tamanoarray;
        int tamanoarray2=0;
        boolean nohay50=false;
        
        System.out.println("De que tamaño quieres el array?");
        tamanoarray=entrada.nextInt();
        
        int array1[]=new int[tamanoarray];
        
        for (int i = 0; i < array1.length; i++) {
            array1[i]=(int) (Math.random()*100);
            System.out.print(array1[i]+"-");
            if(array1[i]>50){
            nohay50=true; 
            tamanoarray2++;
            }
        }
        if(nohay50==true){
        
            int array2[]=new int[tamanoarray2];
        
            for (int i = 0; i < array1.length; i++) {
                if(array1[i]>50){
                    for (int j = 0; j < array2.length; j++) {
                        array2[j]=array1[i];
                        System.out.println(array2[i]);
                }
            }
                
            
        }
           
        }
        
        
}
    
}
