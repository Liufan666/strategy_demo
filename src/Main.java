import strategyImp.EatMeat;
import strategyImp.HighSpeed;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(new EatMeat(),new HighSpeed());
        System.out.println(animal.eat());
        System.out.println(animal.speed());
    }
}
