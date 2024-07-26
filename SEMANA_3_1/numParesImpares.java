import java.util.*;

public class numParesImpares {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int[] numeros=new int[10] ;
        int conteoPares=0;
        int conteo_de_Impares=0 ;
        System.out.println("Ingrese 10 números enteros:");
        for (int i=0; i < numeros.length; i++) 
        {
            System.out.print("Número "+(i+1) +": ");
            numeros[i] = teclado.nextInt();
        }
        for (int numero : numeros) 
        {
            if (numero %2 ==0){
                conteoPares++;
            } else {
                conteo_de_Impares++;
            }
        }
        System.out.println("Cantidad de números pares: " + conteoPares);
        System.out.println("Cantidad de números impares: " + conteo_de_Impares);
    }
}