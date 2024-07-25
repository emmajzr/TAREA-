import java.util.Scanner;

public class Estaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mes;
        
        System.out.print("A que mes estamos? (en numero)= ");
        mes = scanner.nextInt();
        scanner.close();
        switch (mes) {
            case 12:System.out.println("Diciembre");
            case 1:System.out.println("Enero");
            case 2:System.out.println("Febrero");
                System.out.println("es Invierno ");
                break;
            case 3:System.out.println("Marzo");
            case 4:System.out.println("Abril");
            case 5:System.out.println("Mayo");
                System.out.println("es Primavera ");
                break;
            case 6:System.out.println("Junio");
            case 7:System.out.println("Julio");
            case 8:System.out.println("Agosto <3");
                System.out.println("es Verano");
                break;
            case 9:System.out.println("Septiembre");
            case 10:System.out.println("Octubre");
            case 11:System.out.println("Noviembre");
                System.out.println("es Otoño");
                break;
            default:
                System.out.println("Ese numero o mes no existe");
                break;
        }
    }
}
