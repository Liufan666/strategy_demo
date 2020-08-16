package strategyImp;

import strategy.SpeedStrategy;

public class LowSpeed implements SpeedStrategy {
    @Override
    public String speed() {
        return "speed is slow";
    }
}
