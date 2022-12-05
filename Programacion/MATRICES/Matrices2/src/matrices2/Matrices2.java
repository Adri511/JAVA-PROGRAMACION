/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices2;

/**
 *
 * @author adrvic
 */
public class Matrices2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    int [][] matriz1= new int [10][10];
    
        for (int i = 0; i < matriz1.length; i++) {
            System.out.println("\n La tabla del "+(i+1));
            for (int j = 0; j < matriz1[0].length; j++) {
               
                matriz1[i][j]=(i+1)*(j+1);
                System.out.println("");
                System.out.printf((i+1)+"x"+(j+1)+"="+matriz1[i][j]+"");
                 
            }
            
            System.out.println("");
        }
            
        
        
    }
    
}
