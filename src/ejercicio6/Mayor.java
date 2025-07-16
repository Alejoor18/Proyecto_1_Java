package ejercicio6;

public class Mayor {
    int numero1;
    int numero2;
    int numero3;
    int valido;

    int validarMayor(){
        if (numero1 >= numero2 && numero1 >= numero3) {
           return valido = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            return valido = numero2;
        } else {
           return valido = numero3;
        }
    }
}
