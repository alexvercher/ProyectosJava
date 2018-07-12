package ejercicios.tema4.empleados;

public class Director extends Gerente {

    private String matricula;

    public Director(String nombre, double salario, String fechaNacimiento, String departamento, String matricula) {
        super(nombre, salario, fechaNacimiento, departamento);
        this.matricula = matricula;
        this.aumentoSalarioDirector();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void aumentoSalarioDirector(){
        this.setSalario(getSalario()*1.10+100);
    }
}
