import java.util.Scanner;
public class invertirArreglo {
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        int[] num=new int[6];
        System.out.println("Ingrese 6 números enteros: ") ;
        for (int i=0; i<num.length; i++)
        {
        System.out.print("Número "+(i+1)+": ");
            num[i]=teclado.nextInt();
        }
        int[] num_invertidos=new int[num.length];
        for (int i=0; i <num.length; i++)
        {
            num_invertidos[i]=num[num.length-1-i];
        }
            System.out.println("Array invertido ");
        for (int numero : num_invertidos){
            System.out.print(numero+" " ) ;
        }
}
}