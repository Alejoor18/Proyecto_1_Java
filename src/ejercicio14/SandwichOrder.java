package ejercicio14;

public class SandwichOrder {
    String tamaño;
    boolean tocineta, pavo, queso;

    public int calcularTotal() {
        int total = tamaño.equalsIgnoreCase("grande") ? 12000 : 6000;
        if (tocineta) total += 3000;
        if (pavo) total += 3000;
        if (queso) total += 2500;
        return total;
    }
}
