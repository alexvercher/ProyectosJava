package herencia;

public class Vehiculo {

    // Atributos de la clase encapsulados
    private String color;
    private String bastidor;
    private int numeroRuedas;

    //Constructores
    public Vehiculo(){
    }

    public Vehiculo(String color, String bastidor, int numeroRuedas) {
        this.color = color;
        this.bastidor = bastidor;
        this.numeroRuedas = numeroRuedas;
    }

    // Métodos funcionales de la clase
    protected void arrancar(){
        System.out.println("Estoy arrancando....");
    }

    protected void apagar(){
        System.out.println("Estoy apagando el motoro...");
    }

    // Métodos GETTER & SETTER
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }
}
