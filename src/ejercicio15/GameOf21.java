package ejercicio15;

import java.util.Random;

public class GameOf21 {
    int carta1, carta2, cartaExtra;

    public void repartirCartas() {
        Random r = new Random();
        carta1 = r.nextInt(10) + 1;
        carta2 = r.nextInt(10) + 1;
        cartaExtra = r.nextInt(10) + 1;
    }

    public int totalConExtra() {
        return carta1 + carta2 + cartaExtra;
    }

    public int totalSinExtra() {
        return carta1 + carta2;
    }
}
