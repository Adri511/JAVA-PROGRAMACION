/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo.pkg17;
import java.util.Scanner;
/**
 *
 * @author adrvic
 */
public class EJEMPLO17 {
 
    public static void main(String[] args){
    String nombre;
    int horas;
    float tarifa;
    
    
    Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        nombre=entrada.nextLine();
        System.out.println("Escribe horas trabajadas esta semana:");
        horas=entrada.nextInt();
        System.out.println("Precio hora tarifa normal");
        tarifa=entrada.nextFloat();
        
    }
    
}
