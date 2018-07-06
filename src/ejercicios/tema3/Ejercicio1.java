package ejercicios.tema3;

public class Ejercicio1 {
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
