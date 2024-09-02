interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor to initialize length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        return length * width;
    }
}

class Circle implements Shape {
    private double radius;
    private double circumference;
    public Circle(double radius, double circumference) {
        this.radius = radius;
        this.circumference = circumference;
    }
    public double getArea() {
        return radius * radius * 3.14;
    }
}

class Triangle implements Shape {
    private double base;
    private double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getArea() {
        return 0.5 * base * height;
    }
}