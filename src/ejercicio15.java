import java.util.Random;
import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int jugadorCarta1 = random.nextInt(10) + 1;
        int jugadorCarta2 = random.nextInt(10) + 1;
        int jugadorCartaExtra = random.nextInt(10) + 1;

        int maquinaCarta1 = random.nextInt(10) + 1;
        int maquinaCarta2 = random.nextInt(10) + 1;
        int maquinaCartaExtra = random.nextInt(10) + 1;

        System.out.println("Tus cartas son: " + jugadorCarta1 + " y " + jugadorCarta2);
        System.out.print("¿Deseas revelar tu tercera carta? (s/n): ");
        String respuesta = scanner.nextLine().toLowerCase();

        int totalJugador = jugadorCarta1 + jugadorCarta2;
        if (respuesta.equals("s")) {
            totalJugador += jugadorCartaExtra;
            System.out.println("Tu tercera carta es: " + jugadorCartaExtra);
        }

        int totalMaquina = maquinaCarta1 + maquinaCarta2 + maquinaCartaExtra;
        System.out.println("La máquina tenía: " + maquinaCarta1 + ", " + maquinaCarta2 + " y " + maquinaCartaExtra);
        System.out.println("Tu total: " + totalJugador);
        System.out.println("Total de la máquina: " + totalMaquina);

        // Determinar el ganador
        if (totalJugador > 21 && totalMaquina > 21) {
            System.out.println("Ambos perdieron.");
        } else if (totalJugador > 21) {
            System.out.println("La máquina gana.");
        } else if (totalMaquina > 21) {
            System.out.println("Tú ganas.");
        } else if (totalJugador > totalMaquina) {
            System.out.println("Tú ganas.");
        } else if (totalJugador < totalMaquina) {
            System.out.println("La máquina gana.");
        } else {
            System.out.println("Empate.");
        }
    }
}
