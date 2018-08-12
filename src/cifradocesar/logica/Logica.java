package cifradocesar.logica;

import java.util.ArrayList;
import java.util.Arrays;

public class Logica {

    private char[] alfabeto;

    public Logica(){
        this.alfabeto = new char[26];
        generaAlfabeto();
    }

    public void generaAlfabeto(){
        char primeraLetra = 'a';
        for (int i = 0; i < this.alfabeto.length; i++) {
            this.alfabeto[i] = primeraLetra++;
        }
    }

    public String cifrarTexto(String texto, int posiciones){
        String textoCifrado = " ";
        int posicionAlfabeto = 0;
        int posicionCifrado = 0;

        for (int i=0;i<texto.length();i++){
            posicionAlfabeto = posicionCaracterAlfabeto(texto.charAt(i));
            posicionCifrado = posicionAlfabeto + posiciones;
            if (posicionCifrado >= 26){
                posicionCifrado -= 26;
            }
            textoCifrado += this.alfabeto[posicionCifrado];
        }
        return textoCifrado;
    }

    public String descifrarTexto(String texto, int posiciones){
        String textoDescifrado = " ";
        int posicionAlfabeto = 0;
        int posicionCifrado = 0;

        for (int i=0;i<texto.length();i++){
            posicionAlfabeto = posicionCaracterAlfabeto(texto.charAt(i));
            posicionCifrado = posicionAlfabeto - posiciones;
            if (posicionCifrado < 0){
                posicionCifrado += 26;
            }
            textoDescifrado += this.alfabeto[posicionCifrado];
        }
        return textoDescifrado;
    }

    public int posicionCaracterAlfabeto(char caracter){
        int posicion = 0;

        for (int i=0;i<this.alfabeto.length;i++) {
            if (caracter == this.alfabeto[i]) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    @Override
    public String toString() {
        return "Cifrado{" +
                "alfabeto=" + Arrays.toString(alfabeto) +
                '}';
    }
}
