package lambdas;

import lambdas.interfaces.Funcional;
import lambdas.interfaces.IFuncional;

public class Main {
    public static void main(String[] args) {

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
        };
    }
}
