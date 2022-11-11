/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2arrays;

/**
 *
 * @author adrvic
 */
public class Ejemplo2Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        int notas[] = new int[]{7,3,8,3,5};
        
        int notamediasuma=0;
       
        for (int i = 0; i < notas.length; i++) {
                
                notamediasuma=notamediasuma + notas[i];
        }
                System.out.println("La nota media es "+notamediasuma/notas.length);
                
            
            
            
            
            
        }
    }
    

