package constructores.ejercicio4;

public class ParImpar {
    // Atributos de ejemplo
    int ejemplo;
    String texto;

    // Constructor vacío
    public ParImpar() { }

    // Constructor con parámetros
    public ParImpar(int ejemplo, String texto) {
        this.ejemplo = ejemplo;
        this.texto = texto;
    }

    public void mostrar() {
        System.out.println("Ejemplo: " + ejemplo + ", Texto: " + texto);
    }
}
