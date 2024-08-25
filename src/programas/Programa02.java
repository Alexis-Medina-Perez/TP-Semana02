package programas;

import java.util.Scanner;
import java.lang.Math;

public class Programa02 {
    public static void main(String[] args) {
        
        //Declarar variables
        double radio, acirculo;
                
        //Creando un objeto
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        System.out.print("Ingresar radio: ");
        radio = lectura.nextDouble();
        
        //Proceso de datos
        acirculo = Math.PI * Math.pow(radio, 2);
        
        //Salida de datos
        System.out.println("El area del circulo es: " + acirculo);
    }
}
