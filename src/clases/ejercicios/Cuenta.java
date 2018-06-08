package clases.ejercicios;

public class Cuenta {
    private double balance;

    public void ingreso(double cantidad){
        balance += cantidad;
    }

    public void reintegro(double cantidad){
        balance -= cantidad;
    }

    public void transferencia(double cantidad){
        balance -= cantidad;
    }

    public void setBalance (double cantidad){
        balance = cantidad;
    }

    public double getBalance(){
        return balance;
    }
}
