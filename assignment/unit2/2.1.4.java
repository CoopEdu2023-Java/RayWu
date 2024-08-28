class Circle{
    private int radius = 5;
    private double cauculateArea() {
        return radius * radius * 3.14;
    }
    private double cauculatePerimeter() {
        return radius * 2 * 3.14;
    }
    private double cauculateArea(int ratio) {
        return radius * radius * 3.14 * ratio;
    }
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.cauculateArea());
        System.out.println(circle.cauculatePerimeter());
        System.out.println(circle.cauculateArea(2));
    }
}