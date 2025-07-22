package constructores.ejercicio12;

public class ModeloAuto {
    // Atributos de ejemplo
    int ejemplo;
    String texto;

    // Constructor vacío
    public ModeloAuto() { }

    // Constructor con parámetros
    public ModeloAuto(int ejemplo, String texto) {
        this.ejemplo = ejemplo;
        this.texto = texto;
    }

    public void mostrar() {
        System.out.println("Ejemplo: " + ejemplo + ", Texto: " + texto);
    }
}
