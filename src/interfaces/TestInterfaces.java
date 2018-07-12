package interfaces;

import java.util.List;

public class TestInterfaces implements InterfacePrueba {
    @Override
    public String nombreCompleto(String name, String apellido) {
        return name + " " + apellido;
    }

    @Override
    public double calcularEdadMedia(List<Integer> edades) {
        return 0;
    }

    @Override
    public void test(String palabra) {
        System.out.println("La palabra recibida es: " + palabra);
    }
}
