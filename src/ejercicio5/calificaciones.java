package ejercicio5;

public class calificaciones {
    int fisica;
    int quimica;
    int biologia;
    int matematica;
    int informatica;

    int calcularPromedio(){
        int i = (fisica + quimica + biologia + matematica + informatica) / 5;
        return i;
    }
    String promedio(){
        if (calcularPromedio() >= 0 && calcularPromedio() <= 5.9) {
            return "Calificación: Mala";
        } else if (calcularPromedio() >= 6 && calcularPromedio() <= 8) {
            return "Calificación: Buena";
        } else if (calcularPromedio() > 8) {
            return "Calificación: Excelente";
        } else {
            return "Error: calificaciones fuera de rango.";
        }
    }

}
