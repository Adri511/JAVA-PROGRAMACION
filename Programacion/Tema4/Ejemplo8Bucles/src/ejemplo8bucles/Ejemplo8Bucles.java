/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo8bucles;
import java.util.Scanner;
/**
 *
 * @author adrvic
 */
public class Ejemplo8Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double num1;
        boolean cerrar;
        int negativos,positivos,contador;
        
        Scanner entrada = new Scanner (System.in);
        
        negativos=0;
        positivos=0;
        contador=0;
        
        cerrar=false;
        
        
        
        while(cerrar==false){
            System.out.println("Introduce un numero si quieres cerrar pulse 0");
            num1=entrada.nextDouble();  
            
        if (negativos>=1){
            System.out.println("Hay numero negativo");
         
        }
        if (num1==0){            
           cerrar=true;
        }
        
            if (num1<0) {
                negativos++;
                                     
            } else {
                positivos++;
            }
            
        contador++;
            
        
        }
        System.out.println("Hay " +negativos+ " numeros negativos" + " Hay "+ positivos +" numeros positivos" + " Introduciste "+contador+" numeros");
    
}
}
