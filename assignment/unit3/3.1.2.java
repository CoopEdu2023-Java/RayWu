class BinarySearch {
    public int search(int target, int[] nums) {
        for (int i:nums) {
            if (i == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        BinarySearch obj = new BinarySearch();
        System.out.println(obj.search(9, array));
    }
}