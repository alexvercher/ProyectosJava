package excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {
    public static void main(String[] args) {

        //Excepciones Unchecked
        /*Object objeto = null;
        objeto.toString();*/

        //Excepciones Checked
        try {
            FileReader fichero = new FileReader("text.txt");
        } catch (FileNotFoundException ex){
            System.out.println("Error encontrado: " + ex.toString());
        }
    }
}
