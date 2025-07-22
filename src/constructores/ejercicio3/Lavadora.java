package constructores.ejercicio3;

public class Lavadora {
    // Atributos de ejemplo
    int ejemplo;
    String texto;

    // Constructor vacío
    public Lavadora() { }

    // Constructor con parámetros
    public Lavadora(int ejemplo, String texto) {
        this.ejemplo = ejemplo;
        this.texto = texto;
    }

    public void mostrar() {
        System.out.println("Ejemplo: " + ejemplo + ", Texto: " + texto);
    }
}
