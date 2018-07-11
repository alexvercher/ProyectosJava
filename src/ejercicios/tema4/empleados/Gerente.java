package ejercicios.tema4.empleados;

public class Gerente extends Empleado{

    private String departamento;

    public Gerente(String nombre, double salario, String fechaNacimiento, String departamento) {
        super(nombre, salario, fechaNacimiento);
        this.departamento = departamento;
        this.aumentoSalario();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void aumentoSalario(){
        this.setSalario(this.getSalario()*1.05);
    }

    /*
    public void aumentoSalario2(double salario){
        this.setSalario(salario*1.05);
    }

    public double aumentoSalario3(double salario){
        return salario * 0.05;
    }

    public double aumentoSalario4(double salario){
        return salario + (salario * 0.05);
    }*/
}
