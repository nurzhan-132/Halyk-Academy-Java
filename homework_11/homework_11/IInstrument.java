package homework_11;

import java.util.Arrays;

public interface IInstrument {
    default void process(String[] ingredients) {
        System.out.println("Ingredients: " + Arrays.toString(ingredients));
    }
}
