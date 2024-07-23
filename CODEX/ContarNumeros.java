import java.util.Scanner;

public class ContarNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de números a ingresar: ");
        int cantidad = teclado.nextInt();
        int mayores = 0;
        int menores = 0;
        int iguales = 0;
        for (int i=0; i<cantidad; i++) {
            System.out.print("Ingresa un número: ");
            int numero = teclado.nextInt();
            
            if (numero>0) {
                mayores++;
            } else if (numero<0) {
                menores++;
            } else {
                iguales++;
            }
        }
        System.out.println("Números mayores que 0: " +mayores);
        System.out.println("Números menores que 0: " +menores);
        System.out.println("Números iguales a 0: " +iguales);
        teclado.close();
    }
}