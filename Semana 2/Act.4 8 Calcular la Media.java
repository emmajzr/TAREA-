import java.util.Scanner;

public class CalcularMediaPositivos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num, sum = 0;
        int contador = 0;
        
        System.out.println("Dime los Numeros para sumar y sacar media");
        
        do {
            System.out.print("Dime un numero= ");
            num = teclado.nextDouble();
            if (num >= 0) {
                sum = sum + num;
                contador = contador +1;
            }
        } while (num >= 0);
        teclado.close();
        if (contador > 0) {
            double media = sum / contador;
            System.out.println("La suma de los numeros = " + sum);
            System.out.println("La media de los numeros es= " + media);
        } else {
            System.out.println("No pusiste numeros positivos");
        }
        
        
    }
}
