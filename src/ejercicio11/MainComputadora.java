package ejercicio11;

import java.util.Scanner;

public class MainComputadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Computadora c = new Computadora();

        System.out.print("¿Emite pitido? (true/false): ");
        c.pitido = sc.nextBoolean();
        System.out.print("¿Gira el disco? (true/false): ");
        c.gira = sc.nextBoolean();

        System.out.println(c.diagnostico());
    }
}
