package programas;

import java.util.Scanner;
import java.lang.Math;

public class Programa01 {
    public static void main(String[] args){
        
        //Declarar variables
        int num1, num2, maximo, minimo;
        
        //Creando un objeto
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        System.out.print("Ingresar numero 1: ");
        num1 = lectura.nextInt();
        System.out.print("Ingresar numero 2: ");
        num2 = lectura.nextInt();
        
        //Proceso de datos
        maximo = Math.max(num1, num2);
        minimo = Math.min(num1, num2);
        
        //Salida de datos
        System.out.println("Los resultados son");
        System.out.println("El numero maximo es: " + maximo);
        System.out.println("El numero minimo es: " + minimo);
    }
}