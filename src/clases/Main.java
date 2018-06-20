package clases;

import clases.ejemplos.Test;
import clases.estatica.ClaseEstatica;

public class Main {

    public static void main(String[] args) {
        // CLASE COCHE
        /*Coche coche1 = new Coche();
        coche1.setPotencia(100);
        coche1.acelerar();
        coche1.arrancar();
        coche1.frenar();
        coche1.parar();

        Coche coche2 = new Coche();
        coche2.setPotencia(50);
        coche2.acelerar();
        coche2.arrancar();
        coche2.frenar();
        coche2.parar();*/

        /*Test mitest = new Test(10);
        Test mitest2 = mitest;
        mitest.setNumeroEntero(20);
        String retorno = mitest.toString();
        System.out.println(retorno);
        System.out.println(mitest.getNumeroEntero());
        System.out.println(mitest2.getNumeroEntero());*/

        // Llamada a un método estático de una clase no requiere instanciar el objeto para utilizarlo
        ClaseEstatica.nombreCompuesto("Alejandro", "Vercher");
        //Crear objeto y modificar el valor de su variable estática
        ClaseEstatica estatica1 = new ClaseEstatica();
        estatica1.numeroEstatico = 10;
        //Generar un nuevo objeto
        ClaseEstatica estatica2 = new ClaseEstatica();
        //Pintar el valor de la variable estática del nuevo objeto
        System.out.println(estatica2.numeroEstatico);


    }
}
