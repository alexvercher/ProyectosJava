package clasesabstractas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Abstracta ab1 = new Test();
        Abstracta ab2 = new NuevoTest();

        List<Abstracta> lista = new ArrayList<>();
        lista.add(ab1);
        lista.add(ab2);

        for (Abstracta abstracta:lista){
            abstracta.testAbstracto();
        }
    }
}
