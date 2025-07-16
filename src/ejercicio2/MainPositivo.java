package ejercicio2;

import javax.swing.*;

public class MainPositivo {
    public static void main(String[] args) {
        Positivo positivo = new Positivo();
        positivo.numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero"));//para un panel y el parse cambiar de otro tipo a string
        if(positivo.esPositivoNegativo()){
            System.out.printf("es un numero positivo");
        }else {
            System.out.printf("es un numero negativo");
        }
    }
}
