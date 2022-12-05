/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices1;

/**
 *
 * @author adrvic
 */
public class Matrices1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
    int num1=1;
    int [][] matriz1= new int [5][5];
    
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz1[i][j]=num1++;
                System.out.printf("%4d", matriz1[i][j]);
            }
            System.out.println("");
        }
            
        
        
       
    }
    
}
