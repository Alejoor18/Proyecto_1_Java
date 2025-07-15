import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione la duración de la mensualidad:");
        System.out.println("1 - 15 días ($18.000)");
        System.out.println("2 - 30 días ($35.000)");
        System.out.println("3 - 3 meses ($86.000)");

        int opcion = scanner.nextInt();
        int costo;

        switch (opcion) {
            case 1:
                costo = 18000;
                break;
            case 2:
                costo = 35000;
                break;
            case 3:
                costo = 86000;
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        System.out.println("El costo a pagar por la mensualidad es: $" + costo);
    }
}
