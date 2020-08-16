package strategyImp;

import strategy.EatingStrategy;

public class EatMeat implements EatingStrategy {
    @Override
    public String eating() {
        return "eat meat";
    }
}
