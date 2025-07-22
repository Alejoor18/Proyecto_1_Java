package constructores.ejercicio13;

public class CeluMovil {
    // Atributos de ejemplo
    int ejemplo;
    String texto;

    // Constructor vacío
    public CeluMovil() { }

    // Constructor con parámetros
    public CeluMovil(int ejemplo, String texto) {
        this.ejemplo = ejemplo;
        this.texto = texto;
    }

    public void mostrar() {
        System.out.println("Ejemplo: " + ejemplo + ", Texto: " + texto);
    }
}
