package clases.ejercicios;

public class Contador {
    private int contador;

    public void incrementar(int numero){
        contador+=numero;
    }

    public void decrementar(int numero){
        contador-=numero;
    }

    public void setContador(int contador){
        this.contador = contador;
    }

    public int getContador(){
        return contador;
    }
}
