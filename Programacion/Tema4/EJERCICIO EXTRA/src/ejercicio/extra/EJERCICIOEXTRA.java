/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.extra;
import java.util.Scanner;
/**
 *
 * @author adrvic
 */
public class EJERCICIOEXTRA {

    
    public static void main(String[] args) {
        
        int hora,minuto,segundo;
        
    Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce la hora ");
        hora=entrada.nextInt();
        System.out.println("Introduce los minutos");
        minuto=entrada.nextInt();
        System.out.println("Introduce los segundos");
        segundo=entrada.nextInt();
        
        if (hora>23 || minuto>59 || segundo>59 )
            System.out.println("LA HORA QUE SE MUESTRA A CONTINUACION NO ES VALIDA");
                
        if (segundo==59){
            segundo=0;
            if (minuto==59){
                minuto=0;
                if (hora==23){
                    hora=0;               
                }                   
            } else  {
                  minuto=minuto+1;        
            }
            
        } else  {
            segundo=segundo+1;
        }

        System.out.println("Son las "+ hora + ":" + minuto + ":" + segundo  );
    }
    
}