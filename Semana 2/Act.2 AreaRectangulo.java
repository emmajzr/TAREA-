import java.util.Scanner;
public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float base, altura;
        System.out.print("Dime la base= ");
        base = scanner.nextFloat();
        System.out.print("Dime la altura = ");
        altura = scanner.nextFloat();
        scanner.close();
        double area = base * altura;
        System.out.println("El area es: " + area);
    }
}
