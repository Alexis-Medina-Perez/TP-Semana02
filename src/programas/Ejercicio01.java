package programas;

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio01 {
    public static void main(String[] args) {
        
        //Declarar variables
        double n, area;
        
        //Creando un objeto
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        System.out.print("Ingresar la longitud de la diagonal (unidades): ");
        n = lectura.nextDouble();
        
        //Proceso de datos
        area = (Math.pow(n, 2)) / 2;

        //Salida de datos
        System.out.println("El area del cuadrado cuya diagonal tiene una longitud de " + n + " unidades es: " + area + " unidades cuadradas.");
    }
}

