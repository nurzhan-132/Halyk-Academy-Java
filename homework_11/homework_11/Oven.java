package homework_11;

public class Oven extends InstrumentHeater {

    private String ovenModel;

    public Oven(double temperature, String ovenModel) {
        super(temperature);
        this.ovenModel = ovenModel;
    }

    public String getOvenModel() {
        return ovenModel;
    }

    @Override
    public void process(String[] ingredients) {
        super.process(ingredients);
        System.out.println("Oven's model is: " + ovenModel);
    }
}
