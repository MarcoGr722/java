import java.util.List;


abstract class Shape {

    abstract double getArea();
}

// підклас циркл, який реаліз гет ареа
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius; // Формула площі круга: π * r^2
    }
}

// Підклас рестангл, який реалізує  гет ареа
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }
}

public class ShapeAreaCalculator {
    //  підрах загал площі всіх форм у списку
    public static double calculateTotalArea(List<? extends Shape> shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea(); // дод площу кожної форми до загал площі
        }
        return totalArea;
    }

    public static void main(String[] args) {
        // приклад використ з різними формами
        List<Shape> shapes = List.of(new Circle(5), new Rectangle(4, 6), new Circle(3));

        // підрах загал площі всіх форм
        double totalArea = calculateTotalArea(shapes);
        System.out.println("Загальна площа всіх форм: " + totalArea);
    }
}
