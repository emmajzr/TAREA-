package tareas_de_la_semana ;

import java.util.Scanner;

public class Tareas_de_la_semana {

    public static void main(String[] args) {

      final int MAX_CALIFICACIÓN=100;

      Scanner teclado =new Scanner (System.in);
      
      float parciales,proyecto,examen_final;
   
      System.out.println("Ingrese la calificación de los parciales");
      
      parciales = teclado.nextFloat();
      System.out.println("Ingrese la calificación de los proyecto");
      
      proyecto = teclado.nextFloat();

      System.out.println("Ingrese la calificación de su examen final");

      examen_final= teclado.nextFloat();

      double nota_final =(parciales/40+proyecto/30+examen_final/30);

      if(nota_final>MAX_CALIFICACIÓN){
          System.out.println("no es valida");
      }else{
          
      }System.out.println("su nota final es:"+nota_final);
      
     teclado.close();

    }

}

 
 