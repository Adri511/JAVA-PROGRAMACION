/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones6;

import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class Funciones6 {
public static double preuambiva(double preu){
    
    return preu=preu+(preu/100*21);
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        double preu;
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Dame el precio del articulo "+i+" de 5");
            preu=entrada.nextDouble();
            System.out.println("El precio sin IVA es :"+ preu+"€");
            System.out.printf("El precio con IVA es : "+preuambiva(preu)+"€\n");
            
            
            
            
            
            
        }
        
    }
    
}
