package cifradocesar;

import cifradocesar.logica.Logica;

public class Main {
    public static void main(String[] args) {

        Logica cifrado = new Logica();

        String cadenaCifrada = cifrado.cifrarTexto("alex", 3);
        System.out.println("Cadena cifrada: " + cadenaCifrada);

        String cadenaDescifrada = cifrado.descifrarTexto("adci", 3);
        System.out.println("Cadena descifrada: " + cadenaDescifrada);
    }
}
