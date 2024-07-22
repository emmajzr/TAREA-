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
public class CalcularPrecioConDescuento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingresa el precio original del producto: ");
        double precioOriginal = teclado.nextDouble();

        double descuento;

        if (precioOriginal <= 100) {
            descuento = 0;
        } else if (precioOriginal > 100 && precioOriginal <= 200) {
            descuento = 0.10;
        } else if (precioOriginal > 200 && precioOriginal <= 500) {
            descuento = 0.20;
        } else {
            descuento = 0.25;
        }

        double precioFinal = precioOriginal - (precioOriginal * descuento);

        System.out.println("El precio final del producto después del descuento es: " + precioFinal);
        
        teclado.close();
    }
}
