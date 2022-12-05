/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruletarusa;

import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class Ruletarusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        boolean respuesta=true;
        int disparo=0;
        char SoN='N';
        int muerte=(int)(Math.random()*(6-1)+1);
        
        do {
            System.out.println("Quieres jugar a la ruleta rusa S/N");
            SoN=entrada.nextLine().charAt(0);
            
            if (SoN=='S' || SoN=='s') {
                respuesta=false;
                
                        System.out.println("Elige un numero del 1 al 6");
                         disparo=entrada.nextInt();
                    
                    while (disparo<=0 || disparo>6){
                        System.out.println("Un revolver tiene 6 huecos para balas, pon un numero entre 1 y 6 ");
                        System.out.println("Introduce un numero entre 1 y 6");
                        disparo=entrada.nextInt();
                    }
                    if(muerte==disparo){
                        System.out.println("Has muerto");
                    }else{
                        System.out.println("Sobreviviste");
                        System.out.println("Se disparo el numero "+muerte);
                    }
                    
            } else {
                    System.out.println("Jugamos mas tarde entonces");
            }
          
                    
        } while (respuesta);
    }
    
}
