package homework_11;

public class Shredder implements IInstrument {
    @Override
    public void process(String[] ingredients) {
        for (int i = 0; i < ingredients.length; i++) {
            System.out.println(ingredients[i] + " shredded");
        }
    }
}
