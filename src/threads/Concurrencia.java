package threads;

import threads.hilos.HiloPropio;

public class Concurrencia {
    public static void main(String[] args) {

        long inicio = System.currentTimeMillis();

        HiloPropio hilo = new HiloPropio();
        hilo.start();

        for (int i = 0; i < 100; i++){
            System.out.println("Vuelta del main: " + i);
        }

        long fin = System.currentTimeMillis();

        System.out.println("Tiempo total de ejecución: " + (fin-inicio));
    }
}
