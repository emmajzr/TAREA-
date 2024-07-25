//Said Salvador Orozco Olmos
//Ejercicio Vocales o No Vocales
//24/07/2024

import java.util.Scanner;

public class letrasVocoCons {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.print("Da click en la tecla de espacio para terminar\n");
            System.out.print("Ingresa una letra:");
            char letra = teclado.next().charAt(0);
            if (letra==' ') {
                break;
            }
            if (Character.isLetter(letra)) {
                letra = Character.toLowerCase(letra);
                if (letra=='a' || letra =='e' || letra=='i' || letra=='o' || letra=='u') {
                    System.out.println(letra + " es una vocal");
                } else{
                    System.out.println(letra + " es una consonante");
                }
            } else{
                System.out.println("Por favor ingresa una letra que exista");
            }
        }
        teclado.close();
        System.out.println("Fin");
    }
}