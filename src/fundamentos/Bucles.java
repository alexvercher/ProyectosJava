package fundamentos;

public class Bucles {

    public static void main(String[] args) {

        //BUCLE FOR
        // for (inicialización; condicion; incremento)
        /*for (int i=0;i<10;i++){
            System.out.println("Contador: " + i);
        }*/

        //BUCLE FOREACH
        /*int[] ArrayEnteros = {1,2,3,4,5,6,7,8,9};
        for (int a: ArrayEnteros){
            System.out.println(a);
        }*/

        //BUCLE WHILE / DO WHILE
        int i = 0;
        int j = 0;
        int[] ArrayEnteros = {1,2,3,4,5,6,7,8,9};

        while (i<ArrayEnteros.length){
            System.out.println("I vale: " + i++);
            //i++;
        }

        do {
            System.out.println("J vale: " + j);
            j++;
        } while (j<ArrayEnteros.length);
    }
}
