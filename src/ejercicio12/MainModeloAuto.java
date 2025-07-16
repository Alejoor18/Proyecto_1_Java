package ejercicio12;

import java.util.Scanner;

public class MainModeloAuto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ModeloAuto m = new ModeloAuto();

        System.out.print("Ingrese el número de modelo: ");
        m.modelo = sc.nextInt();

        if (m.esDefectuoso()) {
            System.out.println("El automóvil está defectuoso, llevar a garantía.");
        } else {
            System.out.println("Su automóvil no está defectuoso.");
        }
    }
}
