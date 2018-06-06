package com.cice.fundamentos;

public class Operadores {
    //Operadores de relación -> >; <; <=; >=; !=; ==
    //Su finalidad es la de relacionar 2 objetos

    static boolean r1 = 1 > 2;
    static boolean r2 = 1 < 2;
    static boolean r3 = 1 >= 1;
    static boolean r4 = 1 <= 2;
    static boolean r5 = 1 != 2;
    static boolean r6 = 1 == 2;

    public static void main (String[] args){
        System.out.println("OPERADORES DE RELACIÓN");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        //Operadores lógicos && &; || |; !;
        System.out.println("OPERADORES LÓGICOS");
        System.out.println(r1 && r2);
        System.out.println(r2 || r3);
        System.out.println(!r4);

        /*Operador UNARIO
        System.out.println("OPERADORES UNARIOS");
        int a =
        System.out.println(a);
        */

        //Operadores de asignación
        System.out.println("OPERADORES DE ASIGNACIÓN");
        int b = 5;
        b++;
        System.out.println(b);
        b--;
        System.out.println(b);
        b*=2;
        System.out.println(b);
        b/=5;
        System.out.println(b);
    }
}
