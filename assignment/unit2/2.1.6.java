class Shape {
    public int getArea(int length, int width) {
        return 1;
    }
}

class rectangle extends Shape {
    @Override
    public int getArea(int width, int length) {
        return width * length;
    }
}