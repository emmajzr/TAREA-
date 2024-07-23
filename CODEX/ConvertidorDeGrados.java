//Said Salvador Orozco Olmos
//Ejercicio Conversión de temperaturas
//23/07/2024

import java.util.Scanner;

public class ConvertidorDeGrados {
    public static void main(String[] args) {
        Scanner temperatura = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en grados celsius: ");
        double celsius = temperatura.nextDouble();
        System.out.println("Seleccione la conversión deseada:");
        System.out.println("1. Convertir a Fahrenheit");
        System.out.println("2. Convertir a Kelvin");
        int opcion = temperatura.nextInt();
        switch (opcion) {
            case 1:
                double fahrenheit = celsius * 9/5+32;
                System.out.printf("La temperatura en Fahrenheit es: %.2f\n", fahrenheit);
                break;
            case 2:
                double kelvin = celsius +273.15;
                System.out.printf("La temperatura en Kelvin es: %.2f\n", kelvin);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        temperatura.close();
    }
}