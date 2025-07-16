package ejercicio8;

import java.util.Scanner;

public class MainGimnasio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gimnasio g = new Gimnasio();

        System.out.println("Seleccione la duración:");
        System.out.println("1 - 15 días");
        System.out.println("2 - 30 días");
        System.out.println("3 - 3 meses");
        g.opcion = sc.nextInt();

        int total = g.calcularPago();
        if (total == -1) {
            System.out.println("Opción no válida.");
        } else {
            System.out.println("El costo a pagar es: $" + total);
        }
    }
}
