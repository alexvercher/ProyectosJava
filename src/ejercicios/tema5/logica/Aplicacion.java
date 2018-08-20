package ejercicios.tema5.logica;

import java.util.List;
import java.util.Scanner;

public class Aplicacion {

    private Scanner sc;
    private int opcion;
    private Almacen almacen;

    public Aplicacion(){
        this.sc = new Scanner(System.in);
        this.almacen = new Almacen();
    }

    public void mostrarMenu(){

        do{
            System.out.println("====================");
            System.out.println("= ALMACENE NUMEROS =");
            System.out.println("====================");
            System.out.println();
            System.out.println("OPCIONES");
            System.out.println("1. Almacenar números");
            System.out.println("2. Recuperar números");
            System.out.println("0. Salir");
            System.out.println("====================");
            System.out.print("Opción elegida: ");
            opcion = sc.nextInt();
            System.out.println("====================");
            ejecutarOpcion(opcion);
        }while (opcion != 0);
    }

    public void ejecutarOpcion (int opcion){
        switch (opcion){
            case 0:
                almacen.cerrarRecursos();
                break;
            case 1:
                System.out.println("Introduce el número: ");
                int numeroDado = sc.nextInt();
                almacen.almacenarNumero(numeroDado);
                break;
            case 2:
                List<Integer> lista = almacen.recuperarNumeros();
                System.out.println("Números recuperados: ");
                System.out.println(lista);
                break;
            default:
                System.out.println("Opción incorrecta");
        }
    }
}
