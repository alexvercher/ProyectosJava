package clases.ejemplos;

public class Test {

    private int numeroEntero;
    private double numeroReal;
    private boolean esCierto;
    private char caracter;
    private String nombre;

    public Test(int entero){
        numeroEntero = entero;
    }

    public int getNumeroEntero() {
        return numeroEntero;
    }

    public void setNumeroEntero(int numeroEntero) {
        this.numeroEntero = numeroEntero;
    }

    @Override
    public String toString() {
        return "Test{" +
                "numeroEntero=" + numeroEntero +
                ", numeroReal=" + numeroReal +
                ", esCierto=" + esCierto +
                ", caracter=" + caracter +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
