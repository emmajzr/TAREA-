//Said Salvador Orozco Olmos
//Ejercicio Adivina el número random
//24/07/2024

import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner rnd = new Scanner(System.in);
        Random random = new Random();
        int numAleatorio = random.nextInt(100) + 1;
        int adivina;
        System.out.println("¡ADIVINA EL NÚMERO ENTRE 1 y 100!");
        
        while (true) {
            System.out.print("Escribe tu número: ");
            adivina = rnd.nextInt();
            if (adivina>numAleatorio) {
                System.out.println("Demasiado alto intenta de nuevo");
            } else if (adivina<numAleatorio) {
                System.out.println("Demasiado bajo intenta otra vez");
            } else {
                System.out.println("¡Correcto! El número era " +numAleatorio);
                break;
            }
        }
        rnd.close();
    }
}