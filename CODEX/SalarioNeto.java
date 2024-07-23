//Said Salvador Orozco Olmos
//Ejercicio Calcular el Salario Neto de una persona
//23/07/2024

import java.util.Scanner;

public class SalarioNeto {

    public static void main(String[] args) {
        Scanner trd = new Scanner(System.in);
        System.out.print("Ingrese el salario bruto mensual: ");
        double salarioBruto = trd.nextDouble();
        System.out.print("Ingrese el porcentaje de impuestos: ");
        double porcentajeImpuestos = trd.nextDouble();
        System.out.print("Ingrese las deducciones adicionales: ");
        double deduccionesAdicionales = trd.nextDouble();
        double impuesto = salarioBruto * (porcentajeImpuestos / 100);
        double salarioNeto = salarioBruto - impuesto - deduccionesAdicionales;
        System.out.printf("El salario neto es: %.2f\n", salarioNeto);
        trd.close();
    }
}