package ejercicio9;

import java.util.Scanner;

public class MainTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangulo t = new Triangulo();

        System.out.print("Ingrese el primer ángulo: ");
        t.a = sc.nextInt();
        System.out.print("Ingrese el segundo ángulo: ");
        t.b = sc.nextInt();
        System.out.print("Ingrese el tercer ángulo: ");
        t.c = sc.nextInt();

        if (t.esValido()) {
            System.out.println("El triángulo es válido.");
        } else {
            System.out.println("El triángulo NO es válido.");
        }
    }
}
