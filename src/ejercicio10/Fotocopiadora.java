package ejercicio10;

public class Fotocopiadora {
    int copias;

    public int calcularPrecioPorCopia() {
        if (copias <= 499) return 120;
        if (copias <= 749) return 100;
        if (copias <= 999) return 80;
        return 50;
    }

    public int calcularTotal() {
        return copias * calcularPrecioPorCopia();
    }
}
