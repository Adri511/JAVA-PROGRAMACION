/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicisclasestrings5;

import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class EjercicisClaseStrings5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String str = "", str2 = "";
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        str = entrada.nextLine();
        
        int strLength = str.length();
        
        for (int i = (strLength - 1); i >= 0; --i) {
            str2 = str2 + str.charAt(i);
        }

        if (str.toLowerCase().equals(str2.toLowerCase())) {
            System.out.println(str + " Es palindromo");
        } else {
            System.out.println(str + "No es palindromo ");
        }
    }

}
    

