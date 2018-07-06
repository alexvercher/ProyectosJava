package ejercicios.tema1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce número: ");
        numero = sc.nextInt();

        int resultado = numero * numero;

        System.out.println("El cuadrado del número es: " + resultado);
    }
}
