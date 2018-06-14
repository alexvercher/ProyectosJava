package constructores;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Pincher");
        Animal animal2 = new Animal("Carlino", 4);

        animal.setRaza("Chihuahua");
        System.out.println(animal.getRaza());
        System.out.println(animal2.getRaza() + " " + animal2.getNumeroPatas());
    }
}
