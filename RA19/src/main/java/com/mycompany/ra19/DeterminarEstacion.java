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
public class DeterminarEstacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa un número de mes (1-12): ");
        int mes = teclado.nextInt();

        String estacion;

        switch (mes) {
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Mes inexistente.";
                break;
        }

        System.out.println("La estación del año es: " + estacion);

        teclado.close();
    }
}
