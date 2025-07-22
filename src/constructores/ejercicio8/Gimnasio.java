package constructores.ejercicio8;

public class Gimnasio {
    // Atributos de ejemplo
    int ejemplo;
    String texto;

    // Constructor vacío
    public Gimnasio() { }

    // Constructor con parámetros
    public Gimnasio(int ejemplo, String texto) {
        this.ejemplo = ejemplo;
        this.texto = texto;
    }

    public void mostrar() {
        System.out.println("Ejemplo: " + ejemplo + ", Texto: " + texto);
    }
}
