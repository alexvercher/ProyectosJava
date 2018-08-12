package excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Prueba {

    public void test() throws FileNotFoundException {
        FileReader fr = new FileReader("");
    }

    public void lanzarExcepcion() throws Exception {
        throw new Exception();
    }

    public void lanzarExcepcion2() {
        throw new NumberFormatException();
    }

    public void lanzarExcepcion3() throws ciceException{
        throw new ciceException("Mensaje personalizado");
    }
}
