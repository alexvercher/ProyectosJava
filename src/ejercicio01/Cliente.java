/*
    Calcular el árema y el perímetro de un círculo
 */

package ejercicio01;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {

        double radio = 0;
        double area;
        double perimetro;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el radio: ");
        radio = sc.nextDouble();
        Circulo circulo = new Circulo(radio);

        //circulo.setRadio(radio);
        area = circulo.getArea();
        perimetro = circulo.getPerimetro();

        //area = circulo.calcularArea(radio);
        //perimetro = circulo.calcularPerimetro(radio);

        System.out.println("El área calculada es: " + area);
        System.out.println("El perímetro calculado es: " + perimetro);
    }
}
