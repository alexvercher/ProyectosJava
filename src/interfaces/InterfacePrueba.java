package interfaces;

import java.util.List;

public interface InterfacePrueba {

    //default void test(String nombre){}

    String nombreCompleto (String name, String apellido);
    double calcularEdadMedia(List<Integer> edades);
    void test(String palabra);
}
