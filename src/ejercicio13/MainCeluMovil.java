package ejercicio13;

import java.util.Scanner;

public class MainCeluMovil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CeluMovil c = new CeluMovil();

        System.out.print("Ingrese su operador (tigo/claro/movistar): ");
        c.operador = sc.nextLine();

        System.out.print("Ingrese los minutos internacionales usados: ");
        c.minutos = sc.nextInt();

        int total = c.calcularTotal();
        if (total == -1) {
            System.out.println("Operador no válido.");
        } else {
            System.out.println("Total a pagar: $" + total);
        }
    }
}
