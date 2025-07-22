package constructores.ejercicio5;

public class Calificaciones {
    // Atributos de ejemplo
    int ejemplo;
    String texto;

    // Constructor vacío
    public Calificaciones() { }

    // Constructor con parámetros
    public Calificaciones(int ejemplo, String texto) {
        this.ejemplo = ejemplo;
        this.texto = texto;
    }

    public void mostrar() {
        System.out.println("Ejemplo: " + ejemplo + ", Texto: " + texto);
    }
}
