package tareas_de_la_semana;
import java.util.Scanner;

public class Generar_Secuencia_de_cuadrados {

    public static void main(String[] args) {
      System.out.print("Ingresa un numero entero");  
      Scanner teclado =new Scanner (System.in);
     
      int numero=teclado.nextInt();
      int i=1;
      do{
       
       System.out.println("numero " +i+" cuadrado: "+(i*i));
       i++;
      }while(i<=numero);
      
     teclado.close();

    }

}