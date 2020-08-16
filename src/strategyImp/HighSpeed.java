package strategyImp;

import strategy.SpeedStrategy;

public class HighSpeed implements SpeedStrategy {
    @Override
    public String speed() {
        return "speed is fast";
    }
}
