
package Semana3_Act2;

import java.util.*;
public class Invertir_elementos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[6];

        for (int i = 0; i < num.length; i++) {
            System.out.print((i + 1) + ". Dime el numero= ");
            num[i] = scan.nextInt();
        }
        scan.close();

        int[] invertidos = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            invertidos[i] = num[num.length - 1 - i];
        }

        System.out.println("El orden de los numero es= " + Arrays.toString(num));
        System.out.println("El orden invertido es=  " + Arrays.toString(invertidos));
    }
}


