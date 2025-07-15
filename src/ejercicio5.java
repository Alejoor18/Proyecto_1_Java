import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las calificaciones de 0 a 10:");

        System.out.print("Física: ");
        double fisica = scanner.nextDouble();

        System.out.print("Química: ");
        double quimica = scanner.nextDouble();

        System.out.print("Biología: ");
        double biologia = scanner.nextDouble();

        System.out.print("Matemáticas: ");
        double matematicas = scanner.nextDouble();

        System.out.print("Informática: ");
        double informatica = scanner.nextDouble();

        double promedio = (fisica + quimica + biologia + matematicas + informatica) / 5;

        System.out.printf("Promedio: %.2f%n", promedio);

        if (promedio >= 0 && promedio <= 5.9) {
            System.out.println("Calificación: Mala");
        } else if (promedio >= 6 && promedio <= 8) {
            System.out.println("Calificación: Buena");
        } else if (promedio > 8) {
            System.out.println("Calificación: Excelente");
        } else {
            System.out.println("Error: calificaciones fuera de rango.");
        }
    }
}
