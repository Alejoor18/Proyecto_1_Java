import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿La computadora emite un pitido al iniciar? (si/no): ");
        String pitido = scanner.next().toLowerCase();

        System.out.print("¿El disco duro gira? (si/no): ");
        String gira = scanner.next().toLowerCase();

        if (pitido.equals("si") && gira.equals("si")) {
            System.out.println("Póngase en contacto con el técnico de apoyo.");
        } else if (pitido.equals("si") && gira.equals("no")) {
            System.out.println("Verificar contactos de la unidad.");
        } else if (pitido.equals("no") && gira.equals("no")) {
            System.out.println("Traiga la computadora para repararla en la central.");
        } else if (pitido.equals("no") && gira.equals("si")) {
            System.out.println("Compruebe las conexiones de altavoces.");
        } else {
            System.out.println("Datos inválidos. Por favor responda 'si' o 'no'.");
        }
    }
}
