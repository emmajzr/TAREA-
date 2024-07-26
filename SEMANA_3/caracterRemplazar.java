import java.util.Scanner;

public class caracterRemplazar {
    public static void main(String[]args) {
        Scanner tar = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        String texto = tar.nextLine();
        System.out.print("Ingresa el carácter que será reemplazado: ");
        char textDesplazar = tar.next().charAt(0);
        System.out.print("Ingresa el nuevo carácter: ");
        char nuevo_Caracter = tar.next().charAt(0);
        String texto_modificado ="";
        for (int i=0; i <texto.length(); i++){
            if (texto.charAt(i) == textDesplazar){
                texto_modificado += nuevo_Caracter;
            } else 
            {
                texto_modificado += texto.charAt(i);
            }
        }
        System.out.println("Texto modificado: " + texto_modificado);
        tar.close();
    }
}