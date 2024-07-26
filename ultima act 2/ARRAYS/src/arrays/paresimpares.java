package arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emman
 */
import java.util.Scanner;

public class paresimpares {

    public static void main(String[] args) {
        int[] lista = new int[10];
        Scanner kayboard = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Teclea un numero ");
            int numero = kayboard.nextInt();
            lista[i] = numero;
        }
        int pares=0;
        int impares=0;
        for (int i = 0; i < 10; i++) {
            if(lista[i]% 2==0){
                pares=pares+1;
            }
            else{
                impares=impares+1;
            }
        }
    System.out.println("La cantidad de pares es: " + pares);
    System.out.println("La cantidad de pares es: " + impares);
    }
}
