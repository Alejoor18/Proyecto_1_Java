package ejercicio6;

import java.util.Scanner;

public class MainMayor {
    public static void main(String[] args) {
        Mayor m= new Mayor();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        m.numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        m.numero2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero");
        m.numero3 = sc.nextInt();

        System.out.printf("el numero mayor es: " + m.validarMayor());
    }
}
