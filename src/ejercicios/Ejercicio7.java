/*
    Crear un programa que de todas las cadenas de caracteres suministradas desde la línea
    de comandos al iniciar la ejecución del programa, nos muestre la cadena de mayor longitud
 */

package ejercicios;

public class Ejercicio7 {
    public static void main(String[] args) {

        String[] cadena = {"Hola que tal",
                            "Vamos a contar dadenas",
                            "Vale",
                            "Venga va"};
        int sumaCaracteres = 0;
        int posicion = 0;

        for (int i=0;i<cadena.length;i++){
            if (cadena[i].length() > sumaCaracteres){
                posicion = i;
                sumaCaracteres = cadena[i].length();
            }
        }
        System.out.println("La cadena mayor tiene un tamaño de " + sumaCaracteres + " y es '" + cadena[posicion] + "'") ;
    }
}
