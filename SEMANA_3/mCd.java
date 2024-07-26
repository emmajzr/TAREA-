import java.util.Scanner;

public class mCd {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa el primer número entero: ");
        int numero1 = teclado.nextInt();
        System.out.print("Ingresa el segundo número entero: ");
        int numero2 =  teclado.nextInt();
        int mcd = calcularMCD(numero1, numero2);
        System.out.println("El máximo común divisor de " + numero1 + " y " + numero2 + " es: " + mcd);
        teclado.close();
    }
    public static int calcularMCD(int n1, int n2) {
        while (n2!=0) {
        int tiy = n2;
            n2 = n1 % n2;
            n1 = tiy;
        }
        return n1;
}
}