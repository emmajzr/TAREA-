package tareas_de_la_semana;
        
import java.util.Scanner;

public class Contar_numeros_impares  {
    

    public static void main(String[] args) {
       System.out.print("Ingresa un numero entero"); 
      Scanner teclado =new Scanner (System.in);
      
    
              
      int numero=teclado.nextInt();
      int cantidad=0;
      int i=1;
      do{
       
       if(i%2!=0){
         cantidad++;
       }
          
       i++;
               
      }while(i<=numero);
      System.out.print("hay "+cantidad+" numeros impares");
     teclado.close();

    }

}

