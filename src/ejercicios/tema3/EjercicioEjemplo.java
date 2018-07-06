/*
Programa que nos permita registrar una serie de precios de productos en una colección,
ofreciéndonos además la posibilidad de obtener unos datos estadísticos sobre los mismos.
Al iniciarse el programa se presentara al usuario en un menú como el que se indica a
continuación:
1. Nuevo precio
2. Precio medio
3. Precio máximo
4. Precio mínimo
5. Mostrar todos los precios
6. Salir
Menú que volverá a ser mostrado al usuario después de realizarse la opción correspondiente; así
hasta que elija ”salir”
Con la opción 1 se le pedirá al usuario que introduzca el precio que quiere almacenar, mientras
que las demás opciones mostraran los datos solicitados. Como veremos a continuación en el
listado de código, en vez de incluir todo el código en el interior del método main() se realizara la
gestión de cada una de las opciones
 */

package ejercicios.tema3;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioEjemplo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double sumanumeros = 0.0;
        double resultado = 0;
        ArrayList<Double> listaNumeros = new ArrayList<>();

        System.out.println("Realizaremos la media aritmética de los números insertados");
        System.out.println("=========");

        for (int i=0; i<5; i++){
            System.out.print("Introduce una nota: ");
            listaNumeros.add(sc.nextDouble());
        }

        for (Double listanum : listaNumeros){
            sumanumeros+=listanum;
        }

        resultado = sumanumeros / listaNumeros.size();

        System.out.println("El resultado de la media es: " + resultado);
    }
}
