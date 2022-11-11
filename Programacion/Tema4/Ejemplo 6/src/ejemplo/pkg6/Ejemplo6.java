/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo.pkg6;
import java.util.Scanner;

public class Ejemplo6 {

    
    public static void main(String[] args) {
    float precioart,precioventa,descuento;
    
   Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el precio del articulo");
        precioart=entrada.nextFloat();
        
        System.out.println("Introduce el precio de venta");
        precioventa=entrada.nextFloat();
        
        descuento=((precioart-precioventa)* 100)/precioart;
        System.out.println("El descuento es : "+ descuento);
        
    
   
    
    
    }
    
}
