import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su operador (Claro, Tigo o Movistar):");
        String operador = scanner.nextLine().toLowerCase();

        System.out.print("Ingrese la cantidad de minutos internacionales consumidos: ");
        int minutos = scanner.nextInt();

        int cargoFijo = 0;
        int valorMinuto = 0;
        int paqueteDatos = 0;

        switch (operador) {
            case "tigo":
                cargoFijo = 45000;
                valorMinuto = 200;
                paqueteDatos = 12000;
                break;
            case "claro":
                cargoFijo = 30000;
                valorMinuto = 100;
                paqueteDatos = 18000;
                break;
            case "movistar":
                cargoFijo = 40000;
                valorMinuto = 250;
                paqueteDatos = 8000;
                break;
            default:
                System.out.println("Operador no válido.");
                return;
        }

        int total = cargoFijo + (minutos * valorMinuto) + paqueteDatos;

        System.out.println("El total a pagar es: $" + total);
    }
}
