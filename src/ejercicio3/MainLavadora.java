package ejercicio3;

import java.util.Scanner;

public class MainLavadora {
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        Scanner sc = new Scanner(System.in);
        System.out.printf("digite la opcion de lavadora \n 1.lavadora grande \n 2.lavadora pequeña");
        lavadora.opcion = sc.nextInt();
        System.out.printf("ingrese el numero de horas: ");

        lavadora.hora = sc.nextInt();

        System.out.printf("ingrese el numero de lavadoras: ");
        lavadora.numeroLavadora = sc.nextInt();

        System.out.printf("el valor del alquiler de la lavadora es: " + lavadora.calcularTotalPagar());

    }
}
