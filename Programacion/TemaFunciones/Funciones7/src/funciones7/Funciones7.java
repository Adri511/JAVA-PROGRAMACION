/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones7;

import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class Funciones7 {
    
public static double perimetrerectangle(double ample,double alt){
return ample*2+alt*2;
}
public static double arearectangle(double ample,double alt){
return ample*alt;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        double ample = 0,alt = 0;
        int ver;
        System.out.println("Dime el ancho del rectangulo");
        ample=entrada.nextDouble();
        System.out.println("Dime el alto del rectangulo");
        alt=entrada.nextDouble();
        
        System.out.println("Que quieres saber el area = 1 o el perimetro = 2?");
        ver=entrada.nextInt();
        
        switch(ver){
        case 1:
            System.out.println("El area del rectangle es:  "+arearectangle(ample,alt));
        case 2:
            System.out.println("El area del rectangle es: "+perimetrerectangle(ample,alt));
        }
        
        
        //%.3f m \n
        
    }
    
}
