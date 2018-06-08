
package ejercicios;

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
