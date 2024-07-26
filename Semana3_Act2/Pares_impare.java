
package Semana3_Act2;

import java.util.Scanner;
public class Pares_impare {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[10];
        int pares = 0, impares= 0;

        for (int i = 0; i < num.length; i++) {
            System.out.print("Dime el " + (i + 1) + " numero= ");
            num[i] = scan.nextInt();
        }
        scan.close();
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                pares= pares +1;
            } else {
                impares=impares +1;
            }
        }
        System.out.println(" numeros son pares" + pares);
        System.out.println( " numeros son impares"+ impares);
    }
}
