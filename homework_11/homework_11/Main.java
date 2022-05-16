package homework_11;

public class Main {
    public static void main(String[] args) {
        String[] ingredients = {"potato", "garlic", "paprika", "tomato"};

        IInstrument shredder = new Shredder();
        shredder.process(ingredients);

        System.out.println();

        InstrumentHeater oven = new Oven(220, "LG");
        oven.process(ingredients);
    }
}