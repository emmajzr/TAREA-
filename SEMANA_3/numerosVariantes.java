// Said Salvador Orozco Olmos
// Ejercicio 1
// 25/07/2024

import java.util.Scanner;

public class numerosVariantes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num = teclado.nextInt();
        boolean num_primo = esnumeroPrimo(num);
        if (num_primo) {
            System.out.println("El número " + num + " es primo");
        } else{
            System.out.println("El número " + num + " no es primo");
        }
        teclado.close();
    }
    public static boolean esnumeroPrimo(int num) {
        if (num<=1) 
        {
            return false;
        }
        for (int i=2; i<= Math.sqrt(num); i++) {
            if (num%i==0) 
            {
                return false;
            }
        }
        return true;
    }
}