package constructores.ejercicio9;

public class Triangulo {
    // Atributos de ejemplo
    int ejemplo;
    String texto;

    // Constructor vacío
    public Triangulo() { }

    // Constructor con parámetros
    public Triangulo(int ejemplo, String texto) {
        this.ejemplo = ejemplo;
        this.texto = texto;
    }

    public void mostrar() {
        System.out.println("Ejemplo: " + ejemplo + ", Texto: " + texto);
    }
}
