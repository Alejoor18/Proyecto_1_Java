package constructores.ejercicio6;

public class MayorNumero {
    // Atributos de ejemplo
    int ejemplo;
    String texto;

    // Constructor vacío
    public MayorNumero() { }

    // Constructor con parámetros
    public MayorNumero(int ejemplo, String texto) {
        this.ejemplo = ejemplo;
        this.texto = texto;
    }

    public void mostrar() {
        System.out.println("Ejemplo: " + ejemplo + ", Texto: " + texto);
    }
}
