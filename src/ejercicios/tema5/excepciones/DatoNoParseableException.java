package ejercicios.tema5.excepciones;

public class DatoNoParseableException extends Exception {

    public DatoNoParseableException(){
        super("Objeto no parseable a número");
    }

    public DatoNoParseableException(String msg){
        super(msg);
    }
}
