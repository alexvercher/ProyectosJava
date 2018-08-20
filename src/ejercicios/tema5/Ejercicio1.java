/*
    Solicitar al usuario la instrucción de un número que represente el total de argumentos suministrados
    por línea de comandos que hay que mostrar en pantalla. Después el programa presentará tantos
    argumentos como se indique en dicho número.

    IOException: Excepción que puede lanzar el método readLine() de la clase BufferedReader
    NumerFormaException: Valor suministrado por el usuario no es numérico.
    ArrayIndexOutOfBoundsException: Número de argumentos suministrados es menor al valor introducido
    por el usuario.
 */

package ejercicios.tema5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio1 {

    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int numeroEntradas = 0;
        int[] argumentos;

        System.out.print("Introduce un número de argumentos a solicitar: ");

        try {
            numeroEntradas = Integer.parseInt(bf.readLine());
            argumentos = new int[numeroEntradas];

            for (int i = 0; i < numeroEntradas; i++) {
                System.out.print("Introduce un número: ");
                String line;
                if (!(line = bf.readLine()).equals("")) {
                    argumentos[i] = Integer.parseInt(line);
                } else {
                    break;
                }
            }

            for (int num : argumentos) {
                System.out.println(num);
            }
        }catch (IOException ex){
            System.out.println("Error en la entrada");
        }catch (NumberFormatException ex){
            System.out.println("Error parseando el dato");
        }finally {
            try {
                bf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
