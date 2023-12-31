abstract class Shape {
    public abstract double calculateArea();
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
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

public class MethodOverriding {
	public static void main(String[] args) {
		Shape square = new Square(5.0);
		Shape triangle = new Triangle(4.0, 3.0);
		Shape rectangle = new Rectangle(6.0, 4.0);
		
		System.out.println(square.calculateArea());
		System.out.println(triangle.calculateArea());
		System.out.println(rectangle.calculateArea());
	}
}