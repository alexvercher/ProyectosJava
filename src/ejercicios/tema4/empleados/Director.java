package ejercicios.tema4.empleados;

public class Director extends Gerente {

    private String matricula;

    public Director(String nombre, double salario, String fechaNacimiento, String departamento, String matricula) {
        super(nombre, salario, fechaNacimiento, departamento);
        this.matricula = matricula;
        this.aumentoSalario();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    protected void aumentoSalario(){
        this.setSalario(getSalario()*1.10+100);
    }
}
