package kz.halykacademy.main;

// importing Rectangle class from another package
import kz.halykacamedy.dz.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle defaultRectangle = new Rectangle();
        System.out.println(defaultRectangle.toString());

        defaultRectangle.setWidth(10); // calling setter
        defaultRectangle.setHeight(15);

        System.out.println("After setting width and height for defualt rectangle: "
                            + defaultRectangle.getHeight() + ", "
                            + defaultRectangle.getWidth());

        System.out.println("--------------------------------------------------");

        Rectangle rectangle1 = new Rectangle(45,50);
        System.out.println("New rectangle:\n" + rectangle1.toString());
    }
}
