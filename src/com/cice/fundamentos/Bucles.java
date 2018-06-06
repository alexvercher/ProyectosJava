package com.cice.fundamentos;

public class Bucles {

    public static void main(String[] args) {

        //Bucle FOR
        // for (inicialización; condicion; incremento)
        /*for (int i=0;i<10;i++){
            System.out.println("Contador: " + i);
        }*/

        int[] ArrayEnteros = {1,2,3,4,5,6,7,8,9};
        //Bucle FOREACH
        for (int a: ArrayEnteros){
            System.out.println(a);
        }
    }
}
