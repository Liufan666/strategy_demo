import strategy.EatingStrategy;
import strategy.SpeedStrategy;

public class Animal {
    EatingStrategy eatingStrategy;
    SpeedStrategy speedStrategy;

    public Animal(EatingStrategy eatingStrategy, SpeedStrategy speedStrategy) {
        this.eatingStrategy = eatingStrategy;
        this.speedStrategy = speedStrategy;
    }

    public String eat(){
        return eatingStrategy.eating();
    }

    public String speed(){
        return speedStrategy.speed();
    }
}
