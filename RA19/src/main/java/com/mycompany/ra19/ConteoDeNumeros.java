/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ra19;

/**
 *
 * @author santi
 */
import java.util.Scanner;
public class ConteoDeNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de números que deseas ingresar: ");
        int cantidad = teclado.nextInt();

        int mayorQueCero = 0;
        int menorQueCero = 0;
        int igualesACero = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            int numero = teclado.nextInt();

            if (numero > 0) {
                mayorQueCero++;
            } else if (numero < 0) {
                menorQueCero++;
            } else {
                igualesACero++;
            }
        }

        System.out.println("Cantidad de números mayores que 0: " + mayorQueCero);
        System.out.println("Cantidad de números menores que 0: " + menorQueCero);
        System.out.println("Cantidad de números iguales a 0: " + igualesACero);

        teclado.close();
    }
}
