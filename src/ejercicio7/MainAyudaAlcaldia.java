package ejercicio7;

import java.util.Scanner;

public class MainAyudaAlcaldia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AyudaAlcaldia ayuda = new AyudaAlcaldia();

        System.out.print("Ingrese el género (f/m): ");
        ayuda.genero = sc.nextLine();

        System.out.print("Ingrese la edad: ");
        ayuda.edad = sc.nextInt();

        int valor = ayuda.calcularAyuda();
        System.out.println("La ayuda mensual que recibe es de: $" + valor);
    }
}
