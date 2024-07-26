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

public class mayor_o_menor {
     public static void main(String[] args) {
     int[] lista = new int[8];
        Scanner kayboard = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.println("Teclea un numero ");
            int numero = kayboard.nextInt();
            lista[i] = numero;
        }
        int mayor =0 ; 
        int menor=100000;
        for (int i = 0; i < 8; i++) {
            if(lista[i]<menor){
                menor=lista[i];
         }
          if(lista[i]>mayor){
                mayor=lista[i];
          }
        }
    System.out.println("El numero mayor es:" + mayor);
    System.out.println("El numero menor es:" + menor);
    
    }
}

       
   
}
