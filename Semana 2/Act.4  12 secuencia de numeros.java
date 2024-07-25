import java.util.Scanner;
public class SecuenciaAritmetica {
    public static void main(String[] args) {
        int primero, dif, max, numero;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dime el primer numero= ");
        primero = scanner.nextInt();
        System.out.print("Dime la diferencia a marcar= ");
        dif = scanner.nextInt();
        System.out.print("Dime el numero que quieres que llegue la secuencia= ");
        max = scanner.nextInt();
         numero = primero;
        scanner.close();
        do {
            System.out.print(numero + ", ");
            numero += dif;
        } while (numero <= max);
    }
}
