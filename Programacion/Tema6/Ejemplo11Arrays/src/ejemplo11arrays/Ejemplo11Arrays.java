/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo11arrays;

/**
 *
 * @author adrvic
 */
public class Ejemplo11Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int array1[]=new int[100];
        int array2[]=new int[100];
        System.out.println("Mostramos array1");
        for(int i=0;i<array1.length;i++){
            array1[i]=i+1;
            
            System.out.print(+array1[i]+"\t");
        }
        System.out.println("Mostramos array2");
        for(int i=0;i<array1.length;i++){
        array2[i] = array1[array1.length]-i;
            System.out.println(+array2[i]+"\t");
        }
            
          
            
            
        
            
        
        }
            
        
        
        
            
        }
        
        
        
    }

