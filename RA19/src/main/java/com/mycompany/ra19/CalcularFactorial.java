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
public class CalcularFactorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero;
        long factorial;

        System.out.print("Ingresa un número: ");
        numero = teclado.nextInt();

        factorial = 1;

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);

        teclado.close();
    }
}
