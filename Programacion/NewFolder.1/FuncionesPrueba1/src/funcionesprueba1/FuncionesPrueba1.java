/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesprueba1;

import static funcionesprueba1.FuncionesPrueba1.suma;
import java.util.Scanner;

/**
 *
 * @author adrvic
 */
public class FuncionesPrueba1 {

    
    public static double suma(double a, double b){

        double resultado=a+b;
        return resultado;
    
    }
    public static double resta(int a, int b){
        
        double resultado;
        
        if(a>b){
            resultado=a-b;
        }else{
            resultado = b-a;
        }
        
        return resultado;
    
    }
    
    public static int multiplica(int a, int b){

        int resultado=a*b;
        return resultado;
    
    }
    public static double division(int a, int b){

        int resultado=a/b;
        return resultado;
    
    }
    public static boolean mayordeedad(int a){
        
        
        boolean mayordeedad = true;
        
        if(a>=18){
            mayordeedad=false;
            return false;
        }
        return true;

    }
    public static String paroimpar(double a){
        String par = "Es par";
        String impar = "Es impar";
        
        if(a%2==0){
            return par;
        }else{
            return impar;
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        int b;
        //int calculadora;
        Scanner entrada=new Scanner(System.in);
        
        //System.out.println("Calculadora que funcion quieres hacer?");
        //System.out.println("Sumar = 1");
        //System.out.println("Restar = 2");
        //System.out.println("Dividir = 3");
        //System.out.println("Multiplicar = 4");
        //System.out.println("Par o Impar = 5");
        //calculadora=entrada.nextInt();
        
        System.out.println("");
       
        
        
       
            //System.out.println("El resultado de "+a+" + "+b+" Es "+suma(a,b));
        
        
            //System.out.println("El resultado de "+a+" - "+b+" Es "+resta(a,b));
        
        
            //System.out.println("El resultado de "+a+" / "+b+" Es "+division(a,b));
        
       
            System.out.println("El resultado de "+a+" * "+b+" Es "+multiplica(a,b));
       
        
            //System.out.println("El resultado de "+a+" * "+b+" Es "+paroimpar(a));
      
            
        }   
    }
    
}
