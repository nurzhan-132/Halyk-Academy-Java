public class RectangleFromGeometricObject extends GeometricObject {
    // private data fileds
    private double height;

    // constructor
    public RectangleFromGeometricObject(double dimension ,double height) {
        super(dimension);
        setHeight(height);
    }

    // getter
    public double getHeight() {
        return height;
    }

    // setter
    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException(
                    "Size of Geometric object cannot be less or equal to 0!"
            );
        }
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return height * getDimension();
    }
}
