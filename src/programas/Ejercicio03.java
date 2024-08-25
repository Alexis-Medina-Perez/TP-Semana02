package programas;

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio03 {
    public static void main(String[] args) {
        
        //Declarar variables
        double radianes, grados, redondearGrados;
        
        //Creando un objeto
        Scanner lectura = new Scanner(System.in);
        
        //Entrada de datos
        System.out.print("Ingresar el angulo en radianes: ");
        radianes = lectura.nextDouble();
        
        //Proceso de datos
        grados = Math.toDegrees(radianes);
        redondearGrados = Math.floor(grados * 10) / 10;

        //Salida de datos
        System.out.println("Entonces, " + radianes + " radianes equivale a " + redondearGrados + " grados.");
    }
}