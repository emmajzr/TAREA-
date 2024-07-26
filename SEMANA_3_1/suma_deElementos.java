import java.util.Scanner;

public class suma_deElementos {
    public static void main(String[] args){
        Scanner texto =new Scanner(System.in);
        int[]elements =new int[5] ;
        int sumatoria = 0;
        System.out.println("Ingrese 5 números enteros:") ;
        for (int i =0; i< elements.length; i++){
            System.out.print("Número " +(i+1)+": ");
            elements[i]=texto.nextInt();
        }
        for (int num:elements){
            sumatoria += num;
        }
        System.out.println("La suma de todos los números es: " + sumatoria);
        texto.close();
}
}