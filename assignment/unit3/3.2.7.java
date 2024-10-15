class InputRoot {
    public int sum(int[] root, int low, int high) {
        int sum = 0;
        for(int i = 0; i < root.length; i++) {
            if(root[i] > low && root[i] < high) {
                sum += root[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {

    }
}