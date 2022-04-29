public class Test {
    public static void main(String[] args) {
        // creating objects
        GeometricObject simpleObject = new GeometricObject(1);
        RectangleFromGeometricObject rectangle = new RectangleFromGeometricObject(2, 50);

        printArea(simpleObject);
        printArea(rectangle);
    }

    static void printArea(GeometricObject geometricObject) {
        System.out.println(geometricObject.calculateArea());
    }
}