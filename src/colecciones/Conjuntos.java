package colecciones;

import java.util.HashSet;
import java.util.Iterator;

public class Conjuntos {

    public static void main(String[] args) {

        HashSet<String> lista = new HashSet<>();

        lista.add("Alex");
        lista.add("Jose");

        //Iterator<String> datos = lista.iterator();

        for (String datos:lista){
            System.out.println(datos);
        }

        Iterator<String> conjunto = lista.iterator();
        while (conjunto.hasNext()){
            System.out.println(conjunto.next());
        }
    }
}
