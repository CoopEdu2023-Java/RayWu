package unit1;

class multiply {
    public static void table() {
        for (int q = 1; q <= 10; q++) {
            for (int s = 1; s <= 10; s++) {
                System.out.println(String.format("%d * %d = %d", q, s, q * s));
            }
        }
    }
    public static void main(String[] args) {
        table();
    }
}