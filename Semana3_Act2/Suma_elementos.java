/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana3_Act2;

import java.util.Scanner;
public class Suma_elementos {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[5];
        int suma = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.print((i + 1) + ". Dime el numero= ");
            num[i] = scan.nextInt();
            suma = suma + num[i];
        }
        
        System.out.println("La suma de todos los numeros es= " + suma);

        scan.close();
    }
}


