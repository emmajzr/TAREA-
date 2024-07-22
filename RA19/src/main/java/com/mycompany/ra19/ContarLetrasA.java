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
public class ContarLetrasA {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = teclado.nextLine();

        int contador = 0;

        palabra = palabra.toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a') {
                contador++;
            }
        }

        System.out.println("La letra 'a' aparece " + contador + " veces en la palabra.");

        teclado.close();
    }
}
