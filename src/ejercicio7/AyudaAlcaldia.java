package ejercicio7;

public class AyudaAlcaldia {
    String genero;
    int edad;

    public int calcularAyuda() {
        if (genero.equalsIgnoreCase("f") && edad > 50) {
            return 120000;
        } else if (genero.equalsIgnoreCase("f") && edad >= 30 && edad <= 50) {
            return 100000;
        } else if (genero.equalsIgnoreCase("m")) {
            return 40000;
        } else {
            return 0;
        }
    }
}
