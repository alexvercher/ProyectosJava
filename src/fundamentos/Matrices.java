package fundamentos;

public class Matrices {

    int[] numeros = new int[5];
    int numeros2[] = new int[10];
    static int[] otrosNumeros = {1,2,3,4,5};

    public static void main(String[] args) {
        System.out.println(otrosNumeros[1]);
        otrosNumeros[1] = 3;
        int size = otrosNumeros.length;
        System.out.println(size);

        String saludos = "hola";
        System.out.println(saludos.length());

        // ARRAYS DE VARIAS BIDIMENSIONES
        System.out.println("ARRAYS BIDIMENSIONALES");
        int[][] arrayBidimensional = new int[2][4];
        int[] array2[] = new int[2][4];
        int array3[][] = new int[2][4];
        int[][] arrayEjemplo = {{0,1,2,3},{2,1,5,4}};
        System.out.println(arrayEjemplo[1][2]);

        // ARRAYS DE TRIDIMENSIONALES
        System.out.println("ARRAYS TRIDIMENSIONALES");
        int[][][] arrayTri = {{{1,2},{3,4}}, {{5,6},{7,8}}};
        int[][][] arrayTri2 = new int[2][2][2];
        System.out.println(arrayTri[0][0][1]);
    }

}
