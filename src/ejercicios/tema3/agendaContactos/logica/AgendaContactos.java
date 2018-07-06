package ejercicios.tema3.agendaContactos.logica;

import java.util.HashMap;
import java.util.Scanner;

public class AgendaContactos {

    //Variable local de la clase
    private HashMap<Long, String > agenda = new HashMap<>();
    private Scanner sc = new Scanner(System.in);
    private int opcion = 0;

    public void iniciarApp(){
        do {
            showMenu();
            comprobarOpcion(opcion);
        } while (opcion != 4);
    }

    private void showMenu(){
        System.out.println("==================");
        System.out.println("1. Nuevo contacto");
        System.out.println("2. Eliminar contacto");
        System.out.println("3. Mostrar todos los contactos");
        System.out.println("4. Salir del programa");
        System.out.println();
        System.out.print("Elige una opción: ");
        opcion = sc.nextInt();
    }

    private void comprobarOpcion(int opcion){
        switch (opcion){
            case 1:
                nuevoContacto();
                break;
            case 2:
                eliminarContacto();
                break;
            case 3:
                mostrarContactos();
                break;
            case 4:
                //Salimos del programa
                break;
            default:
                System.out.println("La opción elegida no es válida");
        }
    }

    private void nuevoContacto(){
        System.out.print("Introduce un DNI: ");
        long dni = sc.nextLong();
        sc.nextLine();
        System.out.print("Introduce un nombre: ");
        String nombre = sc.nextLine();
        agenda.put(dni,nombre);
    }

    private void eliminarContacto(){
        System.out.print("Introduce un DNI: ");
        long dni = sc.nextLong();

        if (agenda.containsKey(dni)){
            agenda.remove(dni);
        }else{
            System.out.println("El DNI introducido no existe en la agenda");
        }
    }

    private void mostrarContactos(){
        agenda.forEach( (a,b) -> System.out.println(a + " - " + b));
    }
}
