package strategyImp;

import strategy.EatingStrategy;

public class EatGrass implements EatingStrategy {
    @Override
    public String eating() {
        return "eat meat";
    }
}
