package funciones10;

import java.util.Scanner;

public class Funciones10 {
    public static String fecha(int dia, int mes, int ano) {
        if (dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12 && ano >= 1){
            return "La data " + dia + "/" + mes + "/" + ano + " es correcta";
        } else {
            return "La data " + dia + "/" + mes + "/" + ano + " es incorrecta";
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia, mes, ano;
        System.out.println("Introduce el dia");
        dia = entrada.nextInt();
        System.out.println("Introduce el mes");
        mes = entrada.nextInt();
        System.out.println("Introduce el año");
        ano = entrada.nextInt();
        System.out.println("Tu fecha es " + fecha(dia, mes, ano));
    }
}