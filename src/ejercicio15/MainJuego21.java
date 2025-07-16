package ejercicio15;

import java.util.Scanner;

public class MainJuego21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameOf21 g = new GameOf21();
        g.repartarCartas();

        System.out.println("Tus cartas: " + g.carta1 + ", " + g.carta2);
        System.out.print("¿Deseas ver la tercera carta? (s/n): ");
        String r = sc.nextLine();

        int total = r.equalsIgnoreCase("s") ? g.totalConExtra() : g.totalSinExtra();
        System.out.println("Tu total es: " + total);
    }
}
