package calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int resultado = 0;
        int num1;
        int num2;
        Scanner sc = new Scanner (System.in);
        Calculadora calculadora = new Calculadora();

        System.out.print("Introduce el primer número: ");
        num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextInt();

        resultado = calculadora.sumar(num1, num2);
        System.out.println("El resultado de la suma es: " + resultado);
        resultado = calculadora.restar(num1,num2);
        System.out.println("El resultado de la resta es: " + resultado);
        resultado = calculadora.multiplicar(num1,num2);
        System.out.println("El resultado de la multiplicación es: " + resultado);
        resultado = calculadora.dividir(num1,num2);
        System.out.println("El resultado de la división es: " + resultado);
    }
}
