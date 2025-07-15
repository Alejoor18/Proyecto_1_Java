import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el género (F o M): ");
        char genero = scanner.next().toUpperCase().charAt(0);

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        int ayuda = 0;

        if (genero == 'F') {
            if (edad > 50) {
                ayuda = 120000;
            } else if (edad >= 30 && edad <= 50) {
                ayuda = 100000;
            }
        } else if (genero == 'M') {
            ayuda = 40000;
        } else {
            System.out.println("Género no válido.");
            return;
        }

        System.out.println("La persona recibirá una ayuda mensual de $" + ayuda);
    }
}
