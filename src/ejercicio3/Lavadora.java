package ejercicio3;

public class Lavadora {
    int opcion;
    int hora;
    int numeroLavadora;
    int calcularPrecio(){
        if(opcion==1){
            return 4000;
        }if(opcion==2){
            return 3000;
        }else{
            System.out.printf("El numero es incorrecto");
            return -1;
        }
    }


    double calcularDescuento() {
        if (numeroLavadora > 3) {
            return 0.03;
        } else {
            return 1;
        }
    }
    int calcularTotalPagar(){
        double total = (this.hora*this.calcularPrecio())*(1-this.calcularDescuento());
        return (int) total;
    }
}
