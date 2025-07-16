package ejercicio4;

import java.util.Scanner;

public class ParImpar {
    int numero;

    String validarParImpar(){
        if (this.numero % 2 == 0) {
            return "El número " + this.numero + " es **par**.";
        } else {
            return "El número " + this.numero + " es **impar**.";
        }
    }
}
