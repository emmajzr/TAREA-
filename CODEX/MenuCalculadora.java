//Said Salvador Orozco Olmos
//Ejercicio Mneú de calculadora
//24/07/2024

import java.util.Scanner;

public class MenuCalculadora {
    public static void main (String [] args) {
        Scanner menucalcular = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Seleccione la conversión deseada:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            int opcion = menucalcular.nextInt();

            if (opcion >= 5) {
                continuar = false;
                System.out.println("¡Hasta luego!");
                break;
        }

        System.out.println("Ingrese un número: ");
        double num = menucalcular.nextDouble();
        System.out.println("Ingrese un otro número: ");
        double num2 = menucalcular.nextDouble();
        
        switch (opcion) {
            case 1:
            double suma = num + num2;
            System.out.println("La suma de los dos valores es: " + suma);
            break;
            case 2:
            double resta = num - num2;
            System.out.println("La resta de los dos números es: " + resta);
            break;
            case 3:
            double multi = num * num2;
            System.out.println("La multiplicación de los números es: " + multi);
            break;
            case 4:
            double division = num/num2;
            System.out.println("El resultado de la división es: " + division);
            break;
            default:
                System.out.println("Opción no válida.");
        }

        System.out.print("¿Deseas realizar otra operación? (Si/No): ");
        String respuesta = menucalcular.next();
        if (!respuesta.equalsIgnoreCase("Si")) {
            continuar = false;
            System.out.println("¡Hasta luego!");
        }
        menucalcular.close();
    }
}
}