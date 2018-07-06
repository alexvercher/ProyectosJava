package ejercicios.tema3;

public class Ejercicio3 {
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
