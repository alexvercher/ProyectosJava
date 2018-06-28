package parseo;

import java.util.Scanner;

public class Parseo {
    public static void main(String[] args) {
        String numero1;
        String numero2;
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        numero1 = sc.nextLine();
        num1 = Integer.parseInt(numero1);
        System.out.print("Introduce el segundo número: ");
        numero2 = sc.nextLine();
        num2 = Integer.parseInt(numero2);
        System.out.println("La suma de los valores es: " + (num1+num2));
    }
}
