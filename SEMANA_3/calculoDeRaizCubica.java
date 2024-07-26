import java.util.Scanner;

public class calculoDeRaizCubica {
    public static void main(String[]args){
        Scanner matematik = new Scanner(System.in);
        System.out.print("Ingrese un número para calcular su raíz cuadrada: ");
        double numero_xd = matematik.nextDouble() ;
        if (numero_xd<0) 
        {
            System.out.println("Imposible calcular la raíz cuadrada de un número negativo, pruebe de nuevo al rato");
        } else 
        {
            double papu_raiz = Math.sqrt(numero_xd);
            System.out.printf("La raíz cuadrada de %.2f es %.2f\n", numero_xd, papu_raiz);
        }

}
}