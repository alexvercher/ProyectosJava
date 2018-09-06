package ejercicios.tema7;

import ejercicios.tema7.ejercicio2.Cronometro;

public class Main {

    public static void main(String[] args) {


        /*Runnable logica = () -> {
            int segundos = 0;
            int minutos = 0;
            int horas = 0;

            try {
                    while (true) {
                        Thread.sleep(1000L);
                        ++segundos;

                        if (segundos == 60){
                            segundos = 0;
                            ++minutos;
                        }

                        if (minutos == 60){
                            minutos = 0;
                            ++horas;
                        }

                        if (horas == 24){
                            horas = 0;
                        }
                        System.out.println(String.format("%02d:%02d:%02d", horas, minutos, segundos));

                    }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread cronometro = new Thread(logica);
        cronometro.start();*/

        Cronometro crono = new Cronometro();
        Thread hilo = new Thread(crono);
        hilo.start();
        crono.setSemaforo(true);

        int contador = 0;

        for(;;){
            try {
                Thread.sleep(1000L);
                ++contador;
                if (contador == 7) {
                    crono.setSemaforo(false);
                } else if (contador == 10){
                    crono.setSemaforo(true);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
