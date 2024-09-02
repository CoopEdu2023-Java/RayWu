class Shapes {
    public int getArea(int length, int width) {
        return 1;
    }
}

class rectangle extends Shapes {
    @Override
    public int getArea(int width, int length) {
        return width * length;
    }
}