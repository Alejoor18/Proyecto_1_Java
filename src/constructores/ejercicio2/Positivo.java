package constructores.ejercicio2;

public class Positivo {
    // Atributos de ejemplo
    int ejemplo;
    String texto;

    // Constructor vacío
    public Positivo() { }

    // Constructor con parámetros
    public Positivo(int ejemplo, String texto) {
        this.ejemplo = ejemplo;
        this.texto = texto;
    }

    public void mostrar() {
        System.out.println("Ejemplo: " + ejemplo + ", Texto: " + texto);
    }
}
