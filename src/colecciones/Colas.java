package colecciones;

import java.util.PriorityQueue;

public class Colas {
    public static void main(String[] args) {

        PriorityQueue<Integer> cola = new PriorityQueue<>();

        cola.add(20);
        cola.add(30);
        cola.add(10);
        cola.add(50);
        cola.add(80);

        while (cola.size()>0){
            System.out.println(cola.poll());
        }
    }
}
