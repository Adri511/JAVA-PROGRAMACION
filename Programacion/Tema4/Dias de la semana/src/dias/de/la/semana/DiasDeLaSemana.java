/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dias.de.la.semana;
import java.util.Scanner;
/**
 *
 * @author adrvic
 */
public class DiasDeLaSemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int dia;
        
        System.out.println("Dame un numero entre 1 y 7");
        
        dia= entrada.nextInt();
            
            switch(dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Marte");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("NUMERO ERRONEO INTRODUCE UN NUMERO DEL 1 AL 7");
        }
        
        
        }
    }
    

