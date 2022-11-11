/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo17bucles;
import java.util.Scanner;
/**
 *
 * @author adrvic
 */
public class Ejemplo17Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int fallidos=0, introducidos=0, num1,num2,ultimonumero;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Intoduce un numero inicial");
            num1= entrada.nextInt();
            
        System.out.println("Introduce numero");
            num2= entrada.nextInt();
                if (num2>num1) {
                    introducidos++;
            }       else{
                    introducidos++;
                    fallidos++;
                    System.out.println("Es menor");
                    }
                
                ultimonumero=num2;  
                
        do {            
            System.out.println("Introduce numero");
            num2= entrada.nextInt();
                if (num2>ultimonumero) {
                    introducidos++;
            }       else{
                    introducidos++;
                    fallidos++;
                    System.err.println("Es menor");
                    }
                ultimonumero=num2;    
        }
        

        while(num2!=0);
       
            
            System.out.println("Total numeros"+introducidos);
            System.out.println("Total fallos"+fallidos);

}
}


        
        
               
