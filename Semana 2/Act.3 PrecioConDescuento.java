import java.util.Scanner;

public class PrecioConDescuento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio, finaal;
        System.out.print("Ingrese el precio del producto: ");
        precio = scanner.nextDouble();
        scanner.close();
        if (precio <= 100) {
            finaal = precio - (precio * 0.0);
            System.out.println("El precio final es " + finaal);

        } else if (precio > 100 && precio <= 200) {
            finaal = precio - (precio * 0.10);
            System.out.println("El precio final es " + finaal);
        } else if (precio > 200 && precio <= 500) {
            finaal = precio - (precio * 0.20);
            System.out.println("El precio final es " + finaal);
        } else if (precio > 500) {
            finaal = precio - (precio * 0.25);
            System.out.println("El precio final es " + finaal);
        }
        
    }
}