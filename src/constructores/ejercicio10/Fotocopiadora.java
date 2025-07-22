package constructores.ejercicio10;

public class Fotocopiadora {
    // Atributos de ejemplo
    int ejemplo;
    String texto;

    // Constructor vacío
    public Fotocopiadora() { }

    // Constructor con parámetros
    public Fotocopiadora(int ejemplo, String texto) {
        this.ejemplo = ejemplo;
        this.texto = texto;
    }

    public void mostrar() {
        System.out.println("Ejemplo: " + ejemplo + ", Texto: " + texto);
    }
}
