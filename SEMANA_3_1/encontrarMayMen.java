import java.util.Scanner;

public class encontrarMayMen {
    public static void main(String[]args){
        Scanner tecladin = new Scanner(System.in);
        int[] numeros = new int[8];
        System.out.println("Ingrese 8 números enteros:") ;
        for(int i=0; i<numeros.length; i++) 
        {
            System.out.print("Número "+(i+1)+": ") ;
            numeros[i] = tecladin.nextInt();
        }
        int numMayor =numeros[0];
        int numMenor =numeros[0];
        for (int i=1; i<numeros.length; i++){
            if(numeros[i] > numMayor) {
                numMayor=numeros[i];
            }
            if(numeros[i] <numMenor){
                numMenor=numeros[i];
        }
        }
        System.out.println("El número mayor es: " + numMayor);
        System.out.println("El número menor es: " + numMenor);
    }
}