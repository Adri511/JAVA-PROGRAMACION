/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication42;

import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class JavaApplication42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner entrada = new Scanner(System.in);
       
       int altopiramide;
       char piramideNoA;
       int i=1;
       
       
        System.out.println("De que quieres hacer la piramide (numeros o asteriscos = N o A)");
        piramideNoA=entrada.next().charAt(0);
        
        System.out.println("Introduce de que altura quieres la piramide?");
        altopiramide=entrada.nextInt();
        
       
       if(piramideNoA =='A' || piramideNoA =='a' || piramideNoA =='N' || piramideNoA =='n' ){
       
           
        
        if (piramideNoA =='A' || piramideNoA =='a' ) { //Si el valor del primer caracter es igual A o a hace todo lo siguiente

        for(int altura=1;altura<=altopiramide;altura++){
            
            for(int espaciosblancos=1;espaciosblancos<=altopiramide-altura;espaciosblancos++){
                System.out.print(" ");
        
        }
            for (int asteriscos=1;asteriscos<=(altura*2)-1;asteriscos++){
                System.out.print("*");
              
                
            }
            System.out.println();
        }
        }
        
        if (piramideNoA =='N' || piramideNoA =='n' ){ //Si el valor del primer caracter es igual N o n hace todo lo siguiente
            
            /*
                El siguiente bucle es el que indicara cuando acabara de repetir el bucle
                Esto significa que mientras el altopiramide(osea el valor indicado)
                sea mayor que altura ese bucle repetira los bucles anidados
            */
            
            for(int altura=1;altura<=altopiramide;altura++){ 

                for(int espaciosblancos=1;espaciosblancos<=altopiramide-altura;espaciosblancos++){
                System.out.print(" ");
        
                }
                for (int numeros=i;numeros<=(i*2)-1;numeros++){    
                
                
                    if(altopiramide>10){                                //Esto de aqui es un pequeño apaño que hice para poder centrar los altos de piramide que superen el 10 
                                                                            //Se ve medio torcida la piramide pero es lo que logré hacer para que se viera mas o menos (:D) 
                                                                                //No se como aplicarlo para despues del 99,999,9999 etc... es con otro bucle pero me da palo xd 
                                                                                    //Asi que lo hice solo hasta 99.
                        if(i<10){
                        System.out.print("-"+i+"-");
                    
                        }
                        if(i>=10 ){
                         System.out.print(" "+i);
                    
                        }
                    
                    }
                    else{
                    System.out.print(" "+i);
                    }
                 
            }
            System.out.println();
            i++;
        }
        
    
    }
}else{
           System.err.println("Error Introduce un A o N tambien se acepta en minusculas"); 
}  
        
}
   
}
