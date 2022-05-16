package homework_11;

import java.util.Arrays;

public abstract class InstrumentHeater implements IInstrument {
    private double temperature;

    public InstrumentHeater(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public void process(String[] ingredients) {
        System.out.println(Arrays.toString(ingredients) + "  processed with temperature: " + temperature);

    }
}

