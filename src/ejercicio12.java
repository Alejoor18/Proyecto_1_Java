import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de modelo del automóvil: ");
        int modelo = scanner.nextInt();

        boolean defectuoso = modelo == 119 || modelo == 179 || modelo == 221 || modelo == 780 ||
                (modelo >= 189 && modelo <= 195);

        if (defectuoso) {
            System.out.println(" El automóvil está defectuoso, llevar a garantía.");
        } else {
            System.out.println(" Su automóvil no está defectuoso.");
        }
    }
}
