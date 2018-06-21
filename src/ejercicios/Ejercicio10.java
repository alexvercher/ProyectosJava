package ejercicios;

public class Ejercicio10 {
    public static void main(String[] args) {

        double num1 = Math.random() * 100;
        double num2 = Math.random() * 100;
        int num1int = 0;
        int num2int = 0;
        int nummayor = 0;
        int nummenor = 0;

        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);

        num1int = (int) Math.floor(num1);
        num2int = (int) Math.floor(num2);

        if (num1int >= num2int){
            nummayor = num1int;
            nummenor = num2int;
        }else{
            nummayor = num2int;
            nummenor = num1int;
        }

        while (nummayor >= nummenor){
            System.out.println(nummenor);
            nummenor++;
        }
    }
}
