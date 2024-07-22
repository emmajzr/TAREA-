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
public class CalcularPromedio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double numero1,numero2,numero3,promedio;

        System.out.print("Ingresa el primer número: ");
        numero1 = teclado.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        numero2 = teclado.nextDouble();

        System.out.print("Ingresa el tercer número: ");
        numero3 = teclado.nextDouble();

        promedio = (numero1 + numero2 + numero3) / 3;

        System.out.println("El promedio de los tres números es: " + promedio);
        
        teclado.close();
}
}