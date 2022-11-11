/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo.pkg18;

import java.util.Scanner;

public class Ejemplo18 {


    public static void main(String[] args) {
        String nombre;
        double horas,tarifa,salario,impuesto,neto;
        
    Scanner entrada = new Scanner(System.in);
    System.out.println("Introduce el nombre del operario:");
        nombre=entrada.nextLine();
    System.out.println("Escribe las horas trabajadas:");
        horas=entrada.nextDouble();
    System.out.println("Escribe Precio de hora tarifa normal:");
        tarifa=entrada.nextDouble();
    
        
    if (horas<=35){
        salario = horas*tarifa;}
        else{
        salario = 35*tarifa+(horas-35)*tarifa*1.5;
        
    }
    
    if (salario>900){
        impuesto = (400*0.25) + (salario-900)*0.45;
        neto = salario-impuesto;}
        
    else if (salario > 500){
        impuesto = salario-500 * 0.25;
        neto = salario-impuesto;
    }
        System.out.println("El salario NETO de "+ nombre + " asciende a: "+ neto +" ,-€ impuestos:"+ impuesto);
    }
    
}
  

