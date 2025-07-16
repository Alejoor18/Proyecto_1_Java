import java.util.Scanner;

public class  ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de lavadora:");
        System.out.println("1 - Lavadora grande ($4000/hora)");
        System.out.println("2 - Lavadora pequeña ($3000/hora)");
        int tipo = scanner.nextInt();

        System.out.print("¿Cuántas lavadoras desea alquilar? ");
        int cantidad = scanner.nextInt();

        System.out.print("¿Cuántas horas de uso por lavadora? ");
        int horas = scanner.nextInt();

        int precioHora;

        if (tipo == 1) {
            precioHora = 4000;
        } else if (tipo == 2) {
            precioHora = 3000;
        } else {
            System.out.println("Tipo de lavadora no válido.");
            return;
        }

        int total = precioHora * horas * cantidad;

        if (cantidad > 3) {
            double descuento = total * 0.03;
            total -= descuento;
        }

        System.out.println("El costo total a pagar es: $" + total);
    }
}
