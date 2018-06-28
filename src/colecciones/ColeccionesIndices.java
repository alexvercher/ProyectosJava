package colecciones;

import java.util.ArrayList;

public class ColeccionesIndices {
    public static void main(String[] args) {

        ArrayList<String> listaNombres = new ArrayList<>(5);
        listaNombres.add("Alex");
        listaNombres.add("Javi");
        listaNombres.add(1, "Rafa");

        for (int i=0;i<listaNombres.size();i++){
            System.out.println("Nombre: " + listaNombres.get(i));
        }
        System.out.println("================");
        for (String name : listaNombres){
            System.out.println(name);
        }

        System.out.println(listaNombres.contains("Jose"));
    }
}
