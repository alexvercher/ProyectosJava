package ejercicios.tema3;

public class Ejercicio2 {
    public static void main(String[] args) {
        String cadena = "Esto es una cadena con muchas vocales"; //14 vocales
        int numeroVocales = 0;

        for (int i=0;i < cadena.length();i++){
            switch (cadena.toLowerCase().charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    numeroVocales++;
                    break;
                default:
                    continue;
            }
        }
        System.out.println("El número de vocales es: " + numeroVocales);
    }
}
