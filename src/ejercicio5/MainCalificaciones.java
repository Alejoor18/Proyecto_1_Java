package ejercicio5;

import java.util.Scanner;

public class MainCalificaciones{
    public static void main(String[] args) {
        calificaciones c = new calificaciones();
        Scanner sc = new Scanner(System.in);
        System.out.printf("ingrese la calificacion de fisica");
        c.fisica=sc.nextInt();
        System.out.printf("ingrese la calificacion de quimica");
        c.quimica=sc.nextInt();
        System.out.printf("ingrese la calificacion de matematica");
        c.matematica=sc.nextInt();
        System.out.printf("ingrese la calificacion de informatica");
        c.informatica=sc.nextInt();
        System.out.printf("su promedio es:" + c.calcularPromedio());
        System.out.printf(c.promedio());

    }

}
