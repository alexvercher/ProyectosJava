package excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {
    public static void main(String[] args) {
    // public static void main(String[] args) throws FileNotFoundException{

        //Excepciones Unchecked
        /*Object objeto = null;
        objeto.toString();*/

        //Excepciones Checked
        try {
            int i=1/0;
            String cadena = null;
            cadena.length();
            FileReader fichero = new FileReader("text.txt");
        } catch (FileNotFoundException ex){
            System.out.println("Error encontrado: " + ex.toString());
        } catch (NullPointerException ex){
            System.out.println("ERROR NULLPOINTER");
        } catch (Exception ex){
            String clase = ex.getClass().getCanonicalName();
            System.out.println(clase);
        }

        Prueba p = new Prueba();
        try {
            p.test();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
