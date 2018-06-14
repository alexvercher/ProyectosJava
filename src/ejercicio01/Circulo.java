package ejercicio01;

public class Circulo {

    private double radio;
    private double area;
    private double perimetro;

    public Circulo (double radio){
        area = Math.PI * (radio * radio);
        perimetro = 2 * Math.PI * radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
/*public double calcularArea (double radio){
        area = Math.PI * (radio * radio);
        return area;
    }

    public double calcularPerimetro (double radio){
        perimetro = 2 * Math.PI * radio;
        return perimetro;
    }*/
}
