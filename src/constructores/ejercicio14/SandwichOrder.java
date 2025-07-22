package constructores.ejercicio14;

public class SandwichOrder {
    // Atributos de ejemplo
    int ejemplo;
    String texto;

    // Constructor vacío
    public SandwichOrder() { }

    // Constructor con parámetros
    public SandwichOrder(int ejemplo, String texto) {
        this.ejemplo = ejemplo;
        this.texto = texto;
    }

    public void mostrar() {
        System.out.println("Ejemplo: " + ejemplo + ", Texto: " + texto);
    }
}
