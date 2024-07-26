package Semana3_Act2;

import java.util.*;
public class Mayor_menor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[8];
        int max = Integer.MIN_VALUE; 
        int min = Integer.MAX_VALUE; 

        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + ". Dime el numero= ");
            numeros[i] = scan.nextInt();
        }
       scan.close();
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
            else if (numeros[i] < min) {
                min = numeros[i];
            }
        }
        System.out.println("El numero mas grande es= " + max);
        System.out.println("El numero mas peque es= " + min);

    }
}


