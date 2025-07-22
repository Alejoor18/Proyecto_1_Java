package constructores.ejercicio7;

public class AyudaAlcaldia {
    // Atributos de ejemplo
    int ejemplo;
    String texto;

    // Constructor vacío
    public AyudaAlcaldia() { }

    // Constructor con parámetros
    public AyudaAlcaldia(int ejemplo, String texto) {
        this.ejemplo = ejemplo;
        this.texto = texto;
    }

    public void mostrar() {
        System.out.println("Ejemplo: " + ejemplo + ", Texto: " + texto);
    }
}
