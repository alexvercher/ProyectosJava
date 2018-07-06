
package ejercicios.tema1;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int factorial = 1;

        System.out.print("Introduzca el número a calcular: ");
        numero = sc.nextInt();

        for(int i=1;i<=numero;i++){
            factorial *= i;
        }
        System.out.println("El resultado es: " + factorial);
    }
}
