import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer ángulo: ");
        int angulo1 = scanner.nextInt();

        System.out.print("Ingrese el segundo ángulo: ");
        int angulo2 = scanner.nextInt();

        System.out.print("Ingrese el tercer ángulo: ");
        int angulo3 = scanner.nextInt();

        int suma = angulo1 + angulo2 + angulo3;

        if (suma == 180) {
            System.out.println("El triángulo es válido.");
        } else {
            System.out.println("El triángulo NO es válido.");
        }
    }
}
