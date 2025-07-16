package ejercicio12;

public class ModeloAuto {
    int modelo;

    public boolean esDefectuoso() {
        return modelo == 119 || modelo == 179 || modelo == 221 || modelo == 780 ||
               (modelo >= 189 && modelo <= 195);
    }
}
