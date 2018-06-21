/*
Vamos a realizar un ejercicio en el que, dada una determinada cadena de caracteres, se
inserte una barra / adicional entre palabras.
Mediante el método indexOf() se irán buscando las posiciones donde se encuentran los espacios
para insertar el espacio adicional, operación esta que será́ realizada a través del método insert().
 */

package ejercicios;

public class Ejercicio9 {
    public static void main(String[] args) {
        //STRING
        String texto = "Texto donde se insertarán espacios";
        int pos = 0;

        texto.replace(" ", "/ ");
        System.out.println(texto);

        System.out.println("=========================");



        //STRINGBUILDER
        StringBuilder cadena = new StringBuilder("Texto donde se insertarán espacios");
        //Integer[] posicion = new Integer[];

        while ((pos = cadena.indexOf(" ", pos)) > 0){
            cadena.insert(pos,"/");
            System.out.println(cadena.indexOf(" ", pos));
            pos+=2;
        }
        System.out.println(cadena);
    }
}
