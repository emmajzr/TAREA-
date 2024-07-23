import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner fact = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num = fact.nextInt();
        long factorial =1;
        for (int i=1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
        fact.close();
    }
}