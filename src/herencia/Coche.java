package herencia;

public class Coche extends Vehiculo {

    // Atributos encapsulados
    private int potencia;
    private int numeroPuertas;
    private int numeroPlazas;
    private String modelo;
    private String marca;

    // Constructores
    public Coche(){
    }

    public Coche(int potencia, int numeroPuertas, int numeroPlazas, String modelo, String marca) {
        super();
        this.potencia = potencia;
        this.numeroPuertas = numeroPuertas;
        this.numeroPlazas = numeroPlazas;
        this.modelo = modelo;
        this.marca = marca;
    }

    public Coche(String color, String bastidor, int numeroRuedas, int potencia, int numeroPuertas, int numeroPlazas, String modelo, String marca) {
        super(color, bastidor, numeroRuedas);
        this.potencia = potencia;
        this.numeroPuertas = numeroPuertas;
        this.numeroPlazas = numeroPlazas;
        this.modelo = modelo;
        this.marca = marca;
    }

    // Métodos GETTER & SETTER
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
