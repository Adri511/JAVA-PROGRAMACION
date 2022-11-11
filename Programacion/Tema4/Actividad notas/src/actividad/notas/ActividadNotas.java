/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.notas;

import java.util.Scanner;


public class ActividadNotas {
    public static void main(String[] args){

    int nota;
    
    Scanner reader = new Scanner (System.in);
    
    System.out.print ("Introduce tu Nota");
   
    nota=reader.nextInt();
    
    if (nota<0 && nota>10){
            System.out.println("NOTA ERRONEA INTRODUCE UN NUMERO MAYOR QUE 0");
    }
        else if (nota<=0 && nota>=3){
            System.out.println ("Tu nota es muy deficiente");}
                else if (nota>3 && nota<=5){
                    System.out.println("Tu nota es Insuficiente");
                    }
                    else if (nota>5 && nota<=6){
                        System.out.println("Bien");
                        }
                        else if (nota>6 && nota <=9){
                            System.out.println("Tu nota es Notable");
                            }
                            else if(nota==10){
                                System.out.println("Exelente");
                                }
}
}

