package kz.halykacamedy.dz;

public class Rectangle {
    // private data fields
    private double width;
    private double height;

    // default constructor
    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    // constructor with parameters
    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    // getters and setters for width and height
    public double getWidth() {
        System.out.println("Getter for width was called");
        return width;
    }

    public void setWidth(double width) {
        if(width <= 0) {
            throw new IllegalArgumentException("Value for width must be greater than 0!");
        }
        this.width = width;
    }

    public double getHeight() {
        System.out.println("Getter for height was called");
        return height;
    }

    public void setHeight(double height) {
        if(height <= 0) {
            throw new IllegalArgumentException("Value for height must be greater than 0!");
        }
        this.height = height;
    }

    public double calculateArea() {
        return height * width;
    }

    public String toString() {
        return "Width: " + width + "\nHeight: " + height + "\nArea of rectangle: " + calculateArea() + "\n";
    }
}