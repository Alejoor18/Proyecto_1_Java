import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int precioBase = 0;
        int total = 0;

        System.out.print("Seleccione el tamaño del sándwich (pequeño/grande): ");
        String tamaño = scanner.nextLine().toLowerCase();

        if (tamaño.equals("pequeño")) {
            precioBase = 6000;
        } else if (tamaño.equals("grande")) {
            precioBase = 12000;
        } else {
            System.out.println("Tamaño no válido.");
            return;
        }

        total += precioBase;

        System.out.print("¿Desea tocineta? (si/no): ");
        String tocineta = scanner.nextLine().toLowerCase();
        if (tocineta.equals("si")) {
            total += 3000;
        }

        System.out.print("¿Desea pavo? (si/no): ");
        String pavo = scanner.nextLine().toLowerCase();
        if (pavo.equals("si")) {
            total += 3000;
        }

        System.out.print("¿Desea queso? (si/no): ");
        String queso = scanner.nextLine().toLowerCase();
        if (queso.equals("si")) {
            total += 2500;
        }

        System.out.print("¿Desea jalapeño? (si/no): ");
        scanner.nextLine(); // por si quedó un salto de línea
        // Jalapeño es gratis, no afecta el total

        System.out.println("El valor total a pagar por su sándwich es: $" + total);
    }
}
