package imc;

import java.util.Scanner;

 

public class IMC {

    public static void main(String[] args) {

      float peso,altura;

      Scanner teclado =new Scanner (System.in);

      System.out.println("Ingrese su peso en kilogramos");

      peso = teclado.nextFloat();

      System.out.println("Ingrese su altura en metros");

      altura = teclado.nextFloat();

      double IMC =peso/(altura*altura);

      System.out.println("Su IMC es"+ IMC);

      teclado.close();

    }

}

