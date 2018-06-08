package ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] array = {1,8,6,7,9};
        int resultado = 0;

        for (int a:array){
            resultado += a;
        }
        System.out.println("Resultado: " + resultado);
    }
}
