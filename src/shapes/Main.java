package shapes;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle(5),
                new Triangle(3, 4),
                new Square(6)
        };

        double totalArea = calculateTotalArea(shapes);
        System.out.println("Total area of all shapes: " + totalArea);
    }

    public static double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}
