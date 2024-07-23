//Said Salvador Orozco Olmos
//Ejercicio Conversión de divisas
//23/07/2024

import java.util.Scanner;

public class convertidordeMonedas {
    public static void main(String[] args) {
        Scanner divisa = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en pesos mexicanos: ");
        double pesos = divisa.nextDouble();
        System.out.println("Seleccione la moneda a la que desea convertir:");
        System.out.println("1. Dólar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Bath (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dólar Australiano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dólar Canadiense (CAD)");
        System.out.println("9. Bolívar (VES)");
        System.out.println("10. Peso Argentino (ARS)");

        int opcion = divisa.nextInt();

        double USD = 0.053;
        double EUR = 0.045;
        double THB = 1.73;
        double JPY = 7.38;
        double KRW = 68.37;
        double AUD = 0.08;
        double PEN = 0.20;
        double CAD = 0.07;
        double VES = 1.85;
        double ARS = 4.65;

        switch (opcion) {
            case 1:
                double usd = pesos * USD;
                System.out.printf("La cantidad en Dólar ($ USD) es: %.2f\n", usd);
                break;
            case 2:
                double eur = pesos * EUR;
                System.out.printf("La cantidad en Euro (€ EUR) es: %.2f\n", eur);
                break;
            case 3:
                double thb = pesos * THB;
                System.out.printf("La cantidad en Bath (฿ THB) es: %.2f\n", thb);
                break;
            case 4:
                double jpy = pesos * JPY;
                System.out.printf("La cantidad en Yen (¥ JPY) es: %.2f\n", jpy);
                break;
            case 5:
                double krw = pesos * KRW;
                System.out.printf("La cantidad en Won (￦ KRW) es: %.2f\n", krw);
                break;
            case 6:
                double aud = pesos * AUD;
                System.out.printf("La cantidad en Dólar Australiano ($ AUD) es: %.2f\n", aud);
                break;
            case 7:
                double pen = pesos * PEN;
                System.out.printf("La cantidad en Sol (S/ PEN) es: %.2f\n", pen);
                break;
            case 8:
                double cad = pesos * CAD;
                System.out.printf("La cantidad en Dólar Canadiense (C$ CAD) es: %.2f\n", cad);
                break;
            case 9:
                double ves = pesos * VES;
                System.out.printf("La cantidad en Bolívar (Bs VES) es: %.2f\n", ves);
                break;
            case 10:
                double ars = pesos * ARS;
                System.out.printf("La cantidad en Peso Argentino ($a ARS) es: %.2f\n", ars);
                break;
            default:
                System.out.println("Opción no reconocida");
                break;
        }

        divisa.close();
    }
}