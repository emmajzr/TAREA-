/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma;

import java.util.Scanner;

/**
 *
 * @author emman
 */
public class SUMA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] lista = new int[5];
        Scanner kayboard = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Teclea un numero ");
            int numero = kayboard.nextInt();
            lista[i] = numero;
        }
        int suma =0;
        for (int i = 0; i < 5; i++) {
            suma=suma+lista[i];
        }
    System.out.println("La suma es:" + suma);
    
    }
}

       
   