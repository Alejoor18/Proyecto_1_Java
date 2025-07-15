import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de copias a imprimir: ");
        int copias = scanner.nextInt();

        int precioPorCopia;

        if (copias < 0) {
            System.out.println("Cantidad inválida.");
            return;
        } else if (copias <= 499) {
            precioPorCopia = 120;
        } else if (copias <= 749) {
            precioPorCopia = 100;
        } else if (copias <= 999) {
            precioPorCopia = 80;
        } else {
            precioPorCopia = 50;
        }

        int total = precioPorCopia * copias;

        System.out.println("Precio por copia: $" + precioPorCopia);
        System.out.println("Total a pagar: $" + total);
    }
}
