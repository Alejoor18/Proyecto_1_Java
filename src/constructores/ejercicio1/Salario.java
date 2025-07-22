package constructores.ejercicio1;

public class Salario {
    // Atributos de ejemplo
    int ejemplo;
    String texto;

    // Constructor vacío
    public Salario() { }

    // Constructor con parámetros
    public Salario(int ejemplo, String texto) {
        this.ejemplo = ejemplo;
        this.texto = texto;
    }

    public void mostrar() {
        System.out.println("Ejemplo: " + ejemplo + ", Texto: " + texto);
    }
}
