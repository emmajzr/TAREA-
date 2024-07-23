package tareas_de_la_semana;

import java.util.Scanner;

public class Contador_de_digitos {

    public static void main(String[] args) {
        
      Scanner teclado =new Scanner (System.in);
      
      int numero;
      numero=teclado.nextInt();
      String cadena=Integer.toString(numero);
      
      int digitos=0;
      digitos=cadena.length();
     
      System.out.println("El numero tiene "+digitos+" digitos");
              
     teclado.close();

    }

}
