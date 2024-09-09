class ArrayList {
    private int[] data;
    private int size;

    public ArrayList(int capacity) {
        this.data = (int[]) new int[capacity];
        this.size = 0;
    }
}