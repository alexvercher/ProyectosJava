package com.cice.fundamentos;

import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {

        boolean buleano = true;
        Scanner sc = new Scanner (System.in);

        //Estructura de control IF / IF-ELSE
        /*if (buleano){
            //si se cumple la condición ejecuto este bloque de código
            System.out.println("Condición cumplida");
            if (buleano){
                System.out.println("A");
            }else{
                System.out.println("B");
            }
        }else{
            //si no se cumple ejecumtamos este otro bloque de código
            System.out.println("No se cumple la condición");
        }*/

        //SWITCH
        System.out.print("Introduzca el nombre: ");
        String nombre = sc.next();

        switch (nombre){
            case "Jose":
                System.out.println("El nombre introducido es Jose");
                break;
            case "Paco":
                System.out.println("El nombre introducido es Paco");
                break;
            case "Jesus":
                System.out.println("El nombre introducido es Jesus");
                break;
            case "Alejandro":
                System.out.println("El nombre introducido es Alejandro");
                break;
             default:
                 System.out.println("El nombre introducido no es ninguno de los contemplados");
        }
    }
}
