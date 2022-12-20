/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones5;

import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class Funciones5 {
    
public static double milles_a_quilometres(int milles){

    return (milles*1.60934);

    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int milles;
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Introduce las millas");
        milles=(int)entrada.nextDouble();
        
        System.out.println("Son "+milles_a_quilometres(milles)+"Km");
    }
    
}
