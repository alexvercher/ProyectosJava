package com.cice.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce número: ");
        numero = sc.nextInt();

        int resultado = numero % 2;

        if (resultado == 0){
            System.out.println("El número insertado es par");
        }else{
            System.out.println("El número insertado es impar");
        }
    }
}
