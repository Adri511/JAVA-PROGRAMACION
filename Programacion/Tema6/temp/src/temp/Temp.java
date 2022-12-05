/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temp;

import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class Temp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        final String[] mes= {"Gener","Febrer","Març","Abril","Maig","Juny","Juliol","Agost","Setembre","Octubre","Novembre","Decembre"};
        int temperatura[]= new int[12];
        int asterisco=0;
        
        for (int i = 0; i < mes.length; i++) {
            System.out.println("Introduce la temperatura de "+mes[i]);
            temperatura[i]=entrada.nextInt();
            asterisco++;
        }
        
        for (int i = 0; i < mes.length; i++) {
            System.out.println(mes[i]+"\t |"); 
            
            for (int j = 0; j < asterisco; j++) {   
                System.out.print("*");
                
            }
           
            
            
            
            
            
        }
    }
    
}
