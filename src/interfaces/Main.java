package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        TestInterfaces test = new TestInterfaces();
        String nombre1 = test.nombreCompleto("Alex", "Vercher");

        TestNuevo test2 = new TestNuevo();
        String nombre2 = test2.nombreCompleto("Javi", "García");

        System.out.println(nombre1);
        System.out.println(nombre2);

        List<InterfacePrueba> list = new ArrayList<>();
        list.add(test);
        list.add(test2);
    }
}
