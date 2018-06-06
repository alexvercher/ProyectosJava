/*
* Dado un determinado array de números enteros, realizar recorrido y mostrar
* cada uno de estos números hasta que se encuentre un número negativo,
* momento en el cual finalizará el recorrido del array y se indicará el total
* de números recuperados.
 */

package com.cice.ejercicios;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Ejercicio6 {
    public static void main(String[] args) {
        int [] arrayEnteros = {1,7,5,6,-8,9};
        int i = 0;

        while (arrayEnteros[i] >= 0){
            System.out.println(arrayEnteros[i]);
            i++;
        }
        System.out.println("El total de números recuperados son: " + i);
    }
}
