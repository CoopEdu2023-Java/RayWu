package unit1;

 class abc {
    public static int third(int[] arr) {
        return arr[arr.length - 3];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 17, 4, 5};
        System.out.println(third(arr));
    }
}