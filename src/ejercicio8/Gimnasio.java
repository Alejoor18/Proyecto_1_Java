package ejercicio8;

public class Gimnasio {
    int opcion;

    public int calcularPago() {
        switch (opcion) {
            case 1: return 18000;
            case 2: return 35000;
            case 3: return 86000;
            default: return -1;
        }
    }
}
