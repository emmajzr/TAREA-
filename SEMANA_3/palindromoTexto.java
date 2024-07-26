import java.util.Scanner;

public class palindromoTexto {

    public static void main(String[] args) {
        Scanner tecladoxd = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ") ;
        String text = tecladoxd.nextLine();
        if (Palindromo(text)){
        System.out.println("Es un palíndromo felicidades");
        } else {
            System.out.println("No es palíndromo");
        }
        tecladoxd.close();
    }
    public static boolean Palindromo(String text){
        String textoLimpio = text.toLowerCase();
        int longitud = textoLimpio.length();
        for (int i=0; i<longitud/2; i++) {
            if (textoLimpio.charAt(i) !=textoLimpio.charAt(longitud-1-i)) {
                return false;
            }
        }
    return true;
}
}