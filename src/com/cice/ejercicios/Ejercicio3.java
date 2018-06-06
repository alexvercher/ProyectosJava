package com.cice.ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner(System.in).useDelimiter("[0-24]");

        System.out.println("Introduzca la hora por favor: ");
        int hora = sc.nextInt();

        switch (hora){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("Buenos días!!!");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println("Buenas tardes!!");
                break;
            case 21:
            case 22:
            case 23:
            case 24:
                System.out.println("Buenas noches!!");
            default:
                System.out.println("Te has pasado de listo");
        }
    }
}
