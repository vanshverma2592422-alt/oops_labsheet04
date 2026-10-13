package labsheet04;

abstract class Shape {
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Question14ShapeHierarchy {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 3);
        Shape circle = new Circle(2);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Circle area: " + circle.calculateArea());
    }
}