public class GeometricObject {
    // private data fields
    private double dimension;

    // constructor
    public GeometricObject(double dimension) {
        setDimension(dimension);
    }

    //getter
    public double getDimension() {
        return dimension;
    }

    //setter
    public void setDimension(double dimension) {
        if(dimension <= 0) {
            throw new IllegalArgumentException(
                    "Size of Geometric object cannot be less or equal to 0!"
            );
        }
        this.dimension = dimension;
    }

    // method for calculating area
    public double calculateArea() {
        return (dimension * 2.5);
    }
}