package constructores;

public class Animal {

    private String raza;
    private Integer numeroPatas;

    public Animal(String animal){
        setRaza(animal);
    }

    public Animal (String raza, Integer numeroPatas){
        super();
        setRaza(raza);
        setNumeroPatas(numeroPatas);
    }

    public Animal(){
        super();
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(Integer numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
}
