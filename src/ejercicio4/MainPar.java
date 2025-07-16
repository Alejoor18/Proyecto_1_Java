package ejercicio4;

import java.util.Scanner;

public class MainPar {
    public static void main(String[] args) {
        ParImpar p = new ParImpar();
        Scanner sc = new Scanner(System.in);
        System.out.printf("ingrese el numero que quiere validar");
        p.numero=sc.nextInt();
        System.out.printf(p.validarParImpar());
    }
}
