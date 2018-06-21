package clases.string;

import java.util.Arrays;
import java.util.Scanner;

public class CadenaString {

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        String cadena1 = sc.nextLine();
        String cadena2 = sc.nextLine();

        if (cadena1==cadena2){
            System.out.println("Son el mismo objeto");
        }else{


        if (cadena1.equals(cadena2)){
            System.out.println("Son la misma cadena");
        }

        String cadena3 = "Esto es una cadena";
        int posicion = cadena3.indexOf("na");
        int posultima = cadena3.lastIndexOf("ma");
        System.out.println("La posicion es: " + posicion);*/

        /*String cadena4 = "Esto,es,una,cadena,grande";
        String[] palabras = cadena4.split(",");
        for (String e:palabras){
            System.out.println(e);
        }
        Arrays.stream(palabras).forEach(p-> System.out.println(p));
        cadena4 = cadena4.replace("e", "i");
        System.out.println(cadena4);*/

        //CASTING
        int numero = 4589;
        String numeroCadena = String.valueOf(numero);
        System.out.println(numeroCadena + " - " + String.valueOf(numero).length());

        //StringBuilder
        StringBuilder texto = new StringBuilder("El valor de número es: ");
        int num = 120;
        texto.append(num);
        System.out.println(texto.toString());
    }

}
