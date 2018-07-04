package colecciones;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class ColeccionesClaves {
    public static void main(String[] args) {

        // Colecciones basadas en claves HASHTABLE o HASHMAP

        Hashtable<String, String> listaPersonas = new Hashtable<>();
        HashMap<String, String> listaNombres = new HashMap<>();

        //1º HASHTABLE
        listaPersonas.put("Profesor", "Gustavo");
        listaPersonas.put("Alumno", "Alex");
        listaPersonas.put("Alumna", "Cristina");
        listaPersonas.put("Alumno", "Javi"); //Actualiza la clave Alumno, no se añade

        String profesor = listaPersonas.get("Profesor");
        //System.out.println(profesor);

        //System.out.println(listaPersonas.size());
        //System.out.println(listaPersonas.contains("alex"));
        //System.out.println(listaPersonas.containsKey("Alumno"));

        // Recorrer la colección
        /*Set<String> keySet = listaPersonas.keySet();
        for (String key: keySet){
            System.out.println(key);
            System.out.println(listaPersonas.get(key));
        }*/


        //2º HASHMAP
        listaNombres.put("Profesor", "Gustavo");
        listaNombres.put("Alumno", "Alex");
        listaNombres.put("Alumna", "Cristina");
        listaNombres.put(null, null);

        /*System.out.println(listaNombres.get("Profesor"));
        System.out.println(listaNombres.containsKey("Profesor"));
        System.out.println(listaNombres.containsValue("Alex"));*/

        Set<String> keySet = listaNombres.keySet();
        for  (String key:keySet){
            System.out.println(key);
            System.out.println(listaNombres.get(key));
        }
    }
}
