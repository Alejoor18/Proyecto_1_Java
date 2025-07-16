package ejercicio14;

import java.util.Scanner;

public class MainSandwich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SandwichOrder s = new SandwichOrder();

        System.out.print("Tamaño (pequeño/grande): ");
        s.tamaño = sc.nextLine();

        System.out.print("¿Desea tocineta? (true/false): ");
        s.tocineta = sc.nextBoolean();

        System.out.print("¿Desea pavo? (true/false): ");
        s.pavo = sc.nextBoolean();

        System.out.print("¿Desea queso? (true/false): ");
        s.queso = sc.nextBoolean();

        System.out.println("Total a pagar: $" + s.calcularTotal());
    }
}
