import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
        int horas = scanner.nextInt();

        int salario;
        if (horas <= 10) {
            salario = horas * 30000;
        } else {
            salario = horas * 33000;
        }

        System.out.println("Señor(a) " + nombre + ", el número de horas es " + horas +
                " y su salario equivale a $" + salario);
    }
}
