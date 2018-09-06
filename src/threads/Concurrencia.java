package threads;

import threads.hilos.HiloPropio;
import threads.hilos.HiloRunnable;

public class Concurrencia {
    public static void main(String[] args) {

       /* long inicio = System.currentTimeMillis();

        HiloPropio hilo = new HiloPropio();
        hilo.start();

        for (int i = 0; i < 100; i++){
            System.out.println("Vuelta del main: " + i);
        }

        long fin = System.currentTimeMillis();

        System.out.println("Tiempo total de ejecución: " + (fin-inicio));*/

        /*HiloRunnable hr = new HiloRunnable();
        Thread hilo = new Thread(hr);
        hilo.start();*/

        Runnable run = () -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("Se ejecuta el hilo: " + Thread.currentThread().getName() + "vuelta: " + i);
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }
}
