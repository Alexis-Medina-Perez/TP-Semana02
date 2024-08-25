package programas;

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio02 {
    public static void main(String[] args) {
        
        //Declarar variables
        double nota1, nota2, nota3, nota4, promedio;
        
        //Creando un objeto
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        System.out.print("Ingresar la nota 1: ");
        nota1 = lectura.nextDouble();
        System.out.print("Ingresar la nota 2: ");
        nota2 = lectura.nextDouble();
        System.out.print("Ingresar la nota 3: ");
        nota3 = lectura.nextDouble();
        System.out.print("Ingresar la nota 4: ");
        nota4 = lectura.nextDouble();
        
        //Proceso de datos
        promedio = Math.round((nota1 + nota2 + nota3 + nota4)/4);

        //Salida de datos
        System.out.println("El promedio del alumno es: " + promedio);
    }
}

