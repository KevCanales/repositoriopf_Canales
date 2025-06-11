
package Programas;
import java.util.Scanner;

public class ComprasCliente {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ingreso de datos
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = input.nextLine();

        System.out.print("Ingrese la compra 1: ");
        double compra1 = input.nextDouble();

        System.out.print("Ingrese la compra 2: ");
        double compra2 = input.nextDouble();

        System.out.print("Ingrese la compra 3: ");
        double compra3 = input.nextDouble();

        // Cálculos
        double total = compra1 + compra2 + compra3;
        double promedio = total / 3;

        // Resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Nombre del Cliente: " + nombre);
        System.out.println("Total compras        : " + total);
        System.out.println("Promedio compras     : " + promedio);
    }
}


