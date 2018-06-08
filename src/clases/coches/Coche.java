package clases.coches;

public class Coche {

    //Atributos de la clase normalmente privados
    private String color;
    private int potencia;
    private String modelo;
    private String bastidor;
    private String marca;

    public void arrancar(){
        System.out.println("Estoy arrancando");
    }

    public void acelerar(){
        String cadena = "Acelerand";
        int numeros = potencia/10;
        for(int i=0; i<=numeros; i++){
            cadena+="o";
        }
        System.out.println(cadena);
    }

    public void frenar(){
        System.out.println("Frena!!!!!!");
    }

    public void parar(){
        System.out.println("Apagando motor");
        System.out.println("Motor parado");
    }

    public void setPotencia(int potenciaEntrada){
        if (potenciaEntrada > 0){
            potencia = potenciaEntrada;
            //System.out.println("La potencia contrada es: " + potencia);
        }else{
            System.out.println("La potencia no puede ser negativa");
        }
    }
}
