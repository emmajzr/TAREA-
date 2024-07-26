import java.util.Scanner;

public class convertirMayu {
    public static void main(String[] args) {
        Scanner textoxd = new Scanner(System.in);
        String text;
        do {
            System.out.print("Ingresa una palabra o cadena de texto: ");
            text = textoxd.nextLine();
            if (!text.isEmpty()) {
                System.out.println(text.toUpperCase());
            }
        } while (!text.isEmpty());
        textoxd.close();
}
}