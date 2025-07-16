package ejercicio11;

public class Computadora {
    boolean pitido;
    boolean gira;

    public String diagnostico() {
        if (pitido && gira) return "Póngase en contacto con el técnico de apoyo.";
        if (pitido && !gira) return "Verificar contactos de la unidad.";
        if (!pitido && !gira) return "Traiga la computadora para repararla en la central.";
        return "Compruebe las conexiones de altavoces.";
    }
}
