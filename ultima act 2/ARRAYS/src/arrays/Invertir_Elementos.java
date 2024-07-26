/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author emman
 */
public class Invertir_Elementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[6];

        // Leer 6 números desde el teclado y almacenarlos en el array
        System.out.println("Ingresa 6 números:");
        for (int i = 0; i < 6; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Mostrar los números en orden invertido
        System.out.println("Los números en orden invertido son:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
    
}
