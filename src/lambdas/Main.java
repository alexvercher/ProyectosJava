package lambdas;

import lambdas.interfaces.Funcional;
import lambdas.interfaces.ICalculadora;
import lambdas.interfaces.IFuncional;

public class Main {
    public static void main(String[] args) {
        /*
        Funcional func = new Funcional();
        String resp = func.test("compañeros");
        System.out.println(resp);

        IFuncional fi = mensaje -> String.format("Hola %s, bienvenidos al curso de java", mensaje);
        String resp2 = fi.test("compañeros");
        System.out.println(resp2);

        fi = mensaje -> String .format("Hola %s!!!!", mensaje.toUpperCase());
        String resp3 = fi.test("Alex");
        System.out.println(resp3);

        fi = mensaje -> {
            String res = mensaje.toUpperCase();
            res.concat("--");
            return res;
        };*/

        //****************************
        // RESOLVIENDO LA CALCULADORA
        //****************************
        ICalculadora ic = (a, b) -> a + b;
        System.out.println("Suma: " + ic.calculadora(2, 4));
        ic = (a, b) -> a - b;
        System.out.println("Resta: " + ic.calculadora(5, 1));
        ic = (a, b) -> a * b;
        System.out.println("Multiplicación: " + ic.calculadora(5, 3));
        ic = (a, b) -> a / b;
        System.out.println("División: " + ic.calculadora(10, 3));
    }
}
