
package tareas_de_la_semana;

import java.util.Scanner;
public class edad_para_votar{

    public static void main(String[] args) {

        int edad;

        Scanner teclado =new Scanner (System.in);

        System.out.print("Ingrese su edad en años :");

        edad = teclado.nextInt();

        if (edad>=18){

            System.out.println("Sí es elegible para votar");

        } else{

            System.out.println("No es elegible para votar");

        }

        teclado.close();

    }

   

}   

