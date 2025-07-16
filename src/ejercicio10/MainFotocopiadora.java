package ejercicio10;

import java.util.Scanner;

public class MainFotocopiadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fotocopiadora f = new Fotocopiadora();

        System.out.print("Ingrese el número de copias: ");
        f.copias = sc.nextInt();

        System.out.println("Precio por copia: $" + f.calcularPrecioPorCopia());
        System.out.println("Total a pagar: $" + f.calcularTotal());
    }
}
