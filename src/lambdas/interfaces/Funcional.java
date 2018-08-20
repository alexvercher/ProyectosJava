package lambdas.interfaces;

public class Funcional implements IFuncional {

    public String test(String mensaje){
        return String.format("Hola %s, bienvenido al curso de Java", mensaje);
    }
}
