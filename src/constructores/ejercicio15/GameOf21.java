package constructores.ejercicio15;

public class GameOf21 {
    // Atributos de ejemplo
    int ejemplo;
    String texto;

    // Constructor vacío
    public GameOf21() { }

    // Constructor con parámetros
    public GameOf21(int ejemplo, String texto) {
        this.ejemplo = ejemplo;
        this.texto = texto;
    }

    public void mostrar() {
        System.out.println("Ejemplo: " + ejemplo + ", Texto: " + texto);
    }
}
