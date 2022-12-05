/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebas;

/**
 *
 * @author adrvic
 */
public class PRUEBAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*  String s1="Papallona";
        System.out.println(s1.replace('a','e'));
        System.out.println(s1.replace('p','j'));
        String s2= s1.replace('p','j');
        
        System.out.println(s2);
    }*/

    String cadena2="abc1234";
    
        System.out.println("Ejemplo: " +cadena2.matches("[abc]+.*"));
        
        System.out.println("Ejemplo: " +cadena2.matches("[abc]+\\d{4}"));
    
        System.out.println("Ejemplo: "+cadena2.matches("[abc]+\\d{1,10}"));
        
        

    }
}
