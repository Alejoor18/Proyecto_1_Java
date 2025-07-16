package ejercicio13;

public class CeluMovil {
    String operador;
    int minutos;

    public int calcularTotal() {
        switch (operador.toLowerCase()) {
            case "tigo": return 45000 + (minutos * 200) + 12000;
            case "claro": return 30000 + (minutos * 100) + 18000;
            case "movistar": return 40000 + (minutos * 250) + 8000;
            default: return -1;
        }
    }
}
