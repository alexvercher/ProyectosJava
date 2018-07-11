package ejercicios.tema4;

import ejercicios.tema4.empleados.Empleado;
import ejercicios.tema4.empleados.Gerente;
import ejercicios.tema4.empleados.Director;

public class Main {

    public static void main(String[] args) {

    // Programa principal
        Empleado empleado = new Empleado("Javi", 2000, "01/01/1981");
        Gerente gerente = new Gerente("Jose", 2000, "01/01/1982","Gerente");
        Director director = new Director("Alex", 2000, "01/01/1980","Dirección","6605FBL");

        Empleado[] empleados = {empleado, gerente, director};

        for (Empleado e: empleados){
            System.out.println(e.getNombre()+" "+ e.getSalario());
        }

        Empleado empleado1 = gerente;
        System.out.println(empleado1.getNombre());

        Gerente gerente1 = director;
        gerente1.aumentoSalario();
        /*
        System.out.println(empleado.getSalario());
        System.out.println(gerente.getSalario());
        System.out.println(director.getSalario());*/
    }
}
